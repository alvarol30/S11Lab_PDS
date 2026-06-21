package bebidas;

public abstract class Cafe{
    public String descripcion= "bebidas.Cafe simple";

    public String getDescripcion(){
        return descripcion;
    }
    public abstract double costo();
}
