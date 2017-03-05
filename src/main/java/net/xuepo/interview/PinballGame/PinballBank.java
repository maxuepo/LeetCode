package net.xuepo.interview.PinballGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuepo on 3/5/17.
 */
public class PinballBank {
    List<Pinball> pinballList;

    public PinballBank(int n) {
        pinballList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            pinballList.add(new Pinball());
        }
    }

    public void active(Pinball pinball) {
        if(!pinball.getStatus()) {
            pinball.active();
            if(allLit()) {
                PinballMachine.getInstance().incrementBonus();
                resetAll();
            }
        }
    }

    private void resetAll(){
        for(Pinball pinball : pinballList) {
            pinball.reset();
        }
    }

    private boolean allLit() {
        boolean flag = true;
        for(Pinball pinball : pinballList) {
            if(!(flag && pinball.getStatus())){
                return false;
            }
            flag &= pinball.getStatus();
        }
        return true;
    }
}
