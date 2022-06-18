package in.number.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfAllDigits {

	public static void main(String[] args) {
getDigitCount(1235213);
	}

	private static void getDigitCount(long number) {

		 Map<Long,Integer> m=new HashMap<>();
		 while(number != 0) {
			 long ld=number%10;
			 if(m.containsKey(ld)) {
				 m.put(ld,m.get(ld)+1);
			 }else {
				 m.put(ld, 1);
			 }
			 number=number/10;
		 }
		 Set<Long> s=m.keySet();
		 for (Long k : s ) {
			 System.out.println(" " + k + " : " + m.get(k));
		 }
	}

}
