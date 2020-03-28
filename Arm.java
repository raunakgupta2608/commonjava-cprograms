import java.util.Scanner;
class Arm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n =sc.nextInt();
		int c=0,b,a=n;

		while(n>0){
			b= n%10;
			c=b*b*b+c;
			n= n/10;
		}
		if(c==a)
			System.out.println(a +" is a Armstrong");
		else
			System.out.println(a +" is not a Armstrong");
	}
}