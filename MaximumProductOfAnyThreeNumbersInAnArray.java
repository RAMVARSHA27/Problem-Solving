import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>li=new ArrayList<>();
        while(in.hasNextInt()){
            li.add(in.nextInt());
        }
        int ar[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            ar[i]=li.get(i);
        }
        int n = ar.length;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for(int num:ar){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max3=max2;
                max2=num;
            }
            else if(num>max3){
                max3=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2){
                min2=num;
            }
        }
        System.out.print("Maximum product of any 3 numbers is: ");
        System.out.print(Math.max(max1*max2*max3, min1*min2*max1));
    }
}
        