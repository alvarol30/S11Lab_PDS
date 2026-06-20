public abstract class Cafe{
    private String descripcion= "Cafe simple";

    public Cafe(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public abstract double costo();
}
