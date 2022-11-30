import java.util.ArrayList;

public class Aviao extends Aeromodelo {

    private Generic<String, Integer> prefixo;
    private String capacidade;
    private int idCompanhia;
    private Companhia companhia;

    public static ArrayList<Aviao> avioes = new ArrayList<Aviao>();

    public Aviao (int id, String nome, Generic<String, Integer> prefixo, String marca, String modelo, String capacidade, Companhia companhia, int idCompanhia) {

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

    public Generic<String, Integer> getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(Generic<String, Integer> prefixo) {
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


    public Boolean verificaPrefixo(Generic<String, Integer> prefixo){
        for(Aviao aviao: avioes){
            if( aviao.getPrefixo().equals(prefixo) == true){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return super.toString()+ "| Id: " + this.id + " | Placa: " + this.prefixo + " | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Capacidade: " + this.capacidade + " | Companhia: " + this.companhia + " | IdCompanhia: " + this.idCompanhia;
    }


    public static Aviao getAviaoById(int id) {
        for (Aviao aviao : Aviao.avioes) {
            if (aviao.id == id) {
                return aviao;
            }
        }

        return null;
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

}