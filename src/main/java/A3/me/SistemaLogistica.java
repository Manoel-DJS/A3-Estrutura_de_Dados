package A3.me;

import java.util.List;
import java.util.Scanner;

public class SistemaLogistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome!");
        System.out.println("Bem vindo ao sistema de Otimização de logística portuária!");

        List<Integer> volumesContainers = EntradaUsuario.lerVolumesContainers(scanner);
        int capacidadeArmazem = EntradaUsuario.lerCapacidade("armazém", scanner);
        int capacidadeCaminhao = EntradaUsuario.lerCapacidade("caminhão", scanner);

        System.out.println(volumesContainers);
        System.out.println(capacidadeArmazem);
        System.out.println(capacidadeCaminhao);

        List<Armazem> armazens = AlocadorContainer.alocar(volumesContainers, capacidadeArmazem);
        List<Caminhao> caminhoes = AlocadorCaminhao.alocar(armazens, capacidadeCaminhao);

        exibirResultados(armazens, caminhoes);
    }

    public static void exibirResultados(List<Armazem> armazens, List<Caminhao> caminhoes) {
        System.out.println("\n--- DISTRIBUIÇÃO DE CONTAINERS NOS ARMAZÉNS ---");
        for (int i = 0; i < armazens.size(); i++) {
            Armazem a = armazens.get(i);
            System.out.println("Armazém " + (i + 1) + ": " + a.getContainers() + " = " + a.getCapacidadeAtual());
        }
        System.out.println("Total de armazéns utilizados: " + armazens.size());

        System.out.println("\n--- DISTRIBUIÇÃO DOS ARMAZÉNS NOS CAMINHÕES ---");
        for (int i = 0; i < caminhoes.size(); i++) {
            Caminhao c = caminhoes.get(i);
            StringBuilder desc = new StringBuilder("Caminhão " + (i + 1) + " transporta: ");
            for (Armazem a : c.getArmazens()) {
                desc.append(a.getCapacidadeAtual()).append(" ");
            }
            System.out.println(desc.toString().trim() + " = " + c.getCargaAtual());

        }
        System.out.println("Total de caminhões utilizados: " + caminhoes.size());
    }
}