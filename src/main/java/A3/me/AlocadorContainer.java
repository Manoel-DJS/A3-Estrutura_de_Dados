package A3.me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlocadorContainer {
    public static List<Armazem> alocar(List<Integer> containers, int capacidadeArmazem) {
        List<Integer> ordenados = new ArrayList<>(containers);
        Collections.sort(ordenados, Collections.reverseOrder()); // Ordena do maior para o menor

        List<Armazem> armazens = new ArrayList<>();
        return armazens;
    }
}
