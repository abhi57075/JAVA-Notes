final class f{
    void display(){
        System.out.println("FINAL CLASS");
    }
}

// we cannot inherit from final class
// Example we cannot write class xyz extends f

class final_class_in_java{
    public static void main(String args[]){
        f obj1 = new f();
        obj1.display();
    }
}