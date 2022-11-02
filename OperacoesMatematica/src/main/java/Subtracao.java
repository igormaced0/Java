public class Subtracao extends OperacaoMatematica{

    public Subtracao(double A, double B) {
        setA(A);
        setB(B);
    }

    public Subtracao(){
        setA(1);
        setB(2);
    }

    @Override
    public double calcula() {
        return (getA()-getB());
    }
}