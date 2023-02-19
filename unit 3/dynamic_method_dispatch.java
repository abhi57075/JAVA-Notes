// Dynamic method dispatch

class A{
    void display(){
        System.out.println("A");
    }
}

class B extends A{
    void display(){
        System.out.println("B");
    }
}

class C extends A{
    void display(){
        System.out.println("C");
    }
}

class dynamic_method_dispatch{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.display();

        r = b;
        r.display();

        r = c;
        r.display();
    }
}