package net.xuepo.interview.PinballGame;

/**
 * Created by xuepo on 3/5/17.
 */
public class PinballMachine {
    private int score = 0;
    private int bonus = 0;

    public static final int _SCORE = 100;
    public static final int _BONUS = 100;

    public static PinballMachine instance = null;

    private PinballMachine() {}

    public static PinballMachine getInstance() {
        synchronized (PinballMachine.class) {
            if(instance == null) {
                instance = new PinballMachine();
            }
        }
        return instance;
    }

    public void incrementScore(){
        this.score += _SCORE;
    }

    public void incrementBonus() {
        this.bonus += _BONUS;
    }

    public int getScore() {
        return this.score;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void disPlayScoreAndBonus() {
        System.out.println("bonus： " + bonus + "; score: " + score );
    }
}
