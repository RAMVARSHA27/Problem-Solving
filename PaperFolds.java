import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int h1=in.nextInt();
		int w1=in.nextInt();
		int h2=in.nextInt();
		int w2=in.nextInt();
		int folds=0;
		while(h1>h2){
		    h1=h1/2;
		    folds++;
		}
		while(w1>w2){
		    w1=w1/2;
		    folds++;
		}
		System.out.print(folds);
	}
}
