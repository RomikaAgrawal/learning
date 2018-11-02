import java.util.*;
public class dupilcatechar{
	
	public static void main(String args[]){
		dupilcatechar dc = new dupilcatechar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		dc.findduplicatechar(str);
	}
	
	public void findduplicatechar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++){
			map.put(ch[i],map.getOrDefault(ch[i],0)+1);
		}
		
		for(Character c:map.keySet()){
			if(map.get(c)>1){
				System.out.println(c+"->"+map.get(c));
			}
		}
		
	}
}