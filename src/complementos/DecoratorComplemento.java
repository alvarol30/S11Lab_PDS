package complementos;

import bebidas.Cafe;

public abstract class DecoratorComplemento extends Cafe{
    protected Cafe cafe;

    public DecoratorComplemento(Cafe cafe){
        super(cafe.TamanoDefault);
        this.cafe=cafe;
    }
    public abstract String getDescripcion();

}
