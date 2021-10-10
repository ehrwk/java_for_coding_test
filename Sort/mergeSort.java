import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static int[] sorted;
	
		
	public static void mergeSort(int temp[], int start, int end) {
		if (start<end) { 
			int mid = (start+end) / 2; 
			mergeSort(temp, start, mid); 
			mergeSort(temp, mid+1, end); 
			
			int p = start; 
			int q = mid + 1; 
			int idx = p; 
			
			while (p <= mid || q <= end) { 
				if (q>end || (p<=mid && temp[p]<temp[q])) {
					sorted[idx++] = temp[p++]; 
					} else { 
						sorted[idx++] = temp[q++]; 
					} 
				} 
			
			for (int i = start;i <= end; i++) {
				temp[i]=sorted[i]; 
			} 
		}

	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x =  sc.nextInt();
		int[] arr = new int[x];
		sorted = new int[x];
		
		for(int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
							
	}

}