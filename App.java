public class App {
    public static void main(String[] args) throws Exception {
        
        Mesa m1 = new Mesa(1, 10);
        Mesa m2 = new Mesa(2, 8);
        Mesa m3 = new Mesa(3, 12);
        Mesa m4 = new Mesa(4, 15);
        Mesa m5 = new Mesa(5, 20);

        Restaurante rest = new Restaurante("Restaurante dos Larpers");

        rest.adicionarMesa(m1);
        rest.adicionarMesa(m2);
        rest.adicionarMesa(m3);
        rest.adicionarMesa(m4);
        rest.adicionarMesa(m5);


        rest.listarMesas();

        System.out.println("A Mesa sorteada foi: " + rest.sortearMesa().getNumero());


    }
}
