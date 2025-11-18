import java.util.*;
public class commonElementsInLists{
	public static ArrayList<Integer> common(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<list1.size();i++){
			for(int j=0;j<list2.size();j++){
				if(list1.get(i)==list2.get(j)){
					result.add(list2.get(j));
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of the first list: ");
		int n1 = s.nextInt();
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i=0;i<n1;i++){
			list1.add(s.nextInt());
		}
		System.out.print("Enter size of the second list: ");
		int n2 = s.nextInt();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0;i<n2;i++){
			list2.add(s.nextInt());
		}
		System.out.println("Output -> "+common(list1,list2));
	}
}