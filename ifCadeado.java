public class ifCadeado {
    public static void main(String[] args) {
        double a1, a2, a3, soma;
        a1 = 2.2;
        a2 = 3.6;
        a3 = 4;
        soma = a1 + a2 + a3 / 3;

        if(soma >= 7){
System.out.println("aprovado");
        }
        else if( soma > 6){
            System.out.println("recuperação");
        }
        else{
            System.out.println("reprovado");
        }
    }
    
}
