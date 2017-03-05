package net.xuepo.interview.PinballGame;

/**
 * Created by xuepo on 3/5/17.
 */
public class PinballMachine {
    private int score = 0;
    private int bonus = 0;

    public static final int _SCORE = 100;
    public static final int _BONUS = 100;

    public static final PinballMachine instance = new PinballMachine();

    private PinballMachine() {}

    public static PinballMachine getInstance() {
        return instance;
    }

    public void incrementScore(){
        this.score += _SCORE;
    }

    public void incrementBonus() {
        this.bonus += _BONUS;
    }

}
