import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Aeroporto {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        FileWriter arq = new FileWriter("Aeroporto.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        int menu = 0;

        do {

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
            System.out.println("[15] - Editar Hangar");
            System.out.println("[16] - Editar Companhia");
            System.out.println("[17] - Editar Pista");
            System.out.println("[18] - Editar Voo");
            System.out.println("[19] - Editar Jato");
            System.out.println("[20] - Editar Aviao");
            System.out.println("[21] - Editar Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("[22] - Excluir Hangar");
            System.out.println("[23] - Excluir Companhia");
            System.out.println("[24] - Excluir Pista");
            System.out.println("[25] - Excluir Voo");
            System.out.println("[26] - Excluir Jato");
            System.out.println("[27] - Excluir Aviao");
            System.out.println("[28] - Excluir Helicoptero");
            System.out.println("\n---------------\n");
            System.out.println("\n[29] - Salvar Arquivo\n");
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
                    EditarHangar();
                    break;

                case 16:
                    EditarCompanhia(scanner);
                    break;

                case 17:
                    EditarPista();
                    break;

                case 18:
                    EditarVoo(scanner);
                    break;

                case 19:
                    EditarJato(scanner);
                    break;

                case 20:
                    EditarAviao(scanner);
                    break;

                case 21:
                    EditarHelicoptero(scanner);
                    break;

                case 22:
                    ExcluirHangar(scanner);
                    break;

                case 23:
                    ExcluirCompanhia(scanner);
                    break;

                case 24:
                    ExcluirPista(scanner);
                    break;

                case 25:
                    ExcluirVoo(scanner);
                    break;

                case 26:
                    ExcluirJato(scanner);
                    break;

                case 27:
                    ExcluirAviao(scanner);
                    break;

                case 28:
                    ExcluirHelicoptero(scanner);
                    break;

                case 29:
                    SalvarArquivo(gravarArq);
                    break;

                default:
                    break;
            }

        } while (menu != 0);

    }

    private static void ExcluirHelicoptero(Scanner scanner) {

        System.out.println("\n------Exclusão de Helicoptero------\n");

        System.out.print("\nInforme o ID do Helicopetero: ");
        int id = scanner.nextInt();

        for (Helicoptero helicoptero : Helicoptero.helicopteros) {
            if (helicoptero instanceof Helicoptero && helicoptero.getId() == id) {
                Helicoptero.helicopteros.remove(helicoptero);
                System.out.println("Helicoptero excluído com sucesso!");
                break;
            }
        }

    }

    private static void ExcluirAviao(Scanner scanner) {

        System.out.println("\n------Exclusão de Aviao------\n");

        System.out.print("\nInforme o ID do Aviao: ");
        int id = scanner.nextInt();

        for (Aviao aviao : Aviao.avioes) {
            if (aviao instanceof Aviao && aviao.getId() == id) {
                Aviao.avioes.remove(aviao);
                System.out.println("Avião excluído com sucesso!");
                break;
            }
        }

    }

    private static void ExcluirVoo(Scanner scanner) {

        System.out.println("\n------Exclusão de Voo------\n");

        System.out.print("\nInforme o ID do Voo: ");
        int id = scanner.nextInt();

        for (Voo voo : Voo.voos) {
            if (voo instanceof Voo && voo.getId() == id) {
                Voo.voos.remove(voo);
                System.out.println("Voo excluído com sucesso!");
                break;
            }
        }
    }

    private static void ExcluirJato(Scanner scanner) {

        System.out.println("\n------Exclusão de Jato------\n");

        System.out.println("Informe o ID de Jato: ");
        int id = scanner.nextInt();

        for (Jato jato : Jato.jatos) {
            if (jato instanceof Jato && jato.getId() == id) {
                Jato.jatos.remove(jato);
                System.out.println("Jato excluído com sucesso!");
                break;
            }
        }

    }

    private static void ExcluirPista(Scanner scanner) {

        System.out.println("------Exclusão de Pista------");

        System.out.print("\nInforme o ID da Pista: ");
        int id = scanner.nextInt();

        for (Pista pista : Pista.pistas) {
            if (pista instanceof Pista && pista.getId() == id) {
                Pista.pistas.remove(pista);
                System.out.println("Pista excluída com sucesso!");
                break;
            }
        }

    }

    private static void ExcluirCompanhia(Scanner scanner) {

        System.out.println("\n------Exclusão de Companhia------\n");

        System.out.println("Informe o ID da Companhia: ");
        int id = scanner.nextInt();

        for (Companhia companhia : Companhia.companhias) {
            if (companhia instanceof Companhia && companhia.getId() == id) {
                Companhia.companhias.remove(companhia);
                System.out.println("Companhia excluída com sucesso!");
                break;
            }
        }

    }

    private static void ExcluirHangar(Scanner scanner) {

        System.out.println("\n------Exclusão de Hangar------\n");

        System.out.print("\nInforme o ID do Hangar: ");
        int id = scanner.nextInt();

        for (Hangar hangar : Hangar.hangares) {
            if (hangar instanceof Hangar && Hangar.getId() == id) {
                Hangar.hangares.remove(hangar);
                System.out.println("Hangar excluído com sucesso!");
                break;
            }
        }

    }

    private static void EditarHelicoptero(Scanner scanner) throws Exception {
        System.out.println("------Edição de Helicoptero------");
        System.out.println("Digite o id do Helicoptero a ser editado");
        int idHelicopitero = scanner.nextInt();

        System.out.print("\nInforme a marca do Helicoptero: ");
        String marca = scanner.next();

        System.out.print("\nInforme o modelo do Helicoptero: ");
        String modelo = scanner.next();

        System.out.print("\nInforme a cor do Helicoptero: ");
        String cor = scanner.next();

        System.out.print("\nInforme a Capacidade do Helicoptero: ");
        int capacidade = scanner.nextInt();

        Helicoptero.updateHelicoptero(idHelicopitero, marca, modelo, cor, capacidade);

        System.out.println("Helicopetero cadastrado com sucesso!\n");


    }

    private static void EditarAviao(Scanner scanner) throws Exception {

        
        Boolean prefixoVerificada = false;
        System.out.println("\n------Edição de Aviao------\n");

        
        System.out.println("Digite o id do Jato a ser editado");
        int idVoo = scanner.nextInt();

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

        Aviao.updateAviao(idVoo, numero, null, marca, modelo, capacidade, null, companhia);

    }

    private static void EditarJato(Scanner scanner) throws Exception {

        System.out.println("\n------Edição de Jato------\n");

        
        System.out.println("Digite o id do Jato a ser editado");
        int idJato = scanner.nextInt();

        System.out.print("\nInforme a marca do Jato: ");
        String marca = scanner.next();

        System.out.print("\nInforme a cor do Jato: ");
        String cor = scanner.next();

        System.out.print("\nInforme o modelo do Jato: ");
        String modelo = scanner.next();

        System.out.print("\nInforme a velocidade da Jato: ");
        int velocidade = scanner.nextInt();

        Jato.updateJato(idJato, marca, modelo, cor, velocidade);

        System.out.println("\nJato cadastrado com sucesso!\n" );

    }

    private static void EditarVoo(Scanner scanner) throws Exception {

        

    }

    private static void EditarPista() {
    }

    private static void EditarCompanhia(Scanner scanner) throws Exception {

        System.out.println("\n------Edição de Companhia------\n");

        System.out.println("Digite o id da Companhia a ser editado");
        int idCompanhia = scanner.nextInt();

        System.out.print("\nInforme o nome da Companhia: ");
        String nome = scanner.next();

        System.out.print("\nInforme o CNPJ Companhia: ");
        String cnpj = scanner.next();

        Companhia.updateCompanhia(idCompanhia, nome, cnpj);

        System.out.println("\nJato cadastrado com sucesso!\n");

    }

    private static void EditarHangar() {
    }

    private static void ListarHelicoptero() {

        System.out.println("\n------Listagem de Helicopetero------\n");

        for (Aeromodelo helicoptero : Aeromodelo.aeronaves) {
            if (helicoptero instanceof Helicoptero) {
                System.out.println(helicoptero);
            }
        }

    }

    private static void ListarAviao() {

        System.out.println("\n------Listagem de Aviao------\n");
        for (Aeromodelo aeronave : Aeromodelo.aeronaves) {
            if (aeronave instanceof Aviao) {
                System.out.println(aeronave);
            }
        }

    }

    private static void ListarJato() {

        System.out.println("------Listagem de Jato------");

        for (Aeromodelo jato : Aeromodelo.aeronaves) {
            if (jato instanceof Jato) {
                System.out.println(jato);
            }
        }

    }

    private static void ListarVoo() {

        System.out.println("\n------Listagem de VOO------\n");
        for (Voo voo : Voo.voos) {
            if (voo instanceof Voo) {
                System.out.println(voo);
            }
        }

    }

    private static void ListarPista() {

        System.out.println("\n------Listagem de Pista------\n");

        for (Pista pista : Pista.pistas) {
            if (pista instanceof Pista) {
                System.out.println(pista);
            }
        }

    }

    private static void ListarCompanhia() {

        System.out.println("\n------Listagem de Companhia------\n");

        for (Companhia companhia : Companhia.companhias) {
            if (companhia instanceof Companhia) {
                System.out.println(companhia);
            }
        }

    }

    private static void ListarHangar() {

        System.out.println("\n------Listagem de Hangar------\n");

        for (Hangar hangar : Hangar.hangares) {
            if (hangar instanceof Hangar) {
                System.out.println(hangar);
            }
        }

    }

    private static void CadastrarHelicoptero(Scanner scanner) {

        System.out.println("------Cadastro de Helicoptero------");

        System.out.print("\nInforme a marca do Helicoptero: ");
        String marca = scanner.next();

        System.out.print("\nInforme o modelo do Helicoptero: ");
        String modelo = scanner.next();

        System.out.print("\nInforme a cor do Helicoptero: ");
        String cor = scanner.next();

        System.out.print("\nInforme a Capacidade do Helicoptero: ");
        int capacidade = scanner.nextInt();

        Aeromodelo helicoptero = new Helicoptero(Helicoptero.helicopteros.size() + 1, cor, capacidade, marca, modelo);

        System.out.println("Helicopetero cadastrado com sucesso!\n" + helicoptero);

    }

    private static void CadastrarAviao(Scanner scanner) {

        Boolean prefixoVerificada = false;
        System.out.println("\n------Cadastro de Aviao------\n");

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
                System.out.print("\nDigite as letras da prefixo novamente: ");
                letra = scanner.next();
            } else if (letra.length() == 3 && numero.length() != 4) {
                System.out.print("\nDigite os números da prefixo novamente ");
                numero = scanner.next();
            } else {
                System.out.print("\nDigite as letras da prefixo novamente");
                letra = scanner.next();
            }
        }

        if (prefixoVerificada == true) {
            Prefixo<String, Integer> prefixo = new Prefixo<String, Integer>(letra, Integer.parseInt(numero));
            try {
                Aviao aviao = new Aviao(Aviao.avioes.size() + 1, numero, prefixo, marca, modelo, capacidade, null,
                        companhia);
                while (aviao.getPrefixo() == null) {
                    int idAviao = aviao.getId();
                    System.out.println("Já cadastrada");
                    System.out.print("\nDigite as letras da prefixo novamente");
                    letra = scanner.next();
                    System.out.println("Digite os numeros da prefixo novamente");
                    numero = scanner.next();
                    prefixo = new Prefixo<String, Integer>(letra, Integer.parseInt(numero));
                    for (Aeromodelo aeromodelo : Aeromodelo.aeronaves) {
                        if (aeromodelo instanceof Aviao && aeromodelo.getId() == idAviao) {
                            Aeromodelo.aeronaves.remove(aviao);
                            break;
                        }
                    }
                    aviao = new Aviao(idAviao, numero, null, marca, modelo, capacidade, null, companhia);
                }
                System.out.println("Aviao cadastrado com sucesso!\n" + aviao);
            } catch (Exception e) {
                System.out.println("\nErro ao cadastrar aviao: " + e.getMessage());
            }

        }

    }

    private static void CadastrarJato(Scanner scanner) {

        System.out.println("\n------Cadastro de Jato------\n");

        System.out.print("\nInforme a marca do Jato: ");
        String marca = scanner.next();

        System.out.print("\nInforme a cor do Jato: ");
        String cor = scanner.next();

        System.out.print("\nInforme o modelo do Jato: ");
        String modelo = scanner.next();

        System.out.print("\nInforme a velocidade da Jato: ");
        int velocidade = scanner.nextInt();

        Aeromodelo jato = new Jato(Jato.jatos.size() + 1, marca, cor, modelo, velocidade);
        System.out.println("\nJato cadastrado com sucesso!\n" + jato);

    }

    private static void CadastrarVoo(Scanner scanner) {

        System.out.println("\n------Cadastro de Voo------\n");

        System.out.print("\nInforme a data do Voo: ");
        String data = scanner.next();

        System.out.print("\nInforme o horario do Voo: ");
        String hora = scanner.next();

        System.out.print("\nInforme a origem do Voo: ");
        String origem = scanner.next();

        System.out.print("\nInforme o destino do Voo: ");
        String destino = scanner.next();

        System.out.print("\nInforme o Piloto do Voo: ");
        String piloto = scanner.next();

        System.out.print("\nInforme o Copiloto do Voo: ");
        String copiloto = scanner.next();

        System.out.print("\nObservações sobre o Voo: ");
        String observacao = scanner.next();

        System.out.print("\nInforme a pista de decolagem: ");
        int idPista = scanner.nextInt();

        System.out.print("\nInforme o id da Aeronave: ");
        int idAeronave = scanner.nextInt();

        Voo voo = new Voo(Voo.voos.size() + 1, observacao, data, hora, origem, destino, piloto, copiloto, observacao,
                idPista, null, idAeronave, null, idPista, null, idAeronave, null);

    }

    private static void CadastrarPista(Scanner scanner) {

        System.out.println("\n------Cadastro de Pista------\n");

        System.out.print("\nInforme o número da pista: ");
        String numero = scanner.next();

        Pista pista = new Pista(Pista.pistas.size() + 1, numero);
        System.out.println("Pista cadastrada com sucesso!\n" + pista);

    }

    private static void CadastrarCompanhia(Scanner scanner) {

        System.out.println("\n------Cadastro de Companhia------\n");

        System.out.print("\nInforme o nome da Companhia: ");
        String nome = scanner.next();

        System.out.print("\nInforme o CNPJ Companhia: ");
        String cnpj = scanner.next();

        Companhia companhia = new Companhia(Companhia.companhias.size() + 1, nome, cnpj);

        System.out.println("\nJato cadastrado com sucesso!\n" + companhia);

    }

    private static void CadastrarHangar(Scanner scanner) {

        System.out.println("\n------Cadastro de Hangar------\n");

        System.out.println("Aeronaves  Hangar: ");
        for (Aeromodelo aeromodelo : Aeromodelo.aeronaves) {
            if (aeromodelo instanceof Aeromodelo) {
                System.out.println(aeromodelo);
            }
        }

        System.out.println("Informe o id da Aeronave: ");
        int idAeromodelo = scanner.nextInt();

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        System.out.print("\nInforme o id da hangar: ");
        String id = scanner.next();

        System.out.print("\nInforme o numero da hangar:  ");
        String numero = scanner.next();

        Hangar hangar = new Hangar(Hangar.hangares.size() + 1, numero, idAeromodelo, null, null);

    }

    public static void SalvarArquivo(PrintWriter gravarArq) {
        System.out.println("------Salvar Voos em Arquivo------");
        gravarArq.println("------Voos Salvos no Sistema------");

        for (Voo voo : Voo.voos) {
            if (voo instanceof Voo) {
                gravarArq.println(voo);
            }
        }
    }

}