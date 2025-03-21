import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número ");
        int n = sc.nextInt();
        for (int contador = 1; contador <= 10; contador++){
            System.out.println(contador * n);
        }
        
    }
}
