public class Moto extends Veiculo{
    private int Cilindradas;
    private boolean empinar;

    public void empinarmoto () {
        if (!empinar) {
            empinar = true;
            System.out.println("Empinar a moto.");
        } else {
            System.out.println("A moto ja está empinada.");
        }
    }


}