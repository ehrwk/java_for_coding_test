import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static int[] sorted;
	
		
	public static void quickSort(int temp[], int start, int end) {
		
		int left = start;
		int right = end;
		int pivot = temp[(left + right) / 2];
		
		do{
            while(temp[left] < pivot) 
            	left++;
            while(temp[right] > pivot)
            	right--;
            if(left <= right){    
                int tmp = temp[left];
                temp[left] = temp[right];
                temp[right] = tmp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(start < right) quickSort(temp, start, right);
        if(end > left) quickSort(temp, left, end);


	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x =  sc.nextInt();
		int[] arr = new int[x];
		sorted = new int[x];
		
		for(int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
							
	}

}