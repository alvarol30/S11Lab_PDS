package complementos;

import bebidas.Cafe;
import java.util.HashMap;

public class Soya extends DecoratorComplemento {

    public Soya(Cafe cafe){
        super(cafe);
        precios = new HashMap<String, Double>() {{
            put("N", 0.15);
            put("M", 0.20);
            put("G", 0.25);
        }};
    }

    @Override
    public double costo(){
        return cafe.costo() + precios.get(TamanoDefault);
    }

    @Override
    public String getDescripcion(){
        return cafe.getDescripcion() + " + Soya";
    }



}
