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
    private LottoCollection lottoCollection;
    private WinningNumber winningNumber;
    private BonusNumber bonusNumber;
    public void play() {
        totalAmount = new TotalAmount();
        totalAmount.setBuyAmount();
        lottoCollection = new LottoCollection(totalAmount.getNumOfLotto());
        lottoCollection.printLottos();
        winningNumber = new WinningNumber();
        bonusNumber = new BonusNumber();
    }
}
