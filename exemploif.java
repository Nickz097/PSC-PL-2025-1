import javax.swing.JOptionPane;

public class exemploif {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if (numero > 0){
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é positivo");
        }
        else{
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é negativo");
        }
    }
    
}
