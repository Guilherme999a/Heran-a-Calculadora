public class Soma extends Calculadora {

    //construtor
   public Soma(double valor01, double valor02){
       super(valor01, valor02);
   }
    // super serve para chamar o construtor na classe pai


    public void soma(){
      double resultado = valor01 + valor02;
      System.out.println("A soma dos valores são: " + resultado);
    }
}
