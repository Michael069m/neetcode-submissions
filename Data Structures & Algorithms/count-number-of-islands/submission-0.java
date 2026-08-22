class Solution {
    public void bfs(int i,int j, int[][] vis,char[][] grid){
        int n = vis.length;
        int m = vis[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j] = 1;
        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            Pair p = q.poll();
            for(int[] dir : dirs){
                int u = p.x + dir[0];
                int v = p.y + dir[1];
                if(u>=0 && v >=0 && u<n && v < m && grid[u][v]=='1' && vis[u][v]==0){
                    q.add(new Pair(u,v));
                    vis[u][v] = 1;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;

        for(int i =0 ;i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(grid[i][j] == '1' && vis[i][j]==0){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
}
class Pair{
    int x, y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}