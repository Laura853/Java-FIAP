package aula05.br.com.fiap.exercicio.model;

public class Lancha extends Veiculo {
    private Cor cor;
    private int quantidadeDeMotores;

    public Lancha(String modelo, int anoFabricacao, double comprimento, int quantidadeDeLugares){
        super(modelo, anoFabricacao, comprimento, quantidadeDeLugares);
    }


    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeMotores() {
        return quantidadeDeMotores;
    }

    public void setQuantidadeDeMotores(int quantidadeDeMotores) {
        this.quantidadeDeMotores = quantidadeDeMotores;
    }
}
