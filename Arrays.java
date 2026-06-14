import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			}
		
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				break;
			}
			//else {
			//	System.out.println(arr[i]+" "+count);
			//}
		}
		System.out.println(count);
}
}
