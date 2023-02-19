class Record1{
	String name;
	int roll_no;
	
	void reg(String name, int roll_no) {
		System.out.println("Name : "+name+" Roll no : "+roll_no);
	}
	
	void reg(int roll_no, String name) {
		System.out.println("Roll no : "+roll_no+" Name : "+name);
	}
	
}
public class method_overloading_3 {

	public static void main(String[] args) {
		System.out.println("Method overloading if sequence of parameter changes");
		
		Record1 a2 = new Record1();
		a2.reg("ABHISHEK",32321);
		
		Record1 a3 = new Record1();
		a3.reg(32321,"ABHISHEK");
	}
}
