package modelo;

public class Validacao extends absPropriedades {

    public Validacao(String temperatura) {
        super(temperatura);
    }
    
    public void Executar(){
    Estaticos.MENSAGEM = "";
    try{ this.valor = Double.valueOf(temperatura);}
    catch (NumberFormatException e){
    Estaticos.MENSAGEM = "número invalido";
}
    }
}
