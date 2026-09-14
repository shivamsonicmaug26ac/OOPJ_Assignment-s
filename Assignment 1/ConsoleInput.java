public class ConsoleInput{
//	for  get float start
	public static float getfloat() {
		return Float.parseFloat(getString());
	}
//	for  get float start
	
//	for  get integer start	
	public static int getint() { //wrapper class
		return Integer.parseInt(getString());
	}
//	for  get integer end	
	
	public static String getString() { // esa hi float ke lie bhi bnana pdega
		try {
//			System.out.println("Enter your number :");
			byte inputarr[] = new byte[100];
			int length = System.in.read(inputarr);
			byte final_arr[] = new byte[length-2];
			System.arraycopy(inputarr, 0, final_arr, 0, length-2);
			String t  = new String (final_arr);
			return  t;
			
	}catch (Exception e) {
		System.out.println(e);
	}
		return "";
	}
	}