package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Console.readLine;

/*
 * 클래스 이름 WinningNumber
 *
 * 버전 정보 V1
 *
 * 날짜 9월 8일
 *
 * 저작권 주의
 */
public class WinningNumber {
    static final int LOTTO_SIZE = 6;
    List<Integer> winningNumList = new ArrayList<>();
    public WinningNumber() {
        getWinningNumbers();
        validateWinningNumber(winningNumList);
        validatDuplication(winningNumList);
    }

    private void getWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String readLine = readLine();
        String [] numbers = readLine.split(",");
        try{
            for (int i = 0; i < LOTTO_SIZE; i++) {
                winningNumList.add(Integer.parseInt(numbers[i]));
            }
        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호는 숫자여야합니다.");
        }
        if (winningNumList.size() != LOTTO_SIZE) throw new IllegalArgumentException("[ERROR] 당첨 번호는 6개만 가능합니다.");
        System.out.println("\n");
    }

    private void validateWinningNumber(List<Integer> winningNumList) {
        for (Integer num : winningNumList) {
            if (num < 0 || num > 45) throw new IllegalArgumentException("[ERROR] 보너스 번호는 1~45사이 숫자여야합니다.");
        }
    }

    private void validatDuplication(List<Integer> winningNumList){
        Set<Integer> duplicateSet = new HashSet<>(winningNumList);

        if(duplicateSet.size()!= winningNumList.size()) throw new IllegalArgumentException("[ERROR] 당첨 번호는 중복을 허용하지 않습니다.");
    }

}
