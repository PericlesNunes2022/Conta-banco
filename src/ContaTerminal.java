import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {

        //Criando Objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor Digite o Numero da Conta ");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite numero da Agencia ");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome");
        String nomeDoCliente = scanner.next();

        System.out.println("Digite seu Sobre Nome");
        String SobreNome = scanner.next();

        System.out.println("por favor Deposite o valor desejado");
        BigDecimal saldo = scanner.nextBigDecimal();


        //Imprimindo mensagem final e identificação do usuario

        System.out.println("ola " + nomeDoCliente + " " + SobreNome + " Obrigado por criar sua conta em nosso Banco ");
        System.out.println("sua Agencia é: " + agencia);
        System.out.println("conta: " + conta);
        System.out.println("seu Saldo " + saldo + " Já esta disponivel para saque ");





    }
}
