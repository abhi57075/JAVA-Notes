enum Season {Summer, Winter, Rainy} // enum defined outside class
class demo1{
    enum Days {sunday,saturday,friday} // enum defined inside class
    void m1(){
        Days d = Days.sunday;
        System.out.println(d);
    }
}
class enum_in_java{
    public static void main(String args[]){
        Season s = Season.Winter;
        System.out.println(s);

        demo1 d1 = new demo1();
        d1.m1();
    }
}