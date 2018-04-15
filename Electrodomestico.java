public class Electrodomestico {
    protected final static String color_default="blanco";
    protected final static char consumo_energetico_default='F';
    protected final static double precio_base_default=100;
    protected final static double peso_default=5;
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    private void comprobarColor(String color){
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
        for(int i=0;i<colores.length && !encontrado;i++){
            if(colores[i].equals(color)){
                encontrado=true;
            }
        }
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
    }
    public void comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
        return precioBase+plus;
    }
    public Electrodomestico(){
        this(precio_base_default, peso_default, consumo_energetico_default, color_default);
    }
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, consumo_energetico_default, color_default);
    }
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
}
