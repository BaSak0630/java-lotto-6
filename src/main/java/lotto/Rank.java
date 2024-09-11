package lotto;

import java.util.function.BiFunction;

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
    FIRST(6,false, 2000000000, (count,bonus) -> count == 6),
    SECOND(5,true,30000000,(count,bonus) -> count == 5 && bonus),
    THIRD(5,false,1500000, (count,bonus) -> count == 5 && !bonus),
    FOURTH(4,false,50000, (count,bonus) -> count == 4),
    FIFTH(3,false,5000, (count,bonus) -> count == 3),
    NON(0,false,0, (count,bonus) -> count <= 2);

    private final int count;
    private final boolean bonus;
    private final int reward;
    private final BiFunction<Integer,Boolean, Boolean> function;

    Rank(int count, boolean bonus, int reward, BiFunction<Integer, Boolean, Boolean> function) {
        this.count = count;
        this.bonus = bonus;
        this.reward = reward;
        this.function = function;
    }

    public int getCount() {
        return count;
    }

    public boolean isBonus() {
        return bonus;
    }

    public int getReward() {
        return reward;
    }

    public Boolean getResult(int count, boolean bonus) {
        return function.apply(count,bonus);
    }
}
