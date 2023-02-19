class Rectangle{
    int l;
    int b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    Rectangle getdata(){
        Rectangle r1 = new Rectangle(0,0);
        return r1;
    }
    void area(Rectangle r){
        System.out.println(r.l*r.b);
    }
    public void finalize(){
        System.out.println("INSIDE FINALIZE");
    }
}
class rough{

    public static void main(String args[]){
        
        String s1 = "example";
        String s2 = new String("example");
        String s3 = "example";

        System.out.println(s1.equals(s3));
        
    }
}