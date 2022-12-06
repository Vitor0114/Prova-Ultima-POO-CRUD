import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.jws.WebParam.Mode;

public class Helicoptero extends Aeromodelo{
    
    private String cor;
    private int capacidade;
    public static ArrayList<Helicoptero> helicopteros = new ArrayList<Helicoptero>();
    

    public Helicoptero(ResultSet rs) {

    }


    public Helicoptero(String cor, int capacidade, int id, String marca, String modelo) {
        
        super(id, marca, modelo);
        try{
            if(helicopteros.isEmpty()) {   
                
                this.cor = cor;
                this.capacidade = capacidade;
                helicopteros.add(this);
                    
            }else{
                throw new Exception("Helicoptero já cadastrado");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   

    }

    
    public Helicoptero(String marca, String modelo, String cor, int capacidade) {
        
        super(marca, modelo);
        try{
            if(helicopteros.isEmpty()) {   
                
                this.cor = cor;
                this.capacidade = capacidade;
                helicopteros.add(this);
                    
            }else{
                throw new Exception("Helicoptero já cadastrado");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }  
        
    }
    

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public static Helicoptero getHelicopteroById(int id) {
        for (Helicoptero helicoptero : Helicoptero.helicopteros) {
            if (helicoptero.id == id) {
                return helicoptero;
            }
        }

        return null;
    }


    public static Helicoptero deleteHelicopteroById(int id) {
        for (Helicoptero helicoptero : Helicoptero.helicopteros) {
            if (helicoptero.id == id) {
                Helicoptero.helicopteros.remove(helicoptero);
                return helicoptero;
            }
        }

        return null;
    }

    public static void printAviao(
            ArrayList<Helicoptero> aviaos) {
        try {
            for (Helicoptero helicopetero : aviaos) {
                System.out.println(helicopetero);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static ArrayList<Helicoptero> getAviaoS() throws Exception {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            System.out.println("Mostrando dados presente no banco de dados");
            ResultSet rs = stm.executeQuery("SELECT * FROM helicoptero;");
            ArrayList<Helicoptero> aviaos = new ArrayList<>();
            while (rs.next()) {
                aviaos.add(new Helicoptero(rs));
            }
            DAO.deleteConnect();
            return aviaos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static Helicoptero getAviaoInsert(Scanner scanner) {
        
        System.out.println("Informe a cor do Helicoptero");
        String cor = scanner.next();
        System.out.println("Informe o capacidadedo Helicoptero");
        String capacidade= scanner.next();

        Helicoptero helicoptero = new Helicoptero(cor, 0, 0, cor, capacidade);

        return helicoptero;
    }
    
    public static void insertHelicopeteroS(Helicoptero helicoptero) {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            System.out.println("Inserindo dados no banco de dados");
            stm.execute("Insertinto helicoptero "
                    + "(cor, modelo, capacidade,companhia) VALUES "
                    + "'" + helicoptero.getCor() + "','" + helicoptero.getCapacidade());
            System.out.println("Dados inseridos com sucesso");
            System.out.println(helicoptero);
            DAO.deleteConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Helicoptero getHelicopteroUpdate(Scanner scanner) throws Exception {
        try {
            Helicoptero helicoptero = getAviao(scanner);
            System.out.println("Informe a cor do helicopetero");
            String cor = scanner.next();
            System.out.println("Informe o capacidadedo avião");
            String capacidade = scanner.next();
            return helicoptero;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void updateAviaoS(Helicoptero helicoptero) throws Exception {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");
            stm.execute("UPDATE helicoptero SET "
                    + " cor = '" + helicoptero.getCor() + "'"
                    + ", capacidade= '" + helicoptero.getModelo() + "'"
                    + ", capacidade = '" + helicoptero.getCapacidade() + "'"
                    + " WHERE id = " + helicoptero.getId());
            System.out.println("Dados atualizados com sucesso");
            DAO.deleteConnect();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static Helicoptero getAviao(Scanner scanner) throws Exception {
        try {
            System.out.println("Informe o ID do helicoptero: ");
            int id = scanner.nextInt();
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            Statement stm = con.createStatement();
            System.out.println("Banco de Dados conectado");

            ResultSet rs = stm.executeQuery("SELECT * FROM helicoptero WHERE id = " + id);

            if (!rs.next()) {
                throw new Exception("Id inválido");
            }

            Helicoptero helicoptero = new Helicoptero(rs);
            DAO.deleteConnect();
            return helicoptero;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void deleteHelicopteroS(Helicoptero helicoptero) {
        try {
            System.out.println("Conectando ao banco de dados");
            Connection con = DAO.getConnect();
            System.out.println("Banco de Dados conectado");
            System.out.println("Deletando Dados do banco");
            PreparedStatement pStm = con.prepareStatement("DELETE FROM helicoptero WHERE id = ?");
            pStm.setInt(1, helicoptero.getId());
            System.out.println("Dados deletado com sucesso");
            if (pStm.executeUpdate() <= 0) {
                System.out.println("Falha na execução.");
            }
            DAO.deleteConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Cor: " + this.cor + " | Capacidade: " + this.capacidade;
    }

}
