import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		HashSet<String>set=new HashSet<>();
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        for(int k=j+1;k<n;k++){
		            if(ar[i]+ar[j]+ar[k]==0){
		                int triplet[]=new int[]{ar[i], ar[j], ar[k]};
		                Arrays.sort(triplet);
		                String key=triplet[0]+", "+triplet[1]+", "+triplet[2];
		                set.add(key);
		            }
		        }
		    }
		}
		for(String s:set){
		    String parts[]=s.split(", ");
		    System.out.print(Arrays.toString(parts));
		}
	}
}
