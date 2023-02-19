// 2 types of typecasting in java
// 1. narrowing typecasting (manually) - converting a larger type to smaller type
// 2. widening typecasting (automatically) - converting a smaller type to larger data type

class typecasting_in_java{
    public static void main(String args[]){
        int x = 25;
        double y = 30.25;

        // widening typecasting
        double x1 = x;
        System.out.println(x1);

        // narrowing typecasting
        int y1 = (int)y;
        System.out.println(y1);
    }
}
