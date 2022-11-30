import java.util.ArrayList;

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

    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Nome: " + this.nome + " | Cnpj: " + this.cnpj;
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






}
