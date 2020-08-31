public class BombaAgua{
    private int cantidadAguaTransportar; //litros
    private Turril turrilConectado;
    private TanqueAgua tanqueConectado;
    public BombaAgua(int cantAguaTransportar){
        this.cantidadAguaTransportar=cantidadAguaTransportar;
    }
    public BombaAgua(){
        cantidadAguaTransportar=7;
    }
    public void bombear(){
        int cantidadAguaTurril=turrilConectado.getCantidadAgua();
        cantidadAguaTurril=cantidadAguaTurril-cantidadAguaTransportar;
        turrilConectado.setCantidadAgua(cantidadAguaTurril);
        
        int cantidadAguaTanque=tanqueConectado.getCantidadAgua();
        cantidadAguaTanque=cantidadAguaTanque+cantidadAguaTransportar;
        tanqueConectado.setCantidadAgua(cantidadAguaTanque);
    }
    public int cantidadVecesBombear(){
        int res=210/cantidadAguaTransportar;
        return res;
    }
    public void conectarTurril(Turril turril){
        turrilConectado=turril;
    }
    public void conectarTanque(TanqueAgua tanque){
        tanqueConectado=tanque;
    }
}