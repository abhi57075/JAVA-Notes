/*
An interface in java will contain final data members and abstract data methods

Variables : static final int x = 25;
Method : int square(int x);
*/

interface i1{
    // Data members are static and final by default
    static final int a = 25;
    final static int b = 26;
    static int c = 27;
    final int d = 28;
    int e = 29;

    int square(int x);
    void display();
}

class c1 implements i1{
    public int square(int x){
        return x*x;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    int cube (int x){
        return x*x*x;
    }
}

class interface_in_java{
    public static void main(String args[]){
        c1 obj1 = new c1();

        int res = obj1.square(6);
        System.out.println(res);
        
        res = obj1.cube(6);
        System.out.println(res);

        obj1.display();

        System.out.println(i1.a);
        System.out.println(i1.b);
        System.out.println(i1.c);
        System.out.println(i1.d);
        System.out.println(i1.e);

    }
}