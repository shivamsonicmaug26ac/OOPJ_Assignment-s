package part2ofsoni.org;

import java.util.Random;
import java.util.function.Supplier;

public class OTP {

	public static void main(String[] args) {
		
		Supplier<String> otp = () -> {
			Random r =  new Random();
			String vowels = "AEIOU";
			char first = vowels.charAt(r.nextInt(5));
			
			String result = "" + first;
			
			for(int Tempi = 0; Tempi<4; Tempi++) {
				result = result + r.nextInt(10);
			}
			return result;
		};
		System.out.println("OTP :  "+otp.get());
	}

}
