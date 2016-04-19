package net.xuepo.interview;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by xuepo on 4/18/16.
 */
public class IdleMachineTime {

    class Interval{

        int start;
        int end;

        public Interval(){
            start = 0;
            end = 0;
        }

        public Interval(int a, int b) {
            this.start = a;
            this.end = b;
        }

        public Interval(int[] a) {
            this.start = a[0];
            this.end = a[1];
        }

        public Interval(Interval i1) {
            this.start = i1.start;
            this.end = i1.end;
        }

        public String toString() {
            return "start: " + start + "; end: " + end +".";
        }
    }

    public List<Interval> getIdelIntervals(List<Interval> reserved) {


        List<Interval> mergedInterval = mergeInterval(reserved);


        int start = 0;
        int end = 23;
        List<Interval> res = new ArrayList<>();

        for (Interval it : mergedInterval) {
            if (start < it.start) {
                res.add(new Interval(start, it.start));
                start = it.end;
            }
        }

        if (start < 23) {
            res.add(new Interval(start, 23));
        }

        return res;

    }


    public List<Interval> mergeInterval(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        List<Interval> res = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            if(res.isEmpty() || res.get(res.size() - 1).end < intervals.get(i).start) {
                res.add(new Interval(intervals.get(i)));
            } else {
                res.get(res.size() - 1).end = Math.max(res.get(res.size() - 1).end, intervals.get(i).end);
            }
        }
        return res;
    }


}
