package lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 클래스 이름 Lotto
 *
 * 버전 정보 V1
 *
 * 날짜 9월 6일
 *
 * 저작권 주의
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        validateRange(numbers);
        validateDuplication(numbers);
    }

    private void validateRange(List<Integer> numbers) {
        for (Integer num : numbers) {
            if (num < 0 || num > 45) throw new IllegalArgumentException("[ERROR] 보너스 번호는 1~45사이 숫자여야합니다.");
        }
    }

    private void validateDuplication(List<Integer> numbers){
        Set<Integer> duplicateSet = new HashSet<>(numbers);

        if(duplicateSet.size()!= numbers.size()) throw new IllegalArgumentException("[ERROR] 당첨 번호는 중복을 허용하지 않습니다.");
    }

    public String toString() {
        return numbers.toString();
    }

    public Rank getRank(WinningNumber winningNumber, BonusNumber bonusNumber) {
        boolean bonus = false;
        int matchingCount = winningNumber.getMatchingCount(numbers);
        if(matchingCount == 5) {
            bonus = bonusNumber.isBonus(numbers);
        }
        boolean finalBonus = bonus;

        return Arrays.stream(Rank.values())
                .filter(rank -> rank.getResult(matchingCount, finalBonus))
                .findFirst()
                .orElse(Rank.NON);
    }
}
