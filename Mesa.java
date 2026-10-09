public class Mesa {

    private int numero;
    private int capacidade;

    public Mesa(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void printDados(){
        System.out.println("Número de mesa: " + this.numero);
        System.out.println("Capacidade de cada mesa: " + this.capacidade);
    }

    

}
