public class TesteDosCarros {

public static void main(String[] args){
    Carro meuCarro01 = new Carro();
    Carro meucarro02 = new Carro();
    Carro meucarro03 = new Carro();

    meuCarro01.placa = "QXE2666";
    meucarro02.placa = "ABC1234";
    meucarro03.placa = "XYZ5678";

    meuCarro01.chassi = "KXXJ14ERREW09HB";
    meucarro02.chassi = "ZXCV14HJKLW78JK";
    meucarro03.chassi = "QWER14ÇPOIW34ÇP";

    System.out.println("Placa = " + meuCarro01.placa);
    System.out.println("Placa = " + meucarro02.placa);
    System.out.println("Placa = " + meucarro03.placa);

    System.out.println("Chassi carro 01 = " + meuCarro01.chassi);
    System.out.println("Chassi carro 02 = " + meucarro02.chassi);
    System.out.println("Chassi carro 03 = " + meucarro03.chassi);    

    }
}