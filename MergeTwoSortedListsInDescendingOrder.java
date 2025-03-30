// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String l1=in.nextLine().replaceAll("[{}]", "").trim();
        String l2=in.nextLine().replaceAll("[{}]", "").trim();
        String ar1[]=l1.isEmpty()?new String[0]:l1.split("\\s+");
        String ar2[]=l2.isEmpty()?new String[0]:l2.split("\\s+");
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        int n=ar1.length;
        int m=ar2.length;
        while(i<n && j<m){
            if(Integer.parseInt(ar1[i])>Integer.parseInt(ar2[j])){
                list.add(Integer.parseInt(ar1[i++]));
            }
            else{
                list.add(Integer.parseInt(ar2[j++]));
            }
        }
        while(i<n) list.add(Integer.parseInt(ar1[i++]));
        while(j<m) list.add(Integer.parseInt(ar2[j++]));
        Collections.sort(list, Collections.reverseOrder());
        System.out.print("[");
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k));
            if(k<list.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}