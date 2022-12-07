import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class Jato extends Aeromodelo {
    
    private String cor;
    private int velocidade;
    public static ArrayList<Jato> jatos = new ArrayList<Jato>();

    
    public Jato() {
    }
    

    public Jato(int id, String marca, String modelo, String cor, int velocidade) {

        super(id, marca, modelo);
        try{
            if(jatos.isEmpty()) {   
                    
                this.cor = cor;
                this.velocidade = velocidade;
                jatos.add(this);

            }else{
                    throw new Exception("Jato já cadastrado");
            }
        }catch(Exception e){
             System.out.println(e.getMessage());
            
        

        }
    }

    
    public Jato(String marca, String modelo, String cor, int velocidade) {
        
        try{
            if(jatos.isEmpty()) {   
                    
                this.marca = marca;
                this.modelo = modelo;
                this.cor = cor;
                this.velocidade = velocidade;
                jatos.add(this);

            }else{
                    throw new Exception("Jato já cadastrado");
            }
        }catch(Exception e){
             System.out.println(e.getMessage());
            
        

        }



        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Cor: " + this.cor + " | Velocidade: " + this.velocidade;
    }

    public static Jato getJatoById(int id) {
        for (Jato jato : Jato.jatos) {
            if (jato.id == id) {
                return jato;
            }
        }

        return null;
    }

    public static void updateJato(int id, String marca, String modelo, String cor, int velocidade) throws Exception{
        Connection con = DAO.getConnect();
        Statement stm = con.createStatement();
        stm.execute("UPDATE Jato SET "
        + " velocidade = '" + velocidade + "'"
        + ", cor= '" + cor + "'"
        + ", modelo = '" + modelo + "'"
        + ", marca = '" + marca + "'"
        + " WHERE id = " + id);
        stm.close();
        con.close();
    }


    public static Jato deleteJatoById(int id) {
        for (Jato jato : Jato.jatos) {
            if (jato.id == id) {
                Jato.jatos.remove(jato);
                return jato;
            }
        }

        return null;
    }

}
