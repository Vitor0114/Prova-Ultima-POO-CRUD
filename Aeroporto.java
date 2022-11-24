import java.util.Scanner;

public class Aeroporto {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        
        do{
            
            System.out.println("\n------AEROPORTO------\n");
            System.out.println("[1] - Cadastrar Hangar");
            System.out.println("[2] - Cadastrar Companhia");
            System.out.println("[3] - Cadastrar Pista");
            System.out.println("[4] - Cadastrar Voo");
            System.out.println("[5] - Cadastrar Jato");
            System.out.println("[6] - Cadastrar Aviao");
            System.out.println("[7] - Cadastrar Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[8] - Listar Hangar");
            System.out.println("[9] - Listar Companhia");
            System.out.println("[10] - Listar Pista");
            System.out.println("[11] - Listar Voo");
            System.out.println("[12] - Listar Jato");
            System.out.println("[13] - Listar Aviao");
            System.out.println("[14] - Listar Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[8] - Incluir Hangar");
            System.out.println("[9] - Incluir Companhia");
            System.out.println("[10] - Incluir Pista");
            System.out.println("[11] - Incluir Voo");
            System.out.println("[12] - Incluir Jato");
            System.out.println("[13] - Incluir Aviao");
            System.out.println("[14] - Incluir Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[8] - Editiar Hangar");
            System.out.println("[9] - Editiar Companhia");
            System.out.println("[10] - Editiar Pista");
            System.out.println("[11] - Editiar Voo");
            System.out.println("[12] - Editiar Jato");
            System.out.println("[13] - Editiar Aviao");
            System.out.println("[14] - Editiar Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[8] - Excluir Hangar");
            System.out.println("[9] - Excluir Companhia");
            System.out.println("[10] - Excluir Pista");
            System.out.println("[11] - Excluir Voo");
            System.out.println("[12] - Excluir Jato");
            System.out.println("[13] - Excluir Aviao");
            System.out.println("[14] - Excluir Helicoptero");
            System.out.print("\nDigite a opcao: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    CadastrarHangar();
                    break;

                case 2:
                    CadastrarCompanhia();
                    break;
        
                case 3:
                    CadastrarPista();
                    break;
                    
                case 4:
                    
                    break;    
                default:
                    break;
            }

        
        }while (menu != 0);

    }
}
