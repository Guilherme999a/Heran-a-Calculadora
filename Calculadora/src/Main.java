public class Main {
    public static void main (String[]args){

        Soma somar = new Soma(9, 9);
        somar.soma();

        Subtracao subtracionar = new Subtracao(14, 9);
        subtracionar.subtracao();

        Multiplicacao multiplicar = new Multiplicacao(10, 10);
        multiplicar.multiplicacao();

        Divisao dividir = new Divisao(10, 2);
        dividir.divisao();

    }
}

