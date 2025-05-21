import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // instacia class scanner para ler dados do usuario
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        // programa espera usuario insirir valor para prosseguir
        System.out.print("Por favor, digite o número da Agência!:  ");
        String agencia= scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta!:  ");
        int conta= scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite seu nome!:  ");
        String nome= scanner.nextLine();

        System.out.print("Por favor, digite o valor que deseja depositar!:  ");
        Double saldo= scanner.nextDouble();

        scanner.close();
        
        exibirDadosDaConta(nome,agencia,conta,saldo);
        
    }
    // metodo exibe os dados cadastrados
    public static void exibirDadosDaConta(String nome, String agencia, int conta, Double saldo){
        // formatar o valor do saldo
            Locale brasil = Locale.forLanguageTag("pt-BR");
            NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        System.out.print("\nOlá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta é "+conta+" e seu saldo "+formatoMoeda.format(saldo)+" já está disponível para saque.");

    }
}
