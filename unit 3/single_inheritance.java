// there are 3 types of inheritances in java
// 1. Single inheritance
// 2. Multilevel inheritance
// 3. Hierarchial inheritance
// In Java multiple and hybrid inheritances is supported through interface only.

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
class single_inheritance{
    public static void main(String args[]){
        B obj1 = new B();
        obj1.display();
        obj1.print();
    }
}