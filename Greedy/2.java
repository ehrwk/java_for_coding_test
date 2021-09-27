import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int answer = 0;
		
		int arr[] = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 1; i <= M; i++) {
			if( 0 == i % (K + 1)) {
				answer += arr[arr.length - 2];
			}
			else {
				answer += arr[arr.length - 1];
			}
		}
		
		System.out.print(answer);

	}

}
