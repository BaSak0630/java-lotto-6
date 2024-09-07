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
    TotalAmount totalAmount = new TotalAmount();
    LottoCollection lottoCollection;
    public void play() {
        totalAmount.setBuyAmount();
        lottoCollection = new LottoCollection(totalAmount.getNumOfLotto());
        lottoCollection.printLottos();
    }
}
