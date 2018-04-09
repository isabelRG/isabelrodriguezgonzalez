public class Lavadora extends Electrodomestico{

  private int carga;

  private final static int CARGA_DEF=5;

  public Lavadora(){
       this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
     }
  public Lavadora(double precioBase, double peso){
          this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
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
