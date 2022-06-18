package in.number.com;

public class PrimeNo {
	public static void main(String[] args) {
		int no=5;
		int count=0;
		
		if(no>1) {
			for(int i=1;i<=no;i++) {
				if(no%i==0) {
					count++;
				}
				}if(count==2) {
					System.out.println("Prime number " + no);
				}else {
					System.out.println("Not");
				}
			}
			
			else {
				System.out.println("Not");
			}
			
		}
	}


