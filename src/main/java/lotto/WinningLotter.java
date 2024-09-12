package lotto;

/*
 * 클래스 이름 WinningLotter
 *
 * 버전 정보 V1
 *
 * 날짜 9월 12일
 *
 * 저작권 주의
 */
public class WinningLotter {
    private Lotto lotto;
    private Rank rank;
    public WinningLotter(Lotto lotto, Rank rank) {
        this.lotto = lotto;
        this.rank = rank;
    }

    public int getReward() {
        return rank.getReward();
    }

    public int getRank() {
        return rank.getRank();
    }
}
