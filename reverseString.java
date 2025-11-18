import java.util.*;
public class reverseString{
	public static String reversing(String str){
		String[] words = str.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0;i--){
			sb.append(words[i]);
			if(i!=0){
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] ags){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String str = s.nextLine();
		System.out.println(reversing(str));
	}
}