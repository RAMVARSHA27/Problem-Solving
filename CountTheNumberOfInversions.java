import java.util.*;
class Main
{
    static int count=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int r=in.nextInt();
		 int [][]req=new int[r][2];
		 for(int i=0;i<r;i++){
		     req[i][0]=in.nextInt();
		     req[i][1]=in.nextInt();
		 }
		 List<Integer>li=new ArrayList<>();
		 for(int i=0;i<n;i++){
		     li.add(i);
		 }
		 permute(li, 0, req);
		 System.out.println("Valid permutations: "+(count%1_000_000_007));
	}
	static void permute(List<Integer>li, int index, int[][]req){
	    if(index==li.size()){
	        if(isValid(li, req)){
	            count++;
	        }
	        return;
	    }
	    for(int i=index;i<li.size();i++){
        	Collections.swap(li, index, i);
            permute(li, index+1, req);
            Collections.swap(li, index, i);
    	}
	}
    static boolean isValid(List<Integer>li, int[][]req){
        for(int[]ar:req){
            int end=ar[0];
            int targetInversions=ar[1];
            int inversions=0;
            for(int i=0;i<=end;i++){
                for(int j=i+1;j<=end;j++){
                    if(li.get(i)>li.get(j)){
                        inversions++;
                    }
                }
            }
            if(inversions!=targetInversions){
                return false;
            }
        }
        return true;
    }
}
