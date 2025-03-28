public class Main {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        contaBancaria cb = new contaBancaria();
        cb.setSaldo(22);
        System.out.println(cb.getSaldo());

        Calculadora calc = new Calculadora();
        calc.somar(17, 22);
        int res = calc.multiplicar(17, 22);

        System.out.println("Resultado da multiplicação: " + res );
    }
    
}
