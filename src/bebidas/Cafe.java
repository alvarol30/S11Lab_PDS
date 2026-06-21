package bebidas;

import java.util.HashMap;

public abstract class Cafe{
    public String descripcion= "Cafe simple";

    public HashMap<String, Double> tamano= new HashMap<String, Double>(){{
        put("N", 0.0);
        put("M", 0.0);
        put("G", 0.0);
    }};

    public String TamanoDefault= "N";

    public Cafe(String tamano){
        this.TamanoDefault= tamano;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public abstract double costo();
}
