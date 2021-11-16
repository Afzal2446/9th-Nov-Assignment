package Assignment5;

import java.util.Scanner;

public class PrintReverseWave {
	public static void main(String args[]) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int j=arr[0].length-1; j>=0; j--) {
				if(j%2==0) {
					int i=0;
					while(i<arr.length) {
					System.out.print(arr[i][j]+" ");
					i++;
					}
				}
				else {
					int i=arr.length-1;
					while(i>=0) {
						System.out.print(arr[i][j]+" ");
						i--;
					}
				}
			}
	}
}
