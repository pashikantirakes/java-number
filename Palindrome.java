package in.number.com;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	
	//
	int n=sc.nextInt();
	
	int org_num=n;
	//reversing number
	int rev=0;
	while(n!=0) {
		rev=rev*10 + n%10 ;
		n=n/10;
	}
   if(org_num==rev) {
	   System.out.println("It is Palindrome " + org_num);
   }else {
	   System.out.println("Not palindrome");
   }

}
}
