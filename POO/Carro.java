public class Carro {
    String placa;
    String modelo;
    String fabricante;
    String cor;
    String posicaoMarcha;
    String chassi;
    int ano;

    boolean movimento;
    boolean ligado;

    public void ligar() {
        ligado = true;
    }
    
    public void desligar() {
        ligado = false;

    }

    public void acelerar(){
        if(this.ligado){
            movimento = true;
        }
        else {
            movimento = false;
        }
    }

    public void frear(){
        if(this.ligado){
            movimento = false;
        }
    }
}
