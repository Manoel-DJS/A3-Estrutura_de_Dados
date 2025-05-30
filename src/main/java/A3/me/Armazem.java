package A3.me;

import java.util.ArrayList;
import java.util.List;

public class Armazem {
    private List<Integer> containers = new ArrayList<>();
    private int capacidadeAtual = 0;

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public List<Integer> getContainers() {
        return containers;
    }
}
