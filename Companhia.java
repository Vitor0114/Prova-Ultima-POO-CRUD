import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Companhia {
    public int id;
    public String nome;
    public String cnpj;
    public static ArrayList<Companhia> companhias = new ArrayList<Companhia>();

    
    public Companhia() {

    }
    

    public Companhia(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    
    public Companhia(String nome, String cnpj) {

        this.nome = nome;
        this.cnpj = cnpj;
    }
    

    public Companhia(ResultSet rs) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    

    public static Companhia getCompanhiaById(int id) {
        for (Companhia companhia : Companhia.companhias) {
            if (companhia.id == id) {
                return companhia;
            }
        }

        return null;
    }


    public static Companhia deleteCompanhiaById(int id) {
        for (Companhia companhia : Companhia.companhias) {
            if (companhia.id == id) {
                Companhia.companhias.remove(companhia);
                return companhia;
            }
        }

        return null;
    }


    public static void printAviao(
            ArrayList<Companhia> companhias) {
        try {
            for (Companhia companhia : companhias) {
                System.out.println(companhia);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void updateCompanhia(int id, String nome, String cnpj) throws Exception{
        Connection con = DAO.getConnect();
        Statement stm = con.createStatement();
        stm.execute("UPDATE Companhia SET "
        + ", cnpj= '" + cnpj + "'"
        + ", nome = '" + nome + "'"
        + " WHERE id = " + id);
        stm.close();
        con.close();

    }


    public static Companhia getAviaoInsert(Scanner scanner) {

        System.out.println("Informe o nome da Companhia");
        String nome = scanner.next();
        System.out.println("Informe o Cnpj Companhia");
        String cnpj = scanner.next();

        return new Companhia(0, nome, cnpj);
    }


    public static void insertCompanhiaS(Companhia companhia) {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            System.out.println("Inserindo dados no banco de dados");
            stm.execute("Insert into companhia "
                    + "(nome,cnpj) VALUES "
                    + "('" + companhia.getNome() + "', '" + companhia.getCnpj() + "')");
            System.out.println("Dados inseridos com sucesso");
            System.out.println(companhia);
            DAO.deleteConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static Companhia getAviaoUpdate(Scanner scanner) throws Exception {
        try {
            Companhia companhia = getAviao(scanner);
            System.out.println("Informe a marca do companhia");
            String marca = scanner.next();
            System.out.println("Informe o modelo do Companhia");
            String modelo = scanner.next();
            System.out.println("Informe a capacidade do Companhia");
            String capacidade = scanner.next();
            return companhia;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void updateAviaoS(Companhia companhia) throws Exception {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            stm.execute("UPDATE companhia SET "
                    + " marca = '" + companhia.getMarca() + "'"
                    + ", modelo = '" + companhia.getModelo() + "'"
                    + ", capacidade = '" + companhia.getCapacidade() + "'"
                    + ", id_companhia = '" + companhia.getCompanhia().getId() + "'"
                    + " WHERE id = " + companhia.getId());
            System.out.println("Dados atualizados com sucesso");
            DAO.deleteConnect();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    private Companhia getCompanhia() {
        return null;
    }


    private String getCapacidade() {
        return null;
    }


    private String getModelo() {
        return null;
    }


    private String getMarca() {
        return null;
    }


    public static Companhia getAviao(Scanner scanner) throws Exception {
        
        try {
            System.out.println("Informe o ID do companhia: ");
            int id = scanner.nextInt();
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");

            ResultSet rs = stm.executeQuery("SELECT * FROM companhia WHERE id = " + id);

            if (!rs.next()) {
                throw new Exception("Id inv??lido");
            }

            Companhia companhia = new Companhia(rs);
            DAO.deleteConnect();
            return companhia;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void deleteAviaoPS(Companhia companhia) {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            System.out.println("Banco de Dados conectado");
            System.out.println("Deletando Dados do banco");
            PreparedStatement pStm = con.prepareStatement("DELETE FROM companhia WHERE id = ?");
            pStm.setInt(1, companhia.getId());
            System.out.println("Dados deletado com sucesso");
            if (pStm.executeUpdate() <= 0) {
                System.out.println("Falha na execu????o.");
            }
            DAO.deleteConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Nome: " + this.nome + " | Cnpj: " + this.cnpj;
    }


}
