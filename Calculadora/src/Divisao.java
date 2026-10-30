public class Divisao extends Calculadora{
    public Divisao (double valor01, double valor02) {super(valor01, valor02);
    }
    public void divisao(){
        double resultado = valor01 / valor02;
        System.out.println("A divisão dos valores são: " + resultado);
    }

}
