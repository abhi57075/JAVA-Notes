class demo{
    static void display(){
        System.out.println("Inside demo class");
    }
}
class static_members_in_java{
    static void method1(){
        System.out.println("In method 1");
    }
    static{
        System.out.println("Inside static");
    }
    public static void main(String args[]){
        method1();
        System.out.println("Inside main method");
        demo.display();
    }
}

// Output:
// Inside static
// In method 1
// Inside main method
// Inside demo class