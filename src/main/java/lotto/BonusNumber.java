package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;
/*
 * 클래스 이름 BonusNumber
 *
 * 버전 정보 V1
 *
 * 날짜 9월 9일
 *
 * 저작권 주의
 */
public class BonusNumber {
    private int number;
    public BonusNumber() {
        getNumber();
        validate(number);
    }

    private void validate(int number) {
        if (number < 0 || number > 45) throw new IllegalArgumentException("[ERROR] 보너스 번호는 1~45사이 숫자여야합니다.");
    }

    public void getNumber() {
        int num;
        System.out.println("보너스 번호를 입력해 주세요.");

        try {
            num = Integer.parseInt(readLine());
            this.number = num;
        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 숫자여야합니다.");
        }

        System.out.println("\n");
    }
}
