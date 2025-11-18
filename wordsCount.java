import java.util.*;
public class wordsCount{
	public static HashMap<String,Integer> counting(String str){
		str = str.toLowerCase();
		String[] words = str.split(" ");
		HashMap<String,Integer> hash = new HashMap<>();
		for(int i=0;i<words.length;i++){
			hash.put(words[i], hash.getOrDefault(words[i],0)+1);
		}
		return hash;
	}
	public static void main(String[] ags){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String str = s.nextLine();
		System.out.println(counting(str));
	}
}