public class logico {
    public static void main (String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("true and false = " + (a && b));
        System.out.println("true and true = " + (a && c));

        System.out.println("not a = " + (!a));
        System.out.println("not false or true = " + !(b || c));
    }    
}