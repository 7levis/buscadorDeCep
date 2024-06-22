


public class Principal {
    public static void main(String[] args)  {
        ConsultaCEP consultaCEP = new ConsultaCEP();
        try {
            Endereco novoEndereco = consultaCEP.buscaEndereco("20766200");
            System.out.println(novoEndereco);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ocorreu algum erro!");
        }




    }

}