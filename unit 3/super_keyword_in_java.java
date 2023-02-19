class rect{ // super class
    int l;
    int b;
    int var1;
    int var2;
    rect(int l, int b){
        this.l = l;
        this.b = b;
    }
    void area(){
        System.out.println("area of rectangle : " + l*b);
    }
}

class cuboid extends rect{ // sub class
    int h;
    int var1;
    cuboid(int x, int y, int z){
        
        super(x,y); // using super for constructor || Call to super must be first statement in constructor
        // constructor of super class should have a no-argument constructor otherwise we get a compile time error bcoz the java compiler inserts a call to the no-argument constructor of the superclass.
        
        h = z;
        super.var1 = 25; // using super for data member
        var1 = 36;
        super.var2 = z*2; // using super for data member   
    }
    void area(){
        System.out.println("area of cuboid : " + l*b*h);
    }
    void show(){
        System.out.println("Var1 in super class : "+super.var1);
        System.out.println("Var1 in sub class : "+var1);
        System.out.println("Var2 in super class : "+super.var2);
    }
    void display(){
        super.area(); // using super for methods
    }
}

class super_keyword_in_java{
    public static void main(String args[]){
        rect r = new rect(10,20);
        cuboid c = new cuboid(5,6,7);
        
        c.area();
        System.out.println("h in cuboid class : " + c.h);
        c.show();
        c.display();


    }
}