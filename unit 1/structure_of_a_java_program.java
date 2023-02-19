// Structure of a java program
// 1. Documentation section
// 2. package statement
// 3. import statement
// 4. interface statement
// 5. class definition
// 6. Main method class { main method definiton{ ... }}

// The following code depicts structure of a java program  -> Documentation section
// package xyz; -> Package statement

import java.util.Scanner; // -> import statement

interface i1{  // -> interface statement
    void display();
}

class c1{ // class definition
    void print(){
        System.out.println("My piece of code");
    }
}

class structure_of_a_java_program extends c1 implements i1{ // main method class
    public void display(){
        System.out.println("Hello World");
    }
    public static void main(String args[]){
        structure_of_a_java_program obj1 = new structure_of_a_java_program();
        obj1.display();
        c1 obj2 = new c1();
        obj2.print();
    }
}