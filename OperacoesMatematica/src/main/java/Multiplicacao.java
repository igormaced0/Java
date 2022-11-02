public class Multiplicacao extends OperacaoMatematica{

    public Multiplicacao(double A, double B) {
        setA(A);
        setB(B);
    }

    public Multiplicacao(){
        setA(1);
        setB(2);
    }

    @Override
    public double calcula() {
        return (getA()*getB());
    }
}