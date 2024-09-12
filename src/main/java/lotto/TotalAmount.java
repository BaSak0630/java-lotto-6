package lotto;

import java.util.List;

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
    private int winningAmount;
    private double rateOfReturn;

    public TotalAmount() {
        this.buyAmount = 0;
        this.numOfLotto = 0;
        this.winningAmount = 0;
        this.rateOfReturn = 0.0;
        readBuyAmount();
    }

    public void readBuyAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        try {
            this.buyAmount = Integer.parseInt(readLine());
        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 숫자여야합니다.");
        }
        if (this.buyAmount % 1000 != 0) throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 1,000원으로 나누어 떨어지는 숫자여야합니다.");

        numOfLotto = this.buyAmount / 1000;
    }

    public int getNumOfLotto() {
        return numOfLotto;
    }

    public void getStatistics(List<WinningLotter> winningLottos) {

        for(WinningLotter winningLotter : winningLottos) {
            int reward = winningLotter.getReward();
            winningAmount += reward;
        }
        rateOfReturn = (double) winningAmount / buyAmount;
    }

    public void printStatistics(List<WinningLotter> winningLottos) {
        StringBuffer sb = new StringBuffer();
        sb.append("당첨 통계\n").append("---\n");
        int[] rankCounts= new int[Rank.values().length];
        for(WinningLotter winningLotter : winningLottos) {
            rankCounts[winningLotter.getRank() - 1]++;
        }
        sb.append(Rank.FIFTH.getCount()).append("개 일치 (").append(Rank.FIFTH.getReward()).append("원)").append(" - ").append(rankCounts[Rank.FIFTH.getRank()-1]).append("\n");
        sb.append(Rank.FOURTH.getCount()).append("개 일치 (").append(Rank.FOURTH.getReward()).append("원)").append(" - ").append(rankCounts[Rank.FOURTH.getRank()-1]).append("\n");
        sb.append(Rank.THIRD.getCount()).append("개 일치 (").append(Rank.THIRD.getReward()).append("원)").append(" - ").append(rankCounts[Rank.THIRD.getRank()-1]).append("\n");
        sb.append(Rank.SECOND.getCount()).append("개 일치, 보너스 볼 일치 (").append(Rank.SECOND.getReward()).append("원)").append(" - ").append(rankCounts[Rank.SECOND.getRank()-1]).append("\n");
        sb.append(Rank.FIRST.getCount()).append("개 일치 (").append(Rank.FIRST.getReward()).append("원)").append(" - ").append(rankCounts[Rank.FIRST.getRank()-1]).append("\n");
        sb.append("총 수익률은 ").append(rateOfReturn).append("%입니다.");

        System.out.println(sb.toString());
    }
}
