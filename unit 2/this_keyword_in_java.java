class rect {
    int l;
    int b;

    rect(){
        this(25,10);
        l = 0;
        b = 0;
    }

    rect(int l, int b){
        this.l = l;
        this.b = b;
        this.print();
    }

    void print(){
        System.out.println("Rectangle");
        this.display();
    }

    void display(){
        System.out.println("AREA IS : " + (l*b));
    }
}

class this_keyword_in_java{
    public static void main(String args[]){
        rect r = new rect();
        r.print();
    }
}