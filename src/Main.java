//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println("***** BIENVENIDO A LA CAFETERIA NEGRITO *****");
        System.out.println();
        Cafe bebida1= new Expreso();
        bebida1= new Leche(bebida1);
        bebida1= new Soya(bebida1);
        bebida1= new Crema(bebida1);
        bebida1= new Moca(bebida1);
        System.out.println(bebida1.getDescripcion() + "\nTotal: S/." + bebida1.costo());
        System.out.println("---------------------------------------------------------");

        Cafe bebida2= new Descafeinado();
        bebida2= new Moca(bebida2);
        bebida2= new Moca(bebida2);
        bebida2= new Soya(bebida2);
        bebida2= new Leche(bebida2);
        System.out.println(bebida2.getDescripcion() + "\nTotal: S/." + bebida2.costo());
        System.out.println("---------------------------------------------------------");

        Cafe bebida3= new Batido();
        bebida3= new Crema(bebida3);
        bebida3= new Crema(bebida3);
        bebida3= new Leche(bebida3);
        bebida3= new Leche(bebida3);
        bebida3= new Soya(bebida3);
        bebida3= new Soya(bebida3);
        bebida3= new Moca(bebida3);
        bebida3= new Moca(bebida3);
        System.out.println(bebida3.getDescripcion() + "\nTotal: S/." + bebida3.costo());
        System.out.println("---------------------------------------------------------");

        Cafe bebida4= new TostadoNegro();
        bebida4= new Crema(bebida4);
        bebida4= new Crema(bebida4);
        bebida4= new Soya(bebida4);
        bebida4= new Soya(bebida4);
        bebida4= new Soya(bebida4);
        System.out.println(bebida4.getDescripcion() + "\nTotal: S/." + bebida4.costo());


    }
}