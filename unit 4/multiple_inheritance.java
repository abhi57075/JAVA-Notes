interface A{
    int a = 5;
    void display();
}

interface B extends A{
    int b = 6;
    void show();    
}

interface C extends A{
    int c = 7;
    void print();   
}

class D implements B,C{
    int d = 8;
    public void display(){
        System.out.println("Display");
    }
    public void show(){
        System.out.println("Show");
    }
    public void print(){
        System.out.println("Print");
    }
    void message(){
        System.out.println("Message");
    }
}


class multiple_inheritance{
    public static void main(String args[]){
        D obj1 = new D();

        System.out.println(obj1.a + " " + obj1.b + " " + obj1.c + " " + obj1.d + " ");

        obj1.display();
        obj1.show();
        obj1.print();
        obj1.message();

    }
}