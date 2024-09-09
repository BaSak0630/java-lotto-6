package lotto;

/*
 * 클래스 이름 Rank
 *
 * 버전 정보 V1
 *
 * 날짜 9월 9일
 *
 * 저작권 주의
 */
public enum Rank {
    FIRST(6,false, 2000000000),
    SECOND(5,true,30000000),
    THIRD(5,false,1500000),
    FOURTH(4,false,50000),
    FIFTH(3,false,5000),
    NON(0,false,0);
    private final int rank;
    private final boolean bonus;
    private final int reward;

    Rank(int rank,boolean bonus, int reward) {
        this.rank = rank;
        this.bonus = bonus;
        this.reward = reward;
    }

    public int getRank() {
        return rank;
    }

    public boolean isBonus() {
        return bonus;
    }

    public int getReward() {
        return reward;
    }
}
