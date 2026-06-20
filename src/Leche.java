public class Leche extends DecoratorComplemento{
    Cafe cafe;

    public Leche(Cafe cafe){
        this.cafe=cafe;
    }

    public double costo(){
        return cafe.costo()+0.10;
    }

    public String getDescripcion(){
        return cafe.getDescripcion()+" + Leche";
    }
}
