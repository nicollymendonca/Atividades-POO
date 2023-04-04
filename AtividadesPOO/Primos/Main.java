package Primos;

public class Main {
    public static void Main(String[] args) {    
        for (int i = 2; i <= 100; i++) {
            if(Primos(i) )
                System.out.println(i + " é primo.");
        }    
    }
    private static boolean Primos(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
