class example{
    static int count1 = 0;
    static int count2 = 0;
    void f1(){
        if (count1<5){
            System.out.println("HELLO "+count1);
            count1++;
            f1();
        } 
    }
    void f2(){
        if (count2 >= 5){
            return;
        }
        count2++;
        System.out.println("WELCOME "+count2);
        f2();
    }
}

class recursion_in_java{
    public static void main(String args[]){
        example e1 = new example();
        e1.f1();
        e1.f2();
    }
}