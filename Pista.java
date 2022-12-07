import java.util.ArrayList;

public class Pista {

    private int id;
    private String numero;
    public static ArrayList<Pista> pistas = new ArrayList<Pista>();

    public Pista(){
        
    }

    public Pista(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public Pista(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Numero: "+ this.numero;
    }


    public static Pista getPistaById(int id) {
        for (Pista pista : Pista.pistas) {
            if (pista.id == id) {
                return pista;
            }
        }

        return null;
    }


    



    public static Pista deletePistaById(int id) {
        for (Pista pista : Pista.pistas) {
            if (pista.id == id) {
                Pista.pistas.remove(pista);
                return pista;
            }
        }

        return null;
    }



}
