package A3.me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlocadorContainer {
    public static List<Armazem> alocar(List<Integer> containers, int capacidadeArmazem) {
        List<Integer> ordenados = new ArrayList<>(containers);
        Collections.sort(ordenados, Collections.reverseOrder()); // Ordena do maior para o menor

        List<Armazem> armazens = new ArrayList<>();

        for (int volume : ordenados) {
            boolean alocado = false;
            for (Armazem a : armazens) {
                if (a.adicionar(volume, capacidadeArmazem)) {
                    alocado = true;
                    break;
                }
            }
            if (!alocado) {
                Armazem novo = new Armazem();
                novo.adicionar(volume, capacidadeArmazem);
                armazens.add(novo);
            }
        }

        return armazens;
    }
}
