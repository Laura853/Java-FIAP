package aula05.br.com.fiap.exercicio.model;

public class Carro extends Aviao {
    private int quantidadeDePortas;
    private Cor cor;
    private String placa;
    private float motor = 1;

    public Carro(String modelo, int quantidadeDeLugares, int anoFabricacao, double comprimento){
        super(modelo, quantidadeDeLugares, comprimento, anoFabricacao);
    }


    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
