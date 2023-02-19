class string_constructors_in_java{
    public static void main(String args[]){
        
        char a1[] = {'P','I','C','T'};
        String s1 = new String(a1);
        System.out.println(s1);

        char a2[] = {'P','I','C','T'};
        String s2 = new String(a1,1,3);
        System.out.println(s2);

        byte a3[] = {65,66,67,68};
        String s3 = new String(a3);
        System.out.println(s3);

        byte a4[] = {65,66,67,68};
        String s4 = new String(a4,1,3);
        System.out.println(s4);
    }
}