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
                    CadastrarHangar(scanner);
                    break;

                case 2:
                    CadastrarCompanhia(scanner);
                    break;
        
                case 3:
                    CadastrarPista(scanner);
                    break;
                    
                case 4:
                    CadastrarVoo(scanner);
                    break;    

                case 5:
                    CadastrarJato(scanner);
                    break;

                case 6:
                    if (Companhia.companhias.size() > 0) {
                        CadastrarAviao(scanner);
                    } else {
                    System.out.println("Cadastre uma companhia antes de cadastrar um aviao");
                    }
                    break;

                case 7:
                    CadastrarHelicoptero(scanner);
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

    private static void CadastrarHelicoptero(Scanner scanner) {

    }

    private static void CadastrarAviao(Scanner scanner) {

        Boolean prefixoVerificada = false;
        System.out.println("------Cadastro de Aviao------");

        System.out.print("\nInforme a marca do Aviao: ");
        String marca = scanner.next();

        System.out.print("\nInforme o Modelo do Aviao: ");
        String modelo = scanner.next();

        System.out.print("\nInforme a capacidade do Aviao: ");
        String capacidade = scanner.next();

        System.out.print("\nInforme as letras da prefixo do aviao: ");
        String letra = scanner.next();

        System.out.print("\nInforme os números prefixo do aviao: ");
        String numero = scanner.next();

        System.out.print("\nInforme a companhia do aviao: ");
        int companhia = scanner.nextInt();

        while (prefixoVerificada != true) {
            if (letra.length() == 3 && numero.length() == 4) {
                prefixoVerificada = true;
            } else if (letra.length() != 3 && numero.length() == 4) {
                System.out.println("Digite as letras da prefixo novamente: ");
                letra = scanner.next();
            } else if (letra.length() == 3 && numero.length() != 4) {
                System.out.println("Digite os números da prefixo novamente ");
                numero = scanner.next();
            } else {
                System.out.println("Digite as letras da prefixo novamente");
                letra = scanner.next();
            }
        }

        if (prefixoVerificada == true) {
            Generic<String, Integer> prefixo = new Generic<String, Integer>(letra, Integer.parseInt(numero));
            try {
                Aviao aviao = new Aviao(Aviao.aviaos.size() + 1, prefixo, marca, modelo, companhia, capacidade);
                while (aviao.getPrefixo() == null) {
                    int idAviao = aviao.getId();
                    System.out.println("Já cadastrada");
                    System.out.println("Digite as letras da prefixo novamente");
                    letra = scanner.next();
                    System.out.println("Digite os numeros da prefixo novamente");
                    numero = scanner.next();
                    prefixo = new Prefixo<String, Integer>(letra, Integer.parseInt(numero));
                    for (Aeronave aeronave : Aeronave.aeronaves) {
                        if (aeronave instanceof Aviao && aeronave.getId() == idAviao) {
                            Aeronave.aeoronaves.remove(aviao);
                            break;
                        }
                    }
                    aviao = new Aviao(Aviao.aviaos.size() + 1, prefixo, marca, modelo, companhia, capacidade);
                }
                System.out.println("Aviao cadastrado com sucesso!\n" + aviao);
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar aviao: " + e.getMessage());
            }

        }



    }

    private static void CadastrarJato(Scanner scanner) {
    }

    private static void CadastrarVoo(Scanner scanner) {
    }

    private static void CadastrarPista(Scanner scanner) {
    }

    private static void CadastrarCompanhia(Scanner scanner) {
    }

    private static void CadastrarHangar(Scanner scanner) {

    }
}
