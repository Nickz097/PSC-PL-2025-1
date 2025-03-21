public class exemplo01 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetor1 = {1, 4, 12, 16 };
        String[] nomes = new String[4];
        String[] sobreNome = {"gomes ", "silva ", "oliveira ", "petelinca "};
        vetor[0] = 14;
        vetor[4] = 28;
        System.out.println("valor vetor " + vetor[0]);
        nomes[0] = "jose";
        nomes[1] = "maria";
        nomes[2] = "joaquim";
        nomes[3] = "manuel";
        System.out.println("valor nomes " + nomes[2] + ", " + sobreNome[2]);
        System.out.println("tamanho " + vetor1.length);
        System.out.println("elemento " + vetor1[0]);
        System.out.println("elemento " + vetor1[1]);
        System.out.println("elemento " + vetor1[2]);
        System.out.println("elemento " + vetor1[3]);
        
    }

    
}
