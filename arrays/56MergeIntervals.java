class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0]-i2[0]);
        
        List<int[]> output = new ArrayList<>();
        
        int[] newInterval = intervals[0];
        //output.add(newInterval);
        
        
        for(int i=0;i<intervals.length;i++)
        {
           if(newInterval[1]>=intervals[i][0])
           {
               newInterval[1]=Math.max(newInterval[1], intervals[i][1]);
           }
            else
            {
                output.add(newInterval);
                newInterval=intervals[i];
            }
        }
        output.add(newInterval);
        
        return output.toArray(new int[output.size()][]);
        
    }
}
