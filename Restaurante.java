import java.util.ArrayList;
import java.util.Random;
public class Restaurante {

    private String nome;
    ArrayList<Mesa> mesas = new ArrayList<>();


    public Restaurante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarMesa(Mesa m){
        mesas.add(m);
    }

    public Mesa sortearMesa(){
        Random rand = new Random();

        int sorteado = rand.nextInt(mesas.size());

        return mesas.get(sorteado);

    }

    public void listarMesas(){
        for(int i = 0 ; i < mesas.size() ; i++){
            mesas.get(i).printDados();
        }
    }


    


}
