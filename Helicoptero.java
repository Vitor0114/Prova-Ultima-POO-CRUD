import java.util.ArrayList;

public class Helicoptero extends Aeromodelo{
    
    private String cor;
    private int capacidade;
    public static ArrayList<Helicoptero> helicopteros = new ArrayList<Helicoptero>();


    public Helicoptero() {

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

    /* 
    public Helicoptero(String marca, String modelo, String cor, int capacidade) {
        
        super(marca, modelo);
        try{
            if(helicopteros.isEmpty()) {   
                
                this.cor = cor;
                this.capacidade = capacidade;
        
                helicopteros.add(this);
            }else if(!helicopteros.isEmpty())
                for(Helicoptero helicoptero : helicopteros){
                    if(helicoptero.getPrefixo().equals(prefixo)){
                        throw new Exception("Prefixo já cadastrado!");
                    }else{
                        
                        this.cor = cor;
                        this.capacidade = capacidade;
                
                        helicopteros.add(this);
                    }
            }else{
                throw new Exception("Helicoptero já cadastrado");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
        
    }
    */

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

    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Cor: " + this.cor + " | Capacidade: " + this.capacidade;
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



}
