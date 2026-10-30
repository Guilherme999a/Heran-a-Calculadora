public class Subtracao extends Calculadora{

    public Subtracao(int valor01, int valor02) {super(valor01, valor02);}
    // super serve para chamar o construtor na classe pai

    public void subtracao(){
        double resultado = valor01 - valor02;
        System.out.println("A subtração dos valores são: " + resultado);


    }
}
