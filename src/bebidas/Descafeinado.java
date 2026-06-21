package bebidas;

import java.util.HashMap;

public class Descafeinado extends Cafe{
    public Descafeinado(String tamano){
        super(tamano);
        descripcion= "Cafe Descafeinado";
        this.precios = new HashMap<String, Double>() {{
            put("N", 1.05);
            put("M", 1.15);
            put("G", 1.25);
        }};
    }
    @Override
    public double costo(){
        return precios.get(TamanoDefault);
    }
}
