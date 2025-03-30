import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		s=s.replaceAll("[\\[\\]\"]", "");
		String[] strs=s.split(",\\s*");
		Map<String, List<String>> map = new HashMap<>();
		for(String word:strs){
		    char[] chars=word.toCharArray();
		    Arrays.sort(chars);
		    String sKey=new String(chars);
		    if(!map.containsKey(sKey)){
		        map.put(sKey, new ArrayList<>());
		    }
		    map.get(sKey).add(word);
		}
		System.out.print(map.values());
	}
}
