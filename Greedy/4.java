import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		
		while (N != 1) {
			if( 0 == N % K) {
				N /= K;
				cnt++;
			}
			else {
				N -= 1;
				cnt++;
			}
							
		}
		
		System.out.println(cnt);

	}

}
