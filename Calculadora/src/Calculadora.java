public class Calculadora {


    // atributos
    // quando nao informar os atributos (public ou voide, sempre sera public)
    public double valor01;
    public double valor02;


    //construtor
    public Calculadora(double valor01, double valor02) {
        this.valor01 = valor01; // this serve para pegar um atributo da sua classe principal
        this.valor02 = valor02;
    }

    //metodos
    public void soma(){
        System.out.println("Resultado da soma: ");

    }
    public void subtrcao(){
        System.out.println("Resultado da subtração: ");

}
    public void multiplicacao(){
        System.out.println("Resultado multiplicação: ");

}

    public void divisao(){
        System.out.println("Resultado divisão: ");
    }
}

