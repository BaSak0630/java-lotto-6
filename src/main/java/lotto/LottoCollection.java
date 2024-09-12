package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 이름 LottoCollection
 *
 * 버전 정보 V1
 *
 * 날짜 9월 6일
 *
 * 저작권 주의
 */
public class LottoCollection {
    private List<Lotto> lottos;
    private List<WinningLotter> winningLotters;
    public LottoCollection(int numOfLottos) {
        lottos = new ArrayList<>();
        winningLotters = null;

        System.out.println(numOfLottos + "개를 구매했습니다.");
        for (int i = 0; i <numOfLottos; i++) {
            lottos.add(new Lotto(makeRandomNumber()));
        }
    }

    private List<Integer> makeRandomNumber() {
        List<Integer> randomNumber = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        randomNumber.sort(Integer::compareTo);

        return randomNumber;
    }


    public void printLottos() {
        for(Lotto lotto : lottos) {
            System.out.println(lotto.toString());
        }
        System.out.println();
    }

    public void compareWinningNumAndBonusNum(WinningNumber winningNumber, BonusNumber bonusNumber) {
        for(Lotto lotto : lottos) {
            Rank rank = lotto.getRank(winningNumber, bonusNumber);
            winningLotters.add(new WinningLotter(lotto, rank));
        }
    }
}
