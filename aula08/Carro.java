public class Carro extends Veiculo{
    private int quantidadePortas;
    private boolean portaMalasAberto;

    public void abrirPortaMalas() {
        if (!portaMalasAberto) {
            portaMalasAberto = true;
            System.out.println("Porta-malas do carro foi aberto.");
        } else {
            System.out.println("O porta-malas já está aberto.");
        }
    }


}