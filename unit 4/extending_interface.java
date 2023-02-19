interface A{
    int a = 25;
    int square(int x);
    void display();
}

interface B extends A{
    int b = 30;
    int cube (int x);
    void display();
}

class classC implements B{
    public int cube(int x){
        return x*x*x;
    }
    public int square (int x){
        return x*x;
    }
    public void display(){
        System.out.println(b + " " + a);
    }
}

public class extending_interface
{
	public static void main(String[] args) {
		classC obj1 = new classC();

        int ans1 = obj1.cube(3);
        System.out.println(ans1);

        int ans2 = obj1.square(3);
        System.out.println(ans2);
        
        obj1.display();
	}
}