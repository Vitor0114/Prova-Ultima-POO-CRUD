import java.util.ArrayList;

public abstract class Aeromodelo {
    
    protected int id;
    protected String marca;
    protected String modelo;
    public static Aeromodelo[] aeromodelos;
    public static ArrayList<Aeromodelo> aeronaves = new ArrayList<Aeromodelo>();


    
    public Aeromodelo() {

    }
    

    public Aeromodelo(int id, String marca, String modelo) {
        
        this.id = id;
        this.marca = modelo;
        this.modelo = modelo;
        aeronaves.add(this);
    }

    
    public Aeromodelo(String marca, String modelo) {

    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    

    @Override
    public String toString() {
        return "| Id: " + this.id + " | Marca: " + this.marca + " | Modelo: " + this.modelo;
    }

    

    

}
    

