abstract class Bike { // abstract class
    Bike(){
        System.out.println("Constructor of bike");
    }
    void m1(){
        System.out.println("m1");
    }
    abstract void m2(); // abstract method
}
class Hero extends Bike{
    void m2(){
        System.out.println("m2");
    }
}
class abstract_class{
    public static void main(String args[]){
        Hero obj1 = new Hero();
        obj1.m1();
        obj1.m2();
    }
}