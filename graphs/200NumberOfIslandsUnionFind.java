class Solution 
{
    public int numIslands(char[][] grid) 
    {
        if(grid == null || grid.length==0 || grid[0].length ==0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;
        UnionFind uf = new UnionFind(m*n);
        int zeroCount = 0;
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(grid[i][j]=='0')
                {
                    zeroCount++;
                }
                else
                {
                    if(i-1>=0 && grid[i-1][j]=='1')
                    {
                        uf.union(i*n+j, (i-1)*n+j);
                    }
                    if(j-1>=0 && grid[i][j-1]=='1')
                    {
                        uf.union(i*n+j, i*n+j-1);
                    }
                }
            }
        }
        //System.out.println("map is "+uf.leader);
        System.out.println("zero count id "+zeroCount+ " and count is"+uf.count);
        return uf.count - zeroCount;



    }
}

class UnionFind
{
    public Map<Integer, Integer> leader ;
    public Map<Integer, Integer> rank ;
    int count = 0;

    public UnionFind(int n)
    {
        leader = new HashMap<>();
        rank = new HashMap<>();
        
        for(int i=0 ; i<n ; i++)
        {
           leader.put(i, i);
           rank.put(i,1);
        }

        count=n;
    }

    public boolean union(int n1, int n2)
    {
        int n1Leader = find(n1);
        int n2Leader = find(n2);

        if(n1Leader == n2Leader)
            return true;
        
        //System.out.println("unifying "+ n1 + " and "+n2);
        if(rank.get(n2Leader) > rank.get(n1Leader))
        {
            int temp = n2Leader;
            n2Leader = n1Leader;
            n1Leader = temp;
        }

        leader.put(n2Leader, n1Leader);
        rank.put(n1Leader, rank.get(n2Leader) + rank.get(n1Leader));
        count--;

        return false;
    }

    public int find(int n1)
    {
        if(n1 != leader.get(n1))
        {
            int rootLeader = find(leader.get(n1));
            leader.put(n1, rootLeader);
            return rootLeader;

        }
        return n1;
        

    }
}
