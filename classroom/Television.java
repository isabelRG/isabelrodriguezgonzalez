public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;
    private final static int resolucion_default=20;

    public Television(){
       this(precio_base_default, peso_default, consumo_energetico_default, color_default, resolucion_default, false);
   }
   public Television(double precioBase, double peso){
        this(precioBase, peso, consumo_energetico_default, color_default, resolucion_default, false);
    }
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
       super(precioBase, peso, consumoEnergetico, color);
       this.resolucion=resolucion;
       this.sintonizadorTDT=sintonizadorTDT;
   }
   public double precioFinal(){
       double plus=super.precioFinal();
       if (resolucion>40){
           plus+=precioBase*0.3;
       }
       if (sintonizadorTDT){
           plus+=50;
       }
       return plus;
   }
}
