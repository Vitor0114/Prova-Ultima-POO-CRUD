import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Hangar {
    
    private int id;
    private String local;
    private LocalDate data;
    private LocalTime hora;
    private static Generic<String, Integer> hangar;
    public static ArrayList<Hangar> hangares = new ArrayList<Hangar>();

    public  Hangar(int id, String local, LocalDate data, LocalTime hora, Generic<String, Integer> hangar) {
        
        try{
            if(hangares.isEmpty()) {        
                
                this.id = id;
                this.local = local;
                this.data = data;
                this.hora = hora;
                
                hangares.add(this);
            }else if(!hangares.isEmpty()){
                for(Hangar vaga : hangares){
                    if(vaga.getHangar().equals(hangar)){
                        throw new Exception("Hangar já cadastrada");
                    }else{
                        this.id = id;
                        this.local = local;
                        this.data = data;
                        this.hora = hora;

                        hangares.add(this);
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public static Generic<String, Integer> getHangar() {
        return hangar;
    }


    public static void setHangar(Generic<String, Integer> hangar) {
        Hangar.hangar = hangar;
    }


    @Override
    public String toString() {
        return "Id: " + this.id + " | Local: " + this.local + " | Data: " + this.data + " | Hora: " + this.hora;
    }


    public static Hangar getHangarById(int id) {
        for (Hangar hangar : Hangar.hangares) {
            if (hangar.id == id) {
                return hangar;
            }
        }

        return null;
    }


    public static Hangar deleteHangarById(int id) {
        for (Hangar hangar : Hangar.hangares) {
            if (hangar.id == id) {
                hangar.hangares.remove(hangar);
                return hangar;
            }
        }

        return null;
    }

}
