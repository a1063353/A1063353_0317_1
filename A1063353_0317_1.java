import java.util.Scanner;
public class A1063353_0317_1 {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("請輸入 n 值：");
	        int n = scanner.nextInt();
	        System.out.print("請輸入 m 值：");
	        int m = scanner.nextInt();
	        
	        int[][] array = new int[n][m];
	        
	        for(int i=0; i<n; i++) {
	            for(int j=0; j<m; j++) {
	                array[i][j] = (i+1)*(j+1);
	            }
	        }
	        
	        System.out.println("二維數組：");
	        for(int[] row : array) {
	            for(int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
	}
