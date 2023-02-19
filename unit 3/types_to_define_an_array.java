class types_to_define_an_array{
    public static void main(String args[]){
        // Method 1
        int a[] = new int[4];
        System.out.println(a.length);

        // Method 2
        int b[] = {1,2,3,4,5};
        System.out.println(b.length);

        // Methof 3
        int c[] = new int[]{1,2,3,4,5,6};
        System.out.println(c.length);
    }
}