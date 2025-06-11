import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        ArrayList<Integer> li=new ArrayList<>();
        while(in.hasNextInt()){
            li.add(in.nextInt());
        }
        int a[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            a[i]=li.get(i);
        }
        for(int num:a){
            if(num>lar){
                third=seclar;
                seclar=lar;
                lar=num;
            }
            else if(num>seclar){
                third=seclar;
                seclar=num;
            }
            else if(num>third){
                third=num;
            }
        }
        if(third==Integer.MIN_VALUE){
            System.out.print("-1");
        }
        else{
            System.out.print(third);
        }
    }
}