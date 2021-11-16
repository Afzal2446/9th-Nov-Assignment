package Assignment5;

public class SpiralMatrix {
	
	public static void main(String args) {
		int arr[][]= {{1,2,3,4,5,6,7},{11,12,13,14,15,16,17},{21,23,24,25,26,27},{31,32,33,34,35,36,37}};
		int m=arr.length;
		int n=arr[0].length;
		int tc=m*n;
		int count=0;
		int minrow=0;
		int maxrow=m-1;
		int mincol=0;
		int maxcol=n-1;
		while(count<tc) {
			// for left wall
			for(int i=minrow; i<=maxrow && count<tc; i++) {
				int j=mincol;
				System.out.println(arr[i][j]);
				count++;
			}
			mincol++;
			// for bottom wall
			for(int j=mincol; j<=maxcol && count<tc; j++) {
				int i=maxrow;
				System.out.println(arr[i][j]);
				count++;
			}
			maxrow--;
			// for right wall
			for(int i=maxrow; i<=minrow && count<tc; i--) {
				int j=maxcol;
				System.out.println(arr[i][j]);
				count++;
			}
			maxcol++;
			// for top wall
			for(int j=maxcol; j<=mincol && count<tc; j--) {
				int i=minrow;
				System.out.println(arr[i][j]);
				count++;
			}
			minrow++;
		}
				
	}
}
