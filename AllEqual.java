public class AllEqual{
    public static void main(String[] args){
        //Parseo los args a int
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);
        int numero3 = Integer.parseInt(args[2]);
        //Si numero1 es igual a n2 y n1 es igual a n3 entonces true
        if (numero1 == numero2 && numero1 == numero3)
            System.out.println("equal");
        else
            System.out.println("not equal"); 
    }
}