public class TanqueAgua{
    private int capacidad,cantidadAgua;
    
    public TanqueAgua(){
        capacidad=950;
        cantidadAgua=0;
    }
    public int cantidadTurrilesNecesarios(){
       int res=capacidad/210;
       return res;
    }
     public int getCapacidad(){
        return capacidad;
    }
    public int getCantidadAgua(){
        return cantidadAgua;
    }
    public void setCapacidad(int nCapacidad){
        capacidad=nCapacidad;
    }
    public void setCantidadAgua(int nCantidadAgua){
        cantidadAgua=nCantidadAgua;
    }
}