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

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}