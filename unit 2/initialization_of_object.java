class demo1{
    int x; // data field of the class

    void display(){ // data member of the class
        System.out.println("x + 2 : " + (x+2));
    }
}

class demo2{
    int x = 36;

    void display(){
        System.out.println("x + 4 : " + (x+4));
    }
}

class demo3{
    int x;

    demo3 (int var){
        x = var;
    }

    void display(){
        System.out.println("x + 6 : " + (x+6));
    }
}

class demo4{
    int x;

    void initialize (int k){ //initializing data field using method
        x = k;
    } 

    void display(){
        System.out.println("x + 8 : " + (x+8));
    }
}

class initialization_of_object{
    public static void main(String args[]){
        demo1 d1 = new demo1();  // object fields are initailized in main method
        d1.x = 25;
        d1.display();

        demo2 d2 = new demo2(); // object fields are already initialized in their classes
        d2.display();

        demo3 d3 = new demo3(49); // object fields are already initialized using constructor
        d3.display();   

        demo4 d4 = new demo4(); // initializing data fields using data method 
        d4.initialize(64);
        d4.display();
    }
}