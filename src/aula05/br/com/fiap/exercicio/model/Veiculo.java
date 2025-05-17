package aula05.br.com.fiap.exercicio.model;

public class Veiculo {

   private String modelo;
   private int quantidadeLugares;
   private double comprimento;
   private int anoFabricação;

   public Veiculo(String modelo, int quantidadeLugares, double comprimento, int anoFabricação) {
      this.modelo = modelo;
      this.quantidadeLugares = quantidadeLugares;
      this.comprimento = comprimento;
      this.anoFabricação = anoFabricação;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public int getQuantidadeLugares() {
      return quantidadeLugares;
   }

   public void setQuantidadeLugares(int quantidadeLugares) {
      this.quantidadeLugares = quantidadeLugares;
   }

   public double getComprimento() {
      return comprimento;
   }

   public void setComprimento(double comprimento) {
      this.comprimento = comprimento;
   }

   public int getAnoFabricação() {
      return anoFabricação;
   }

   public void setAnoFabricação(int anoFabricação) {
      this.anoFabricação = anoFabricação;
   }
}






