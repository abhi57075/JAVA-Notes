class Addition2{
	
	double result;
	
	double add(int x, int y) {
		result = x+y;
		return result;
	}
	
	double add(double x, double y) {
		result = x+y;
		return result;
	}
}
public class method_overloading_2 {

	public static void main(String[] args) {
		System.out.println("Method overloading if parameters are of different data type");
		
		Addition2 a2 = new Addition2();
		double ans = a2.add(1,2);
		System.out.println(ans);
		
		ans = a2.add(1.1,2.3);
		System.out.println(ans);
	}

}
