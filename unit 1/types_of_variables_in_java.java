// 3 types of variables in java
// 1. local variables
// 2. instance variables
// 3. static variables

class variables{
    static int a = 10;  // static variables
    int b = 20; // instance variables
    void m1(){
        int c = 30; // local variables
        System.out.println("Local variable : " + c);
    }
}

class types_of_variables_in_java{
    public static void main(String args[]){
        variables v1 = new variables();
        System.out.println("Static variable : " + variables.a);
        System.out.println("Instance variable : " + v1.b);
        v1.m1();
    }
}