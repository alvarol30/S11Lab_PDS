package complementos;

import bebidas.Cafe;

public class Crema extends DecoratorComplemento {
    Cafe cafe;

    public Crema(Cafe cafe){
        this.cafe=cafe;
    }

    public double costo(){
        return cafe.costo()+0.10;
    }

    public String getDescripcion(){
        return cafe.getDescripcion()+" + complementos.Crema";
    }
}
