class command_line_arguments{
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        double c = Double.parseDouble(args[2]);
        String s = args[3];

        System.out.println(a+1);
        System.out.println(b+1);
        System.out.println(c+1);
        System.out.println(s);
    }
}
// Input is to be given by console and command line argument means passing arguments at the time of running the java program