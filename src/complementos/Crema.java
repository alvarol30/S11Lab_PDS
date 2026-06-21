package complementos;

import bebidas.Cafe;

import java.util.HashMap;

public class Crema extends DecoratorComplemento {

    public Crema(Cafe cafe){
        super(cafe);
        precios = new HashMap<String, Double>() {{
            put("N", 0.10);
            put("M", 0.15);
            put("G", 0.20);
        }};
    }

    @Override
    public double costo(){
        return cafe.costo() + precios.get(TamanoDefault);
    }

    @Override
    public String getDescripcion(){
        return cafe.getDescripcion() + " + Crema";
    }
}
