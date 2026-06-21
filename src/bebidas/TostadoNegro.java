package bebidas;

import java.util.HashMap;

public class TostadoNegro extends Cafe{
    public TostadoNegro(String tamano){
        super(tamano);
        descripcion= "Cafe Tostado Negro";
        precios= new HashMap<String, Double>(){{
            put("N", 0.99);
            put("M", 1.09);
            put("G", 1.19);
        }};
    }

    @Override
    public double costo(){
        return precios.get(TamanoDefault);
    }
}
