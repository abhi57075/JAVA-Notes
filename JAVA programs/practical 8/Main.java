// build the class of multiple inheritance by implementing interface feature of java program
// implement the queue data structure

import java.util.Scanner;

interface methods{
    int size();
    boolean queuefull();
    void enqueue(int num);
    boolean queueempty();
    void dequeue();
    void display();
}

class Queue{ 
	int arr[];
    int front;
    int rear;
    int count;
    int capacity;
    
    Queue(int size){
    	arr = new int[size];
    	front = 0;
    	rear = -1;
    	count = 0;
    	capacity = size;
    }   
}   
    
class implementation extends Queue implements methods {
    implementation(int size){
        super(size);
    }
    public int size() {
    	return count;
    }
    public boolean queuefull() {
    	return size() == capacity;
    }
    public void enqueue (int num) {
    	if (queuefull()) {
    		System.out.println("Queue is full");
    	}
    	else {
    		rear++;
    		arr[rear]=num;
    		count++;
    		display();
    	}
    }
    public boolean queueempty() {
    	return size()==0;
    }
    public void dequeue() {
    	if (queueempty()) {
    		System.out.println("Queue is empty");
    	}
    	else {
    		// meko index 1 se start karna hai aur index(capacity - 1) tak jaana hai
    		// inko sab indexes ke elements ko ek index before mein shift karna hai
    		
    		for (int i = 1; i<capacity; i++) {
    			arr[i-1] = arr[i];
    		}
    		
    		rear--;
    		count--;
    		display();
    	}
    }
    public void display() {
    	for (int i = front; i<=rear; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }
}

class Main{
    public static void main(String args[]){
        System.out.print("Enter the size of the queue : ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        implementation obj1 = new implementation(inp);
        
        int x = 1;
        while (x!=-1) {
        	System.out.println("\nType the number to perform the following operations : ");
        	System.out.println("Enter 1 to print size of array ");
        	System.out.println("Enter 2 to check if the queue is full or not ");
        	System.out.println("Enter 3 to enter an element to the queue ");
        	System.out.println("Enter 4 to check if the queue is empty or not ");
        	System.out.println("Enter 5 to delete from queue ");
        	System.out.println("Enter 6 to display array ");
        	System.out.println("Enter -1 to exit ");
        	
        	x = sc.nextInt();
        	
        	switch (x) {
        	case 1 -> { 
        		int r1 = obj1.size();
        		System.out.println(r1);
        	}
        	case 2 -> {
        		boolean r2 = obj1.queuefull();
        		System.out.println(r2);
        	}
        	case 3 -> {
        		System.out.print("Enter the element to be inserted : ");
        		int ele = sc.nextInt();
        		obj1.enqueue(ele);
        	}
        	case 4 -> {
        		boolean r4 = obj1.queueempty();
        		System.out.println(r4);
        	}
        	case 5 ->{
        		obj1.dequeue();
        	}
        	case 6 ->{
        		obj1.display();
        	}
        	}
        }
        System.out.println("Thankyou!!!");       
    }
}