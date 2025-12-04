import java.util.Scanner;

public class AppFolhaPagamento{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salario = sc.nextDouble();

        System.out.println("\nQual o tipo de contribuinte: ");
        System.out.println("1- Funcionário CLT");
        System.out.println("2- Estagiário");
        System.out.println("3- Prestador de Serviço\n");

        System.out.print("Opção de contribuinte: ");
        int opcao = sc.nextInt();

        // POLIMORFISMO:
        Contribuinte contribuinte = null;




        if (opcao == 1) {
            contribuinte = new FuncionarioCLT(nome, cpf, salario);

        } 
        
        else if (opcao == 2) {
            contribuinte = new Estagiario(nome, cpf, salario);


        } 
        
        else if (opcao == 3) {
            contribuinte = new PrestadorServico(nome, cpf, salario);


        } 
        
        else {
            System.out.println("Opção inválida (escolha entre 1, 2 ou 3)!");

            System.exit(0); 
        }

        contribuinte.exibirResumo();
    }



    

}
