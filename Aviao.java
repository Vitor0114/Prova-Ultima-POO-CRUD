import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Aviao extends Aeromodelo {

    private Prefixo<String, Integer> prefixo;
    private String capacidade;
    private int idCompanhia;
    private Companhia companhia;

    public static ArrayList<Aviao> avioes = new ArrayList<Aviao>();

    public Aviao (int id, String nome, Prefixo<String, Integer> prefixo, String marca, String modelo, String capacidade, Companhia companhia, int idCompanhia) {

        super(id, marca, modelo);
        try{
            if(avioes.isEmpty()) {   
                this.idCompanhia = idCompanhia;
                this.prefixo = prefixo;
                this.capacidade = capacidade;
                this.companhia = companhia;
        
                avioes.add(this);
            }else if(!avioes.isEmpty())
                for(Aviao aviao : avioes){
                    if(aviao.getPrefixo().equals(prefixo)){
                        throw new Exception("Prefixo já cadastrado!");
                    }else{
                        this.prefixo = prefixo;
                        this.capacidade = capacidade;
                        this.companhia = companhia;
                        this.idCompanhia = idCompanhia;
                
                        avioes.add(this);
                    }
            }else{
                throw new Exception("Avião já cadastrado");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   

    }

    public Aviao(ResultSet rs) {
    }

    public Prefixo<String, Integer> getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(Prefixo<String, Integer> prefixo) {
        this.prefixo = prefixo;
    }

    
    public int getIdCompanhia() {
        return idCompanhia;
    }

    public void setIdCompanhia(int idCompanhia) {
        this.idCompanhia = idCompanhia;
    }


    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }


    public Boolean verificaPrefixo(Prefixo<String, Integer> prefixo){
        for(Aviao aviao: avioes){
            if( aviao.getPrefixo().equals(prefixo) == true){
                return true;
            }
        }
        return false;
    }


    public static Aviao getAviaoById(int id) {
        for (Aviao aviao : Aviao.avioes) {
            if (aviao.id == id) {
                return aviao;
            }
        }

        return null;
    }


    public static Aviao getAviao(Scanner scanner) throws Exception {
        try {
            System.out.println("Informe o ID do aviao: ");
            int id = scanner.nextInt();
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");

            ResultSet rs = stm.executeQuery("SELECT * FROM aviao WHERE id = " + id);

            if (!rs.next()) {
                throw new Exception("Id inválido");
            }

            Aviao aviao = new Aviao(rs);
            DAO.deleteConnect();
            return aviao;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void updateAviao(int id, String nome, Prefixo<String, Integer> prefixo, String marca, String modelo, String capacidade, Companhia companhia, int idCompanhia) throws Exception{
        Connection con = DAO.getConnect();
        Statement stm = con.createStatement();
        stm.execute("UPDATE Companhia SET "
        + ", marca = '" + marca + "'"
        + ", modelo = '" + modelo + "'"
        + ", capacidade = '" + capacidade + "'"
        + ", companhia = '" + companhia + "'"
        + ", idCompanhia = '" + idCompanhia + "'"
        + ", prefixo= '" + prefixo + "'"
        + ", nome = '" + nome + "'"
        + " WHERE id = " + id);
        stm.close();
        con.close();

    }



    public static void deleteAviaoPS(Aviao aviao) {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            System.out.println("Banco de Dados conectado");
            System.out.println("Deletando Dados do banco");
            PreparedStatement pStm = con.prepareStatement("DELETE FROM aviao WHERE id = ?");
            pStm.setInt(1, aviao.getId());
            System.out.println("Dados deletado com sucesso");
            if (pStm.executeUpdate() <= 0) {
                System.out.println("Falha na execução.");
            }
            DAO.deleteConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    public static Aviao deleteAviaoById(int id) {
        for (Aviao aviao : Aviao.avioes) {
            if (aviao.id == id) {
                Aviao.avioes.remove(aviao);
                return aviao;
            }
        }

        return null;
    }


    public static Aviao getAviaoUpdate(Scanner scanner) throws Exception {
        try {
            Aviao aviao = getAviao(scanner);
            System.out.println("Informe a marca do aviao");
            String marca = scanner.next();
            System.out.println("Informe o modelo do avião");
            String modelo = scanner.next();
            System.out.println("Informe a capacidade do avião");
            String capacidade = scanner.next();
            return aviao;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void updateAviaoS(Aviao aviao) throws Exception {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            stm.execute("UPDATE aviao SET "
                    + " marca = '" + aviao.getMarca() + "'"
                    + ", modelo = '" + aviao.getModelo() + "'"
                    + ", capacidade = '" + aviao.getCapacidade() + "'"
                    + ", id_companhia = '" + aviao.getCompanhia().getId() + "'"
                    + " WHERE id = " + aviao.getId());
            System.out.println("Dados atualizados com sucesso");
            DAO.deleteConnect();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }




    public static Aviao getAviaoInsert(Scanner scanner) {

        System.out.println("Informe a marca do Aviao");
        String marca = scanner.next();
        System.out.println("Informe o modelo do Aviao");
        String modelo = scanner.next();
        System.out.println("Informe a capacidade do Aviao");
        String capacidade = scanner.next();

        return new Aviao(0, capacidade, null, marca, modelo, capacidade, null, 0);
    }

    
    public static void insertAviaoS(Aviao aviao) {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            System.out.println("Inserindo dados no banco de dados");
            stm.execute("Insert into aviao "
                    + "(marca, modelo, capacidade,companhia) VALUES "
                    + "('" + aviao.getMarca() + "', '" + aviao.getModelo() + "', '" + aviao.getCapacidade() + "', '"
                    + aviao.getCompanhia().getId() + "')");
            System.out.println("Dados inseridos com sucesso");
            System.out.println(aviao);
            DAO.deleteConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void printAviao(
            ArrayList<Aviao> aviaos) {
        try {
            for (Aviao aviao : aviaos) {
                System.out.println(aviao);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static ArrayList<Aviao> getAviaoS() throws Exception {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            System.out.println("Mostrando dados presente no banco de dados");
            ResultSet rs = stm.executeQuery("SELECT * FROM aviao;");
            ArrayList<Aviao> aviaos = new ArrayList<>();
            while (rs.next()) {
                aviaos.add(
                        new Aviao(rs));
            }
            DAO.deleteConnect();
            return aviaos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    
    @Override
    public String toString() {
        return super.toString()+ "| Id: " + this.id + " | Placa: " + this.prefixo + " | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Capacidade: " + this.capacidade + " | Companhia: " + this.companhia + " | IdCompanhia: " + this.idCompanhia;
    }



}