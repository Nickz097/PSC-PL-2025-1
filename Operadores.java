public class Operadores{
    public static void main(String[] args) {
        // operadores aritméticos
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        // operadores de comparação

        int c = 20;
        int d = 15;
        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c <= d);
        System.out.println(c >= d);

        // Operadores Lógicos

        boolean t = true;
        boolean f = false;

        System.out.println(t && f);
        System.out.println(t || f);
        System.out.println(!t);

        // Operadores de Atribuição

        int g = 10;

        g+=5; // g = g + 5 = 15
        g-=5; // g = g - 5 = 5
        g/=5; // g = g / 5 = 2
        g*=5; // g = g * 5 = 50
        g%=5; // g = g % 5 = 0
        

    }
} 