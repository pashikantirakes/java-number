package in.number.com;

public class Factorial {
//it is factorial program
	public static void main(String[] args) {
int num=5;
 long fact=1;
// for(int i=1;i<=num;i++) {
	// fact=fact*i;
 //}
// System.out.println("Factorail of "+ num + " is " + fact);
 
 for(int j=num;j>=1;j--) {
	 fact=fact*j;
 }System.out.println(fact);
	}

}
