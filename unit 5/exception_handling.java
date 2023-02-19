/*
Java exception handling is managed by 5 keywords
    try {...}
    catch{...}
    throw
    throws
    finally{...}
 */

class exception_handling{
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int c = 4;
        try{
           int d = (a)/(b-c); 
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        // finally is executed always even if the error is there or not
        finally{
           System.out.println("Finally Method"); 
        }
        System.out.println("Finished");
    }
}