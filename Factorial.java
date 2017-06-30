package guviset3;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int f=1;
for(int i=0;i<a;i++){
	f=f+1;
}
System.out.println("Factorial number"+f);
	}

}
