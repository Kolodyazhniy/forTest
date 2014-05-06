
public class ForTest {
	public static void main(String args[]) {
		/*
		 * 0 - 0000
		 * 1 - 0001
		 * 2 - 0010
		 * 3 - 0011
		 * 4 - 0100
		 * 5 - 0101
		 * 6 - 0110
		 * 7 - 0111
		 * 8 - 1000
		 * 9 - 1001
		 *10 - 1010
		 *
		 * */	
		int x;
		
	for(x = 0; x<10; x = x+1)
		System.out.println("Значение x: " + x) ;
	

	
//	boolean b;
//	b = false;
//	System.out.println("b равна " + b);
//	b = true;
//	System.out.println("b равна " + b);
//	// значение типа boolean может управлять оператором if
//	if(b) System.out.println("Это выполняется.");
//	b = false;
//	if(!b) System.out.println("Это не выполняется.");
//	// результат сравнения - значение типа boolean
//	System.out.println("10 > 9 равно " + (10 > 9));
	
	
	long l1=1999999999;
	long l2=29999999;
	
	long sum = l1+l2;
	
	System.out.println(+sum);
	
	
	double fl=   1.4;
	
	double dl =6.346666666666666;
	
	
	
	int poNOT = (0b00101010);
	System.out.println("NOT "+(~poNOT));   // 00101010 -> 11010101
	
	int poAND = (8&5);
	System.out.println("AND "+poAND);   // 1000  &  0101 -> 0000
	
	int poOR = (3|4);
	System.out.println("OR "+poOR);   //  0011  |  0100  ->  0111
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
