package net.xuepo.interview.PinballGame;

/**
 * Created by xuepo on 3/5/17.
 */
public class Pinball {
    private boolean lit = false;
    public void active(){
        if(!lit) {
            lit = true;
            PinballMachine.getInstance().incrementScore();
        }
    }

    public void reset() {
        lit = false;
    }

    public boolean getStatus(){
        return lit;
    }
}
