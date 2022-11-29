import java.util.ArrayList;

public class Aviao extends Aeromodelo {

    private Generic<String, Integer> prefixo;
    private String capacidade;
    private int idCompanhia;
    public static ArrayList<Aviao> avioes = new ArrayList<Aviao>();

    public Aviao (int id, String nome, Generic<String, Integer> prefixo, String marca, String modelo, String capacidade, int idCompanhia) {

        super(id, marca, modelo);
        try{
            if(avioes.isEmpty()) {   
                     
                this.prefixo = prefixo;
                this.capacidade = capacidade;
                this.idCompanhia = idCompanhia;
        
                avioes.add(this);
            }else if(!avioes.isEmpty())
                for(Aviao aviao : avioes){
                    if(aviao.getPrefixo().equals(prefixo)){
                        throw new Exception("Prefixo já cadastrado!");
                    }else{
                        this.prefixo = prefixo;
                        this.capacidade = capacidade;
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

    

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public int getIdCompanhia() {
        return idCompanhia;
    }

    public void setIdCompanhia(int idCompanhia) {
        this.idCompanhia = idCompanhia;
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
        return super.toString() + "| Placa: " + this.prefixo + " | Marca: " + this.getMarca() + " | Modelo: " + this.getModelo() + " | Capacidade: " + this.capacidade + " | IdCompanhia: " + this.idCompanhia;
    }


    public static Aviao getAviaoById(int id) {
        for (Aviao aviao : Aviao.avioes) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }

        return null;
    }


    public static Aviao deleteAviaoById(int id) {
        for (Aviao aviao : Aviao.avioes) {
            if (aviao.getId() == id) {
                aviao.avioes.remove(aviao);
                return aviao;
            }
        }

        return null;
    }

}