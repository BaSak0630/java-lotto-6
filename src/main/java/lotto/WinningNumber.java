package lotto;

import java.util.ArrayList;
import java.util.List;

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
        validateWinningNumber();
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
    }

    private void validateWinningNumber() {
        for (Integer num : winningNumList) {
            if (num < 0 || num > 45) throw new IllegalArgumentException("[ERROR] 보너스 번호는 1~45사이 숫자여야합니다.");
        }
    }

}
