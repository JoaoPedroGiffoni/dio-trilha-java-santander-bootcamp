
import java.util.Scanner;

public class ExerciciosOperadores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pode Dirigir?
        System.out.print("Informe a sua idade: ");
        int idadeInformada = scanner.nextInt();
        int idadeMinimaParaDirigir = 18;

        String mensagemResultado = idadeInformada >= idadeMinimaParaDirigir
                ? "Você tem " + idadeInformada + " anos e pode dirigir."
                : "Você tem " + idadeInformada + " anos e não pode dirigir, pois a idade mínima é " + idadeMinimaParaDirigir + " anos.";

        System.out.println(mensagemResultado);

        //Média do Aluno
        System.out.print("Informe a sua primeira nota: ");
        double primeiraNota = scanner.nextInt();

        System.out.print("Informe a sua segunda nota: ");
        double segundaNota = scanner.nextInt();

        double media = (primeiraNota + segundaNota) / 2;

        String resultadoMedia = media >= 6
                ? "Você foi aprovado com a nota média de: " + media
                : (media >= 4
                        ? "Você está de recuperação com a nota média de: " + media
                        : "Você foi reprovado com a nota média de: " + media);

        System.out.println(resultadoMedia);

        //Maior Número
        System.out.println("Informe o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Informe o segundo nummero: ");
        int segundoNumero = scanner.nextInt();

        String maiorNumero = primeiroNumero > segundoNumero
                ? "O numero maior é " + primeiroNumero
                : "O numero maior é o " + segundoNumero;

        System.out.println(maiorNumero);

        //Bolsa de Estudos
        System.out.println("Informe a sua nota: ");
        int nota = scanner.nextInt();

        System.out.println("Informe a porcentagem da sua frequancia: ");
        int frequencia = scanner.nextInt();

        String resultadoBolsa = nota >= 7 && frequencia >= 75
                ? " Voce tem direito a bolsa"
                : "Voce nao tem direito a bolsa";
        System.out.println(resultadoBolsa);

        //Calculadora Simples
        System.out.println("Digite o primeiro numero que deseja calcular: ");
        int primeiroNumeroCalculadora = scanner.nextInt();

        System.out.println("Digite o segundo numero que deseja calcular: ");
        int segundoNumeroCalculadora = scanner.nextInt();

        System.out.println(
                "A soma dos numeros é:" + (primeiroNumeroCalculadora + segundoNumeroCalculadora)
        );
        System.out.println(
                "A Subtração dos numeros é:" + (primeiroNumeroCalculadora - segundoNumeroCalculadora)
        );
        System.out.println(
                "A Divisão dos numeros é:" + (primeiroNumeroCalculadora / segundoNumeroCalculadora)
        );
        System.out.println(
                "A Multiplicação dos numeros é:" + (primeiroNumeroCalculadora * segundoNumeroCalculadora)
        );
        System.out.println(
                "A resto da divisão dos numeros é:" + (primeiroNumeroCalculadora % segundoNumeroCalculadora)
        );

        //Desconto no Produto
        System.out.println("Didite o valor do produto: ");
        int valorProduto = scanner.nextInt();
        double desconto = valorProduto * 0.10;

        System.out.println(" O valor do produto com desconto é de:" + (valorProduto - desconto));
    }
}
