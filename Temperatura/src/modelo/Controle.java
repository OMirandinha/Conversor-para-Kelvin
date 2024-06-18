package modelo;

public class Controle extends absPropriedades{

    public Controle(String temperatura) {
        super(temperatura);
    }
    public void Executar(){
        absPropriedades Validacao = new Validacao(this.temperatura);
        if(Estaticos.MENSAGEM.equals("")){
            absPropriedades kelvin = new Kelvin(this.valor);
            this.resposta = kelvin.toString();
        }
    }
}
