package fibbo;

public class fibbo {

	public static void main(String[] args) {
		int f=0,sum=0;
		int a=0,b=1;
		float avg;
		System.out.println("the first 20 fibonnaci numbers are ");
		for(int i=0;i<20;i++){
		f=a+b;
		b=a;
		a=f;
		sum=sum+f;
		System.out.print(f+"\t");
		}
		avg=sum/20;
		System.out.println("\nthe average is "+avg);
		}
}
