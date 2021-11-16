package Assignment5;

import java.util.Scanner;

public class PrintWaveMatrix {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
			
				arr[i][j]= sc.nextInt();
			}
		}
		
		for(int j=0; j<arr[0].length; j++) {
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
