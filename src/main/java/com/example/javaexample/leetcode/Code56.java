package com.example.javaexample.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56.合并区间
 * @author mw
 * @date 2022/9/8
 */
public class Code56 {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();
        int[][] merge = solution56.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        String s = Arrays.deepToString(merge);
        System.out.println(s);
    }
}

class Solution56 {
    public int[][] merge(int[][] intervals) {
        //先进行排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; ++i) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            //老区间最大值小于当前起始值，证明是新的区间
            if(merged.size()==0 || merged.get(merged.size()-1)[1] < l){
                merged.add(new int[]{l,r});
            }else{
                //否则更新老的区间最大值
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],r);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
