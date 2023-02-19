import java.util.*;

class ArrayList_in_java{
    public static void main(String args[]){
        // Array list does not work on primitive data types. It takes wrapper class
        ArrayList<String> al = new ArrayList<String>();
        System.out.println(al.size());

        al.add("abhishek");
        al.add("jain");
        String s = "PICT";
        String r = "A";
        al.add(s);
        al.add(r);

        System.out.println(al.size());

        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

        // Convert an array list to an array 
        // Use always wrapper class for toArray function
        Integer b[] = new Integer[al2.size()];
        b = al2.toArray(b);
        for (int i : b){
            System.out.print(i+" ");
        }
        System.out.println();

        al.remove(0);
        al.remove(0);
        al.remove("PICT");
        System.out.println(al);
    }
}