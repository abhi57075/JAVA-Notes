class demo{
    final int x = 200;
    final void m1(final int n){ // final method cannot be override
        //x = 300 // compile time error
        System.out.println(x);
        // n = n+2 will give an error
        int a = n+2;
        System.out.println(a);
    }
}
class final_keyword_in_java{
    public static void main(String args[]){
        demo d1 = new demo();
        d1.m1(10);
    }
}