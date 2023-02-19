class garbage_collection_in_java{
    public void finalize(){
        System.out.println("HELLO");
    }
    public static void main(String args[]){
        garbage_collection_in_java f1 = new garbage_collection_in_java ();
        garbage_collection_in_java f2 = new garbage_collection_in_java ();
        f1 = null;
        System.gc(); // requesting jvm for garbage collector
        f2 = null;
        Runtime.getRuntime().gc(); // requesting jvm for garbage collector
    }
}