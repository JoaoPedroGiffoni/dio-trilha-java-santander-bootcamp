
public class Operadores {

    public static void main(String[] args) {

        // Operadores ternarios
        int a, b;
        a = 5;
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "falso";
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }
        System.out.println(resultado);

        // Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;
        if (numero1 > numero2) {
            System.out.print("Numero 1 maior que numero 2");
        }
        if (numero1 < numero2) {
            System.out.print("Numero 1 menor que numero 2");
        }
        if (numero1 >= numero2) {
            System.out.print("Numero 1 maior ou igual que numero 2");
        }
        if (numero1 <= numero2) {
            System.out.print("Numero 1 menor ou igual que numero 2");
        }
        if (numero1 != numero2) {
            System.out.print("Numero 1 é diferente de numero 2");
        }
        String nomeUm = "JOAO";
        String nomeDois = "JOAO";
        System.err.println(nomeUm.equals(nomeDois));
    }
}
