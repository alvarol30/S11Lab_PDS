public class Soya extends Cafe{
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
