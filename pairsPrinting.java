//6. Given a list of numbers and a target sum, write a program to find all unique pairs that addup to that sum and upload the code to GIT repository. 

import java.util.*;
public class pairsPrinting{
	public static ArrayList<String> pairs(int[] arr, int n, int target){
		HashSet<Integer> seen = new HashSet<>();
		LinkedHashSet<String> pair = new LinkedHashSet<>();
		for(int i=0;i<n;i++){
			int complement = target-arr[i];
			if(seen.contains(complement)){
				int a = Math.min(arr[i],complement);
				int b = Math.max(arr[i],complement);
				pair.add("(" + a + ", " + b + ")");
			}
			else if(complement==arr[i]){
				pair.add("("+arr[i] +", "+arr[i]+")");
			}
			seen.add(arr[i]);
		}
		return new ArrayList<String>(pair);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		System.out.print("Enter target: ");
		int target = s.nextInt();
		System.out.println("Array entered: "+Arrays.toString(arr));
		ArrayList<String> result = pairs(arr,n,target);
		System.out.println(result);
	}
}