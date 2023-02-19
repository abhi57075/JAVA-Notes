class demo{
    int x;

    void display(){
        System.out.println("x : " + (x));
    }

    void display(int p){
        System.out.println("p : " + (p));
    }
}

class method_overloading_in_java{
    public static void main(String args[]){
        demo d1 = new demo();
        d1.x = 25;
        d1.display();
        d1.display(36);
    }
}