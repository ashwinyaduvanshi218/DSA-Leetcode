class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] b=new char[n][n];
        for(char[] r:b)Arrays.fill(r,'.');
        dfs(b,0);
        return res;
    }
    void dfs(char[][] b,int r){
        if(r==b.length){
            List<String> t=new ArrayList<>();
            for(char[] x:b)t.add(new String(x));
            res.add(t);
            return;
        }
        for(int c=0;c<b.length;c++){
            if(valid(b,r,c)){
                b[r][c]='Q';
                dfs(b,r+1);
                b[r][c]='.';
            }
        }
    }
    boolean valid(char[][] b,int r,int c){
        for(int i=0;i<r;i++)if(b[i][c]=='Q')return false;
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--)if(b[i][j]=='Q')return false;
        for(int i=r-1,j=c+1;i>=0&&j<b.length;i--,j++)if(b[i][j]=='Q')return false;
        return true;
    }
}