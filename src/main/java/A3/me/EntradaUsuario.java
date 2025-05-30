package A3.me;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaUsuario {
    public static List<Integer> lerVolumesContainers(Scanner scanner) {
        System.out.print("Quantidade de containers: ");
        int n = scanner.nextInt();
        List<Integer> volumes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Volume do container " + (i + 1) + ": ");
            volumes.add(scanner.nextInt());
        }

        return volumes;
    }

    public static int lerCapacidade(String entidade, Scanner scanner) {
        System.out.print("Capacidade do " + entidade + ": ");
        return scanner.nextInt();
    }
}
