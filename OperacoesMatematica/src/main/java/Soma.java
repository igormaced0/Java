 public class Soma extends OperacaoMatematica {

    public Soma(double A, double B) {
        setA(1);
        setB(2);
    }


     public Soma(){
        setA(1);
        setB(2);
    }

    @Override
    public double calcula() {
        return (getA()+getB());
    }
}

