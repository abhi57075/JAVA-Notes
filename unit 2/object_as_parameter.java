class rectangle{
    int l;
    int b;
    rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    void area(rectangle r1){
        System.out.println(r1.l*r1.b);
    }
    rectangle volume(){
        rectangle objr = new rectangle(5,10);
        return objr;
    }
}
class object_as_parameter{
    public static void main(String args[]){
        rectangle r1 = new rectangle(2,3);
        r1.area(r1);

        rectangle r2 = new rectangle(5,5);
        r2 = r2.volume();
        // we can also write like this

        // rectangle r2;
        // r2 = r1.volume();

        // rectangle r2 = new rectangle(5,5);
        // r2 = r2.volume();

        r2.area(r2);
    }
}