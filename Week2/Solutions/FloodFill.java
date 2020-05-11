class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        boolean[][] visited = new boolean[image.length][image[sr].length];
        int oldColor = image[sr][sc];
        paint(image, sr, sc, newColor, oldColor, visited);
        return image;

    }
    public void paint(int[][] image, int sr, int sc, int newColor, int oldColor, boolean[][] visited)
    {
        if(sr<0 || sr>=image.length ||sc<0 || sc>=image[sr].length || visited[sr][sc]==true)
        {
            return;
        }
        visited[sr][sc]=true;
        if(image[sr][sc]==oldColor)
        {
            image[sr][sc]=newColor;
        }
        else
        {
            return;
        }
        paint(image,sr-1,sc,newColor,oldColor,visited);
        paint(image,sr+1,sc,newColor,oldColor,visited);
        paint(image,sr,sc-1,newColor,oldColor,visited);
        paint(image,sr,sc+1,newColor,oldColor,visited);
    }
}