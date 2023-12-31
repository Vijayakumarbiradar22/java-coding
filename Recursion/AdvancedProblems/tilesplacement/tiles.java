package Recursion.AdvancedProblems.tilesplacement;

public class tiles {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;
        }

        //horizontal placement
        int horizontal = placeTiles(n-m,m);

        //vertical placement
        int vertical = placeTiles(n-1,m);

        return horizontal+vertical;
    }
    public static void main(String args[]){
        int n=4;
        int m=2;
        int result = placeTiles(n,m);
        System.out.println(result);
    }
    
}
