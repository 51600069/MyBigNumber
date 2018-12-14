public class MyBigNumber{
	public void sum(String num1, String num2){
		
		int min = (num1.length() < num2.length() ? num1.length():num2.length());
		int max = (num1.length() < num2.length() ? num2.length():num1.length());
		
		int n1[] = new int[max];
		int n2[] = new int[max];
		
		System.out.println("max is" + max + "min is" + min);
		
		for( int i = 0 ; i < num1.length() ; i++ ){
			n1[i] = num1.charAt(num1.length()-1-i)-48;
		}
		
		System.out.println(num1);
		
		
		for( int i = 0 ; i < num2.length() ; i++ ){
			n2[i] = num2.charAt(num2.length()-1-i)-48;
		}
		
		System.out.println(num2);
		
		int carry = 0;
		
		int sum1[] = new int[max + 1];
		
		int k = 0;
		
		for(k = 0;k < max;k++){
			sum1[k] = (n1[k] + n2[k] + carry)%10;
			
			if ( (n1[k] + n2[k] + carry) >= 10)
				carry = 1;
			else
				carry = 0;
		}
		
		sum1[max] = carry;
		
		System.out.println("\n");
		String result;
		
		for(int j = max; j >= 0;j--){
			System.out.printf("%d", sum1[j]);
		}
		
	}
	
	public static void main(String[] args){
		MyBigNumber obj = new MyBigNumber();
		obj.sum("4444444", "4444444");
		
	}
}