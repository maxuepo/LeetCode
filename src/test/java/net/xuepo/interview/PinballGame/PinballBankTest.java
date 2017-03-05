package net.xuepo.interview.PinballGame;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

/**
 * Created by xuepo on 3/5/17.
 */
public class PinballBankTest extends PinballBank {
    public PinballBankTest() {
        super(2);
    }

    @Test
    public void test01() {
        List<Pinball> pinballs = this.pinballList;
        Assert.assertEquals(PinballMachine.getInstance().getBonus(), 0);
        Assert.assertEquals(PinballMachine.getInstance().getScore(), 0);
        active(pinballs.get(0));
        Assert.assertEquals(PinballMachine.getInstance().getBonus(), 0);
        Assert.assertEquals(PinballMachine.getInstance().getScore(), 100);
        active(pinballs.get(1));
        Assert.assertEquals(PinballMachine.getInstance().getBonus(), 100);
        Assert.assertEquals(PinballMachine.getInstance().getScore(), 200);
    }
}
