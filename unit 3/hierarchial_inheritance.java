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
class C extends A{
    void show(){
        System.out.println("C");
    }
}
class hierarchial_inheritance{
    public static void main(String args[]){
        C obj1 = new C();
        obj1.show();
        obj1.display();
    }
}