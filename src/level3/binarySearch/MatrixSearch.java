
/*
Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

        Integers in each row are sorted from left to right.
        The first integer of each row is greater than or equal to the last integer of the previous row.

Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem

 */
package binarySearch;

public class MatrixSearch {
	
public static void main(String[] args) {
	int mat[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50} };

			search(mat,10);
			//System.out.println(res);
}
private static void search(int[][] mat,  int item) {
	int n=mat.length;
	int m=mat[0].length;
	int l=0,r=n*m-1;
	while(l<=r)
	{
		int mid=l+(r-l)/2;
		if (mat[mid/m][mid%m]==item)
		{
			System.out.println("true");
		}
		else if(mat[mid/m][mid%m]<item)
		{
			l=mid+1;
		}
		else
		{
			r=mid-1;
		}
	}
	System.out.println("not found");
	
	return ;
}
}
