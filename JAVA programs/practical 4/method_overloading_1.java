class Addition1{

	int result;
	
	int add (int x, int y) {
		result = x+y;
		return result;
	}
	
	int add(int x, int y, int z) {
		result = x+y+z;
		return result;
	}
}

public class method_overloading_1 {
	public static void main(String[] args) {
		System.out.println("Method overloading if number of parameters differ");
		
		Addition1 a1 = new Addition1();
		int ans = a1.add(1,2);
		System.out.println(ans);
		
		ans = a1.add(1,2,3);
		System.out.println(ans);
	}
}
