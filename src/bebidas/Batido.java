package bebidas;

import java.util.HashMap;

public class Batido extends Cafe{
    public Batido(String tamano){
        super(tamano);
        descripcion= "Cafe Batido";
        precios= new HashMap<String, Double>(){{
            put("N", 0.89);
            put("M", 0.99);
            put("G", 1.09);
        }};
    }

    @Override
    public double costo(){
        return precios.get(TamanoDefault);
    }
}
