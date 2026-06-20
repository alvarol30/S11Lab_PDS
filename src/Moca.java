public class Moca extends DecoratorComplemento{
    Cafe cafe;

    public Moca(Cafe cafe){
        this.cafe=cafe;
    }

    public double costo(){
        return cafe.costo()+0.20;
    }

    public String getDescripcion(){
        return cafe.getDescripcion()+" + Moca";
    }
}
