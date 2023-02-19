public class Operations_on_different_data_types {
    public static void main(String [] args) {
        byte byte_number = 25;
        long number1 = 24L;
        char letter = 'A';
        float decimal = 23.5f;
        double num = 2.3;
        short short_num = 234;
        boolean value = true;
        String word1 = "Abhishek";
        String word2 = " Jain";

        System.out.println(word1 + word2);
        System.out.println();

        System.out.println(byte_number + number1);
        System.out.println(byte_number + letter);
        System.out.println(byte_number + decimal);
        System.out.println(byte_number + num);
        System.out.println(byte_number + short_num);
        System.out.println();

        System.out.println(letter + number1);
        System.out.println(letter + decimal);
        System.out.println(letter + num);
        System.out.println(letter + short_num);
        System.out.println();

        System.out.println(decimal + num);
        System.out.println(decimal + short_num);
        System.out.println();

        System.out.println(num + short_num);
        System.out.println();
        

    }    
}
