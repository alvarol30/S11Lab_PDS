package bebidas;

import java.util.HashMap;

public class Expreso extends Cafe{
    public Expreso(String tamano){
        super(tamano);
        descripcion= "Cafe Expreso";
        precios= new HashMap<String, Double>(){{
            put("N", 1.99);
            put("M", 2.09);
            put("G", 2.15);
        }};
    }
    @Override
    public double costo(){
        return precios.get(TamanoDefault);
    }
}
