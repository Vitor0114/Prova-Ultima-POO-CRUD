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
            System.out.println("[15] - Incluir Hangar");
            System.out.println("[16] - Incluir Companhia");
            System.out.println("[17] - Incluir Pista");
            System.out.println("[18] - Incluir Voo");
            System.out.println("[19] - Incluir Jato");
            System.out.println("[20] - Incluir Aviao");
            System.out.println("[21] - Incluir Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[22] - Editar Hangar");
            System.out.println("[23] - Editar Companhia");
            System.out.println("[24] - Editar Pista");
            System.out.println("[25] - Editar Voo");
            System.out.println("[26] - Editar Jato");
            System.out.println("[27] - Editar Aviao");
            System.out.println("[28] - Editar Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[29] - Excluir Hangar");
            System.out.println("[30] - Excluir Companhia");
            System.out.println("[31] - Excluir Pista");
            System.out.println("[32] - Excluir Voo");
            System.out.println("[33] - Excluir Jato");
            System.out.println("[34] - Excluir Aviao");
            System.out.println("[35] - Excluir Helicoptero");
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
                    CadastrarVoo();
                    break;    

                case 5:
                    CadastrarJato();
                    break;

                case 6:
                    CadastrarAviao();
                    break;

                case 7:
                    CadastrarHelicoptero();
                    break;

                case 8:
                    ListarHangar();
                    break;

                case 9:
                    ListarCompanhia();
                    break;

                case 10:
                    ListarPista();
                    break;

                case 11:
                    ListarVoo();
                    break;

                case 12:
                    ListarJato();
                    break;

                case 13:
                    ListarAviao();
                    break;

                case 14:
                    ListarHelicoptero();
                    break;

                case 15:
                    IncluirHangar();
                    break;

                case 16:
                    IncluirCompanhia();
                    break;

                case 17:
                    IncluirPista();
                    break;

                case 18:
                    IncluirVoo(); 
                    break;

                case 19:
                    IncluirJato();
                    break;
                    
                case 20:
                    IncluirAviao();
                    break;

                case 21:
                    IncluirHelicoptero();
                    break;

                case 22:
                    EditarHangar();
                    break;

                case 23:
                    EditarCompanhia();
                    break;

                case 24:
                    EditarPista();
                    break;
                
                case 25:
                    EditarVoo();
                    break;

                case 26:
                    EditarJato();
                    break;

                case 27:
                    EditarAviao();
                    break;

                case 28:
                    EditarHelicoptero();
                    break;

                case 29:
                    ExcluirHangar();
                    break;

                case 30:
                    ExcluirCompanhia();
                    break;

                case 31:
                    ExcluirPista();
                    break;

                case 32:
                    ExcluirVoo();
                    break;
                
                case 33:
                    ExcluirAviao();
                    break;
            
                case 34:
                    ExcluirHelicoptero();
                    break;
                default:
                    break;
            }

        
        }while (menu != 0);

    }

    private static void ExcluirHelicoptero() {
    }

    private static void ExcluirAviao() {
    }

    private static void ExcluirVoo() {
    }

    private static void ExcluirPista() {
    }

    private static void ExcluirCompanhia() {
    }

    private static void ExcluirHangar() {
    }

    private static void EditarHelicoptero() {
    }

    private static void EditarAviao() {
    }

    private static void EditarJato() {
    }

    private static void EditarVoo() {
    }

    private static void EditarPista() {
    }

    private static void EditarCompanhia() {
    }

    private static void EditarHangar() {
    }

    private static void IncluirHelicoptero() {
    }

    private static void IncluirAviao() {
    }

    private static void IncluirJato() {
    }

    private static void IncluirVoo() {
    }

    private static void IncluirPista() {
    }

    private static void IncluirCompanhia() {
    }

    private static void IncluirHangar() {
    }

    private static void ListarHelicoptero() {
    }

    private static void ListarAviao() {
    }

    private static void ListarJato() {
    }

    private static void ListarVoo() {
    }

    private static void ListarPista() {
    }

    private static void ListarCompanhia() {
    }

    private static void ListarHangar() {
    }

    private static void CadastrarHelicoptero() {
    }

    private static void CadastrarAviao() {
    }

    private static void CadastrarJato() {
    }

    private static void CadastrarVoo() {
    }

    private static void CadastrarPista() {
    }

    private static void CadastrarCompanhia() {
    }

    private static void CadastrarHangar() {
    }
}
