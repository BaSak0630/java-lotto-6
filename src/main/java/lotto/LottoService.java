package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;

/*
 * 클래스 이름 LottoService
 *
 * 버전 정보 V1
 *
 * 날짜 9월 6일
 *
 * 저작권 주의
 */
public class LottoService {
    private TotalAmount totalAmount;
    public void play() {
        totalAmount = new TotalAmount();
        getBuyAmount();
    }

    private void getBuyAmount() {
        System.out.println("구입금액을 입력해 주세요");
        /*try {
            buyAmount = Integer.parseInt(readLine());

        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 1,000원으로 나누어 떨어지는 숫자여야합니다.");
        }*/
    }
}
