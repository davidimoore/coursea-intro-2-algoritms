import edu.princeton.cs.algs4.WeightedQuickUnionUF;

import java.util.Arrays;

public class Percolation {
    WeightedQuickUnionUF grid[];

    public Percolation(int n)  {
        if (n <= 0) {
            throw new java.lang.IllegalArgumentException("you must instantiate using a number greater than 0");
        }

        int gridSize = n * n;
        grid = new WeightedQuickUnionUF[gridSize];

        for(int i = 0; i < gridSize; i ++) {
            WeightedQuickUnionUF site = new WeightedQuickUnionUF(i);
            grid[i] = site;
        }

    }

/*    public void open(int row, int col)  {
        // open site (row, col) if it is not open already
        int[] site = siteCoordinates(row, col);
        int siteRow = site[0];
        int siteCol = site[1];


    }*/

/*    public boolean isOpen(int row, int col) {

    int[] site = siteCoordinates(row, col);
    int siteRow = site[0];
    int siteCol = site[1];

    }*/

/*    public boolean isFull(int row, int col)  {
        int[] site = siteCoordinates(row, col);
        int siteRow = site[0];
        int siteCol = site[1];


    }*/
    //public     int numberOfOpenSites()       // number of open sites
    //public boolean percolates()              // does the system percolate?

    public static void main(String[] args) {
     int gridSize = 2;
     int rowToChange = 1;
     int columnToChange = 1;

     Percolation percolator = new Percolation(gridSize);
     System.out.println(Arrays.deepToString(percolator.grid));

/*     percolator.open(rowToChange,columnToChange);
     System.out.println(Arrays.deepToString(percolator.grid));

     System.out.println(percolator.isOpen(rowToChange,columnToChange));*/

    }

    private int[] siteCoordinates(int row, int col){
        int adjustedRow = row -1;
        int adjustedCol = col -1;

        if (isOutOfBounds(adjustedRow, adjustedCol)) {
            throw new java.lang.IllegalArgumentException("you must instantiate using a number greater than 0");
        }


        int[] adjustedCoordinates = new int[2];
        adjustedCoordinates[0] = adjustedRow;
        adjustedCoordinates[1] = adjustedCol;

        return adjustedCoordinates;

    }

    private boolean isOutOfBounds(int row, int col){
        int gridBoundary = grid.length - 1;
        return (row < 0 || col < 0 || row > gridBoundary || col > gridBoundary);
    }


}
