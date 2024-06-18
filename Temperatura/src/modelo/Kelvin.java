package modelo;

public class Kelvin extends absPropriedades{

    public Kelvin(Double valor) {
        super(valor);
    }
    
    public void Executar(){
        this.resposta = String.format("%.2f", valor, 273);
    }
    
}
