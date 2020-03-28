import java.util.*;
public class Main
{
	public static void main(String[] args) {

		int j,x,t,s,p=0,te;
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter the length of tree: ");
		t= sc.nextInt();
		System.out.print("Enter the length of stem: ");
		s= sc.nextInt();
		System.out.print("Enter the length of pot: ");
		p= sc.nextInt();

		te=t;
		for(int i=1;i<=t;i++){
			j=1;

			while(j<=te-1){
				System.out.print(" ");
				j++;
			}
			te--;

			x=i;
			while(x>0){
				System.out.print("*");
				x--;
			}
			j=i;
			if(i!=1){
				while(j>1){
					System.out.print("*");
					j--;
				}
			}
			System.out.println();
		}

		int d=t+(t-1);
		/*for(int i=1;i<=s;i++){
			j=1;
			while(j<=(d/2)-1){
				System.out.print(" ");
				j++;
			}
			
			j=1;
			while(j<=s){
				System.out.print("|");
				j++;
			}

			System.out.println();
			p=i;
		}*/

		for(int i=1;i<=p;i++){

			if(i==1){
				j=2;
				while(j>0){
					System.out.print(" ");
					j--;
				}
			}
			else{
				j=1;
				while(j<=i+1){
					System.out.print(" ");
					j++;
				}
			}

			x=i;

			if(x==1){
				while(x<=t){
					System.out.print("*");
					x++;
				}
				//System.out.println();
			}
			if(i%2==0){
				while(x<=t-1){
					System.out.print("*");
					x++;
				}
				//System.out.println();
			}
			else{
				while(x<=t-2){
					System.out.print("*");
					x++;
				}
			}
			System.out.println();
		}
	}
}
