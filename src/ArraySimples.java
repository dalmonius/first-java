import java.util.Arrays;

public class ArraySimples {
    public static void main (String[] args){
        String[] paises = {"BRASIL", "RUSSIA", "INDIA", "CHINA"};
        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "BRASIL");
        System.out.println(posicao);
    }
}
