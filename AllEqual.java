public class AllEqual{
    public static void main(String[] args){
        System.out.println(args[0] + args[1] + args[2]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && a == c)
            System.out.println("equal");
        else
            System.out.println("not equal"); 
    }
}