interface i1{
    int x = 25;
    default int square (int x){
        return x*x;
    }
    static int cube (int x){
        return x*x*x;
    }
}

class c implements i1{
    void display(){
        System.out.println("HELLO");
    }
    int cube(int x){
        return x;
    }
}

class static_and_default_in_interface{
    public static void main(String[] args){
        c obj1 = new c();
        obj1.display();
        
        int x = obj1.square(4);
        System.out.println(x);

        x = i1.cube(4);
        System.out.println(x);

        x = obj1.cube(4);
        System.out.println(x);

    }
}