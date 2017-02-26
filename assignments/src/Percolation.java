import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    WeightedQuickUnionUF grid;
    public Percolation(int n)  {
        //if (i <= 0 || i > n) throw new IndexOutOfBoundsException("row index i out of bounds");

        int sites = n * n;
        grid = new WeightedQuickUnionUF(sites);
    }              // create n-by-n grid, with all sites blocked
    //public    void open(int row, int col)    // open site (row, col) if it is not open already
    //public boolean isOpen(int row, int col)  // is site (row, col) open?
    //public boolean isFull(int row, int col)  // is site (row, col) full?
    //public     int numberOfOpenSites()       // number of open sites
    //public boolean percolates()              // does the system percolate?

    public static void main(String[] args)   {
     Percolation percolator = new Percolation(9);
     System.out.print(percolator.grid);
    }
}
