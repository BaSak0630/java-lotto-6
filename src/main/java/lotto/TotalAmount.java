package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;

/*
 * 클래스 이름 TotalAmount
 *
 * 버전 정보 V1
 *
 * 날짜 9월 6일
 *
 * 저작권 주의
 */
public class TotalAmount {
    private int buyAmount;
    private int numOfLotto;
    private int totalBuyAmount;
    private int winningAmount;
    private double rateOfReturn;

    public TotalAmount() {
        this.buyAmount = 0;
        this.numOfLotto = 0;
        this.totalBuyAmount = 0;
        this.winningAmount = 0;
        this.rateOfReturn = 0.0;
    }

    public void setBuyAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        try {
            this.buyAmount = Integer.parseInt(readLine());
        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 숫자여야합니다.");
        }
        if (this.buyAmount % 1000 != 0) throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 1,000원으로 나누어 떨어지는 숫자여야합니다.");

        numOfLotto = this.buyAmount / 1000;
    }
}
