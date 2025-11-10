public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
     public void setmodelo(String modelo){
        this.modelo = modelo;
     }
      public int getAno(){
        return ano;
     }
     public void setAno(int ano){
        this. ano= ano;
    }

      public void exibirInfo() {
        System.out.println("Informações do Veículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
     public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
  }
