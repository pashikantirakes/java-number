package in.number.com;

public class FirstAndSecondLarge {

	public static void main(String[] args) {
int arr[]= {12,34,5,68,776,98,345,6464,1037,64736,63629};
int first=0;
int second=0;
for(int i=0;i<arr.length;i++) {
	if(first<arr[i]) {
		second=first;
	   first=arr[i];
	}
	else if(second<arr[i]) {
		second=arr[i];
	}
}
System.out.println("1st-- " + first + "  2nd-- " + second);
	}

}
