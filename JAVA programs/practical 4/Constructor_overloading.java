class Record3{
	int roll_no;
	String name;
	
	Record3(){
		name = "Abhishek";
		roll_no = 32321;
	}
	
	Record3(String name, int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
}
public class Constructor_overloading {
	public static void main(String[] args) {
	System.out.println("Constructor overloading");
	
	Record3 a2 = new Record3();
	System.out.println(a2.roll_no + "\t" + a2.name);
	
	Record3 a3 = new Record3("Abhishek", 22308);
	System.out.println(a3.roll_no + "\t" + a3.name);
	}
}
