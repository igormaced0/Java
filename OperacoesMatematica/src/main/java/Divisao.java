public class Divisao extends OperacaoMatematica{
    public Divisao(double A, double B) {
        setA(A);
        setA(B);
    }

    public Divisao(){
        setA(1);
        setB(2);
    }

    @Override
    public double calcula() {
        return (getA()/getB());
    }
}