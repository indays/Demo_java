package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 合并区间56 {


    public static void main(String[] args) {


        int[][] aa = new int[][]{{1, 3}, {2, 6},{8,10},{15,18}};

        merge(aa);
    }


    public static int[][] merge(int[][] intervals) {


        if(intervals.length == 0) {

            return new int[][]{};
        }


        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[1];
            }
        });
        int r=intervals[0][0];

        int l=intervals[0][1];

        List<int []> list = new ArrayList<>();

        int z=0;

        for (int index = 1; index < intervals.length; index++) {

            int itemR =intervals[index][0];

            int itemL = intervals[index][1];

            if(l<itemR ){

                list.add(new int[]{r,l});

                r=itemR;

                l=itemL;

                z++;


            }else {
                l=itemL;

            }

        }

        list.add(new int[]{r, l});

        int[][] aa = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {

            aa[i] = list.get(i);
        }

        return aa;




    }
}
