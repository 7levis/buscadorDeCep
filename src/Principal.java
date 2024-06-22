import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();
        System.out.println("Qual seu CEP?");
        var cep = sc.nextLine();

        try {
            Endereco novoEndereco = consultaCEP.buscaEndereco(cep);
            System.out.println(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Aplicação Finalizada");
        }

    }
}
