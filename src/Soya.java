public class Soya extends DecoratorComplemento{
    private Cafe cafe;

    public Soya(Cafe cafe){
        this.cafe=cafe;
    }

    public double costo(){
        return cafe.costo()+0.15;
    }

    public String getDescripcion(){
        return cafe.getDescripcion()+" + Soya";
    }



}
