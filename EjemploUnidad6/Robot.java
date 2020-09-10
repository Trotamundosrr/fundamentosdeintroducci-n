public class Robot{
    private int energiaMaxima,energia;
    public Robot(int energiaMaxima){
        this.energiaMaxima=energiaMaxima;
        energia=0;
    }
    public void cargarEnergia(){
        energia=energiaMaxima;
    }
    public int cantidadVueltas(int perimetro){
        int vueltas=0;
        int energiaNecesaria=perimetro;
        while(energia>=energiaNecesaria){
            energia=energia-energiaNecesaria;
            vueltas++;
            energiaNecesaria=energiaNecesaria+perimetro;
        }
        return vueltas;
    }
    public int cantidadVueltas2(int perimetro){
        int vueltas=0;
        for(int energiaNecesaria=perimetro;energia>=energiaNecesaria;energiaNecesaria+=perimetro){
            energia=energia-energiaNecesaria;
            vueltas++;
        }
        return vueltas;
    }
}