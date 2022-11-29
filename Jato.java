import java.util.ArrayList;

public class Jato extends Aeromodelo {
    
    private String cor;
    private int velocidade;
    public static ArrayList<Jato> jatos = new ArrayList<Jato>();
    private Generic<String, Integer> prefixo;

    public Jato() {


    }

    public Jato(int id, String marca, String modelo, String cor, int velocidade, Generic<String, Integer> prefixo) {

        super(id, marca, modelo);
        try{
            if(jatos.isEmpty()) {   
                     
                this.prefixo = prefixo;
                this.cor = cor;
                this.velocidade = velocidade;
        
                jatos.add(this);
            }else if(!jatos.isEmpty())
                for(Jato jato : jatos){
                    if(jato.getPrefixo().equals(prefixo)){
                        throw new Exception("Prefixo já cadastrado!");
                    }else{
                        this.prefixo = prefixo;
                        this.cor = cor;
                        this.velocidade = velocidade;
                
                        jatos.add(this);
                    }
            }else{
                throw new Exception("Jato já cadastrado");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
        

    }

    public Jato(String marca, String modelo, String cor, int velocidade) {
        
        this.cor = cor;
        this.velocidade = velocidade;
    }


    public Generic<String, Integer> getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(Generic<String, Integer> prefixo) {
        this.prefixo = prefixo;
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


}
