class demo{
    int x;

    demo(){  // default constructor
        this(6); // calling parameterized constructor form default constructor
        // calling to another constructor from a constructor, this() -> this should always be written at the beginning of the contructor
        System.out.println("In default constructor");
        x = 25;
    }

    demo (int k){ // parameterized constructor
        System.out.println("In parameterized constructor");
        x = k;
    }

    demo (demo obj){
        System.out.println("In copy constructor/ Construct clone of an object");
        x = obj.x;
        System.out.println("The value of x is : " + x);
    }

    void display(){
        System.out.println("x : " + (x));
    }
}

class constructors_in_java{
    public static void main(String args[]){
        demo d1 = new demo();
        d1.display();

        demo d2 = new demo(36);
        d2.display();
        d2.x+=4;

        demo d3 = new demo(d2);
        d3.display();
    }
}