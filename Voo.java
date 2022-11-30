import java.util.ArrayList;

public class Voo {

    private int id;
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private Pista pista;
    private int idAviao;
    private Aviao aviao;
    private int idHelicopitero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jato;
    public static ArrayList<Voo> voos = new ArrayList<Voo>();

    public Voo(int id, String numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idAviao, Aviao aviao, int idHelicopitero, Helicoptero helicoptero, int idJato, Jato jato) {
        try{
            if(voos.isEmpty()) {   
                    
                this.id = id;
                this.numero = numero;
                this.data = data;
                this.hora = hora;
                this.origem = origem;
                this.destino = destino;
                this.piloto = piloto;
                this.observacao = observacao;
                this.idPista = idPista;
                this.pista = pista;
                this.idAviao = idAviao;
                this.idHelicopitero = idHelicopitero;
                this.helicoptero = helicoptero;
                this.idJato = idJato;
                this.jato = jato;
                voos.add(this);

            }else{
                    throw new Exception("Voo já cadastrado");
            }
        }catch(Exception e){
             System.out.println(e.getMessage());
        }

    }

    


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }


    public String getOrigem() {
        return origem;
    }


    public void setOrigem(String origem) {
        this.origem = origem;
    }


    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public String getPiloto() {
        return piloto;
    }


    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }


    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }


    public String getObservacao() {
        return observacao;
    }


    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public int getIdPista() {
        return idPista;
    }


    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }


    public Pista getPista() {
        return pista;
    }


    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public int getIdAviao() {
        return idAviao;
    }


    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }


    public Aviao getAviao() {
        return aviao;
    }


    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }


    public int getIdHelicopitero() {
        return idHelicopitero;
    }


    public void setIdHelicopitero(int idHelicopitero) {
        this.idHelicopitero = idHelicopitero;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

     

    public Jato getJato() {
        return jato;
    }


    public void setJato(Jato jato) {
        this.jato = jato;
    }


    public int getIdJato() {
        return idJato;
    }


    public void setIdJato(int idJato) {
        this.idJato = idJato;
    }


    public Helicoptero getHelicoptero() {
        return helicoptero;
    }


    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    @Override
    public String toString() {
        return super.toString() + "| Id: " + this.id + " | Numero: " + this.numero + " | Data: " + this.data + " | Hora: " + this.hora + " | Origem: " + this.origem + " | Destino: " + this.destino + " | Piloto: " + this.piloto + " | Observacao: " + this.observacao + " | idPista: " + this.idPista + " | Pista: " + this.pista + " | IdAviao: " + this.idAviao + " | Aviao: " + this.aviao + " | IdHelicoptero: " + this.idHelicopitero + " | Helicoptero: " + this.helicoptero + " | IdJato: " + this.idJato + " | Jato: " + this.jato;
    }

    public static Voo getVooById(int id) {
        for (Voo voo : Voo.voos) {
            if (voo.id == id) {
                return voo;
            }
        }

        return null;
    }


    public static Voo deleteVooById(int id) {
        for (Voo voo : Voo.voos) {
            if (voo.id == id) {
                Voo.voos.remove(voo);
                return voo;
            }
        }

        return null;
    }


}
