import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cuibowu on 2017/9/2.
 */
public class Solution56 {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1)
            return intervals;
        List<Interval> res = new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(Interval interval:intervals){
            if(interval.start<=end)
                end = Math.max(end,interval.end);
            else{
                res.add(new Interval(start,end));
                start=interval.start;
                end = interval.end;
            }
        }

        res.add(new Interval(start,end));
        return res;

    }


}
