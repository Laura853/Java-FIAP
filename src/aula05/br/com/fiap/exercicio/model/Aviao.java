package aula05.br.com.fiap.exercicio.model;

public class Aviao extends Veiculo{

    private String prefixo;
    private Cor cor;
    private int quantidadeDeTurbinas;

    public Aviao(String modelo, int anoFabricacao, double comprimento, int quantidadeDeLugares){
        super(modelo, anoFabricacao, comprimento, quantidadeDeLugares);
    }


    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeTurbinas() {
        return quantidadeDeTurbinas;
    }

    public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }
}
