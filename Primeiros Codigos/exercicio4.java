public class exercicio4 {
	public static void main(String args[]){
		char sigla1 = 'B';
		char sigla2 = 'R';
		
		byte num1 = 2;
		byte num2 = 5;
		int bRes = num1 * num2;

		short num3 = 3;
		short num4 = 8;
		int sRes = num3 - num4;

		int num5 = 2;
		int num6 = 2;
		int iRes = num5 + num6;

		long num7 = 5;
		long num8 = 5;
		long lRes = num7 / num8;

		double num9 = 5.5;
		double num10 = 5.2143213;
		double dRes = num9 % num10;
		
		System.out.println("Char: " + sigla1 + sigla2);
		System.out.println("Byte: " + bRes);
		System.out.println("Int: " + iRes);		
		System.out.println("Short: " + sRes);
		System.out.println("Long: " + lRes);
		System.out.println("Double: " + dRes);	
	}
}