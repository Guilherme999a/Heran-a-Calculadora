public class Multiplicacao extends Calculadora{

    //construtor
    public Multiplicacao(double valor01, double valor02){super(valor01, valor02);
    }

    public void multiplicacao(){
        double resultado = valor01 * valor02;
        System.out.println("A multiplicação dos valores são: " + resultado);
    }

}
