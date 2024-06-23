import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();

        System.out.println("Digite um CEP para consulta: ");
        var busca = sc.nextLine();
        try {
            Endereco novoEndereco = consultaCEP.buscaEndereco(busca);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraArquivoJson(novoEndereco);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada!");
        }




    }

}