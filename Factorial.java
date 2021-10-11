
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(6));
		System.out.println(factorialLoop(6));
		System.out.println(factorialwhileLoop(7));
		System.out.println(factorialTernary(6));

	}
	
	static int factorial(int x) {
		if(x==0) {
			return 1;
		}
		return x*factorial(x-1);
	}
	
	
	static int factorialLoop(int x) {
		int c=1,i;
		for(i=2;i<=x;i++) {
			c*=i;
		}
		return c;
		
	}
	
	static int factorialwhileLoop(int x) {
		int c=2,i=1;
		while(c<=x) {
			i*=c;
			c++;
		}
		return i;
		
	}
	
	static int factorialTernary(int x) {
		return (x==0) ? 1 : x*factorialTernary(x-1);
	}

}
