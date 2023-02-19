class finalize_in_java{
    public void finalize(){
        System.out.println("HELLO");
    }
    public static void main(String args[]){
        finalize_in_java f1 = new finalize_in_java();
        finalize_in_java f2 = new finalize_in_java();
        f1 = null;
        System.gc(); // requesting jvm for garbage collector
        f2 = null;
        Runtime.getRuntime().gc(); // requesting jvm for garbage collector
    }
}