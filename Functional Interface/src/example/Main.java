package example;

public class Main {
	public static void main(String[] args) {
		
//		//1. with {}....-> when more lines
//		Calculate val = () -> {
//			System.out.println("Pawan Bisht");
//			System.out.println("Harry Doi");
//			System.out.println("Sam honny");
//		};
//		val.cal();
		
		
		
//		// 2.without {}......when one line only
//		Calculate val = () -> System.out.println("Heelo Ho");
//		val.cal();
		
		
		
		// 3. parameterized....
		Calculate add = (a, b) -> a+b;
		System.out.println("Sum is: "+add.cal(12, 12));
			
	}
}
