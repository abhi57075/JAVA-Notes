class rect{ // super class
    int l;
    int b;
    rect(int l, int b){
        this.l = l;
        this.b = b;
    }
    void area(){
        System.out.println(l*b);
    }
}

class cuboid extends rect{ // sub class
    int h;
    cuboid(int x, int y, int z){
        super(x,y);
        h = z;
    }
    void volume(){
        System.out.println(l*b*h);
    }
}

class reference_of_a_subclass_object_to_a_reference_variable{
    public static void main(String args[]){
        rect r = new rect(10,20);
        cuboid c = new cuboid(5,6,7);
        
        c.volume();
        System.out.println(c.h);

        r = c; // A subclass can be converted into parent class
        r.area();

    }
}