public class MeuTesteDoCarro {
    public static void main(String[] args){

        Carro carro01 = new Carro();
        carro01.ano = 2026;
        carro01.placa = "JXP6C60";
        carro01.fabricante = "Porsche";
        carro01.modelo = "911";
        carro01.cor = "preto";
        carro01.chassi = "KXJ14527793AS";

        carro01.ligar();

        System.out.println("Meu carro é um " +
                carro01.modelo + " da marca " +
                carro01.fabricante + " do ano de" +
                carro01.ano + " e de cor " +
                carro01.cor);


                System.out.println( "Placa + " + carro01.placa);
                System.out.println( "Chassi + " + carro01.chassi);
    }
}
