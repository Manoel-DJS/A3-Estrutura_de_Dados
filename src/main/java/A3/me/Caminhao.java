package A3.me;

import java.util.ArrayList;
import java.util.List;
public class Caminhao {
    private List<Armazem> armazens = new ArrayList<>();
    private int cargaAtual = 0;

    public int getCargaAtual() {
        return cargaAtual;
    }

    public List<Armazem> getArmazens() {
        return armazens;
    }
}
