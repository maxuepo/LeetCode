package net.xuepo.interview;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/19/16.
 */
public class IdleMachineTimeTest extends IdleMachineTime {
    @Test
    public void testGetIdelIntervals() throws Exception {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(3,4));
        List<Interval> output = this.getIdelIntervals(input);
        System.out.println(output);
    }
}