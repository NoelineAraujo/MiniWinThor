import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println( " informe o codigo: ");
        int codigo = scanner.nextInt();
        produto.setcodigo(codigo);

        System.out.println( " informe a descrição: ");
        String descricao = scanner.next();
        produto.setdescricao(descricao);

        System.out.println( " informe o Preço de compra");
        double compra = scanner.nextDouble();
        produto.setcompra(compra);

        System.out.println( " informe o Preço de venda");
        double venda = scanner.nextDouble();
        produto.setvenda(venda);


        System.out.println(" Meu codigo é " + produto.getcodigo());
        System.err.println(" Minha descrição é " + produto.getdescricao());
        System.out.println("Informe sua compra " + produto.getcompra());
        System.out.println(" informe sua venda " + produto.getvenda());
        




       
    }   




}
