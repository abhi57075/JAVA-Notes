class A{
    void display(){
        System.out.println("A");
    }
}
class B extends A{
    void print(){
        System.out.println("B");
    }
}
class C extends B{
    void show(){
        System.out.println("C");
    }
}
class multilevel_inheritance{
    public static void main(String args[]){
        C obj1 = new C();
        obj1.display();
        obj1.print();
        obj1.show();
    }
}