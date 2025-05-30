package A3.me;

import java.util.ArrayList;
import java.util.List;

public class AlocadorCaminhao {
    public static List<Caminhao> alocar(List<Armazem> armazens, int capacidadeCaminhao) {
        List<Caminhao> caminhoes = new ArrayList<>();

        for (Armazem a : armazens) {
            boolean alocado = false;
            for (Caminhao c : caminhoes) {
                if (c.adicionar(a, capacidadeCaminhao)) {
                    alocado = true;
                    break;
                }
            }
            if (!alocado) {
                Caminhao novo = new Caminhao();
                novo.adicionar(a, capacidadeCaminhao);
                caminhoes.add(novo);
            }
        }

        return caminhoes;
    }
}
