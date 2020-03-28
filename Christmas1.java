import java.util.*;
public class Main1
{
	public static void main(String[] args) {

		int j,x,t,s,p=0,te,z=1;
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
		for(int i=1;i<=s;i++){
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
		}

		int e=d/2;
		for(int i=1;i<(p-1);i++){

			if(i==1){
				j=e/2;
				while(j>0){
					System.out.print(" ");
					j--;
				}
			}
			else{
				j=e/2;
				int f=j+(i-1);
				while(f>0){
					System.out.print(" ");
					f--;
				}
			}
			x=i;
			if((p-x)!=1){
				if(x==1){
					while(x<=t){
						System.out.print("*");
						x++;
					}
				}
				else{
					x=x+z;
					while(x<=t){
						System.out.print("*");
						x++;
					}
					z=z+1;
				}
			}
				
			System.out.println();
		}
	}
}
