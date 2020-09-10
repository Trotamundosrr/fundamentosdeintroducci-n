public class EjemploFor{
    public int calcularGastoEnergia(int perimetro, int cantidadVueltas){
        int res=0;
        int factor=1;
        for(int i=0; i<cantidadVueltas; i++){
            res=res+(perimetro*factor);
            factor=factor+1;
        }
        return res;
    }
}