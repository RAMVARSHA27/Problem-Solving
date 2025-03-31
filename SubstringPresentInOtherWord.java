import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ar[]=in.nextLine().trim().split("\\s+");
		LinkedHashSet<String> list=new LinkedHashSet<>();
		for(int i=0;i<ar.length;i++){
		    for(int j=0;j<ar.length;j++){
		        if(i!=j && ar[j].contains(ar[i]) && !ar[i].equals(ar[j])){
		            list.add(ar[i]);
		            break;
		        }
		    }
		}
		List<String>li=new ArrayList<>(list);
		Collections.sort(li);
		System.out.print(li);
	}
}
