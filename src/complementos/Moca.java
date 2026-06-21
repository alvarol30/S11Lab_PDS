package complementos;

import bebidas.Cafe;
import java.util.HashMap;

public class Moca extends DecoratorComplemento {

    public Moca(Cafe cafe){
        super(cafe);
        precios = new HashMap<String, Double>() {{
            put("N", 0.20);
            put("M", 0.25);
            put("G", 0.30);
        }};
    }

    @Override
    public double costo(){
        return cafe.costo() + precios.get(TamanoDefault);
    }

    @Override
    public String getDescripcion(){
        return cafe.getDescripcion() + " + Moca";
    }
}
