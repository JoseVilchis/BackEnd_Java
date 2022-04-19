package practicaHarry;

public class Mago {
    private int id;
    private String nombre;
    private String genero;
    private String casa;
    private String patronus;
    private String boggart;

    public Mago(int id, String nombre, String genero, String casa, String patronus, String boggart){
        this.id=id;
        this.nombre=nombre;
        this.genero=genero;
        this.casa=casa;
        this.patronus=patronus;
        this.boggart=boggart;
    }

    public int getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }

    public String getPatronus() {
        return patronus;
    }

    public String getBoggart() {
        return boggart;
    }

    public boolean setId(int id){
        if(id>0){
            this.id=id;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa=casa;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart=boggart;
            return true;
        }else
            return false;
    }

    public String showComments(){
        return "El personaje se llama: "+nombre+"\n"+
                "Es del genero: "+genero+"\n"+
                "Pertenecio a la casa: "+casa+"\n"+
                "Tiene un patronus con forma de: "+patronus+"\n"+
                "Un boggart adquiere la forma de: "+boggart+"\n";
    }
}
