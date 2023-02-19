class demo{
    int x;

    void display(){
        System.out.println("x + 2 : " + (x+2));
    }
}

class object_creation_in_java{
    public static void main(String args[]){
        demo d1 = new demo();
        d1.x = 25;
        d1.display();

        demo d2 = d1;
        d2.display();

        d1 = null;
        d2.display();
    }
}