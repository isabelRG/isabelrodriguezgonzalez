public class Lavadora extends Electrodomestico{

  private int carga;

  private final static int carga_default=5;

  public Lavadora(){
       this(precio_base_default, peso_default, consumo_energetico_default, color_default, carga_default);
     }
  public Lavadora(double precioBase, double peso){
          this(precioBase, peso, consumo_energetico_default, color_default, carga_default);
      }
  public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
           super(precioBase, peso, consumoEnergetico, color);
           this.carga=carga;
       }
  public int getCarga() {
             return carga;
           }
  public double precioFinal(){
                  double plus=super.precioFinal();
                  if (carga>30){
                      plus+=50;
                    }
                  return plus;
              }
            }
