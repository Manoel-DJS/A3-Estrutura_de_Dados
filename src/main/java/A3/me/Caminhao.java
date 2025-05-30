package A3.me;

import java.util.ArrayList;
import java.util.List;
public class Caminhao {
    private List<Armazem> armazens = new ArrayList<>();

    private int cargaAtual = 0;
    public boolean adicionar(Armazem a, int capacidadeMaxima) {
        if (cargaAtual + a.getCapacidadeAtual() <= capacidadeMaxima) {
            armazens.add(a);
            cargaAtual += a.getCapacidadeAtual();
            return true;
        }
        return false;
    }

    public int getCargaAtual() {
        return cargaAtual;
    }

    public List<Armazem> getArmazens() {
        return armazens;
    }
}
