import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter numero de filas !!!");
        int fila =scanner.nextInt();
        System.out.println("inter numero de columnas !!!");
        int coulumnas = scanner.nextInt();
        int array[][]=new int[fila][coulumnas];
        for (int i = 0; i <fila ; i++) {
            for (int j = 0; j <coulumnas ; j++) {
                System.out.println("inter index "+i+","+j);
                array[i][j]=scanner.nextInt();

            }
        }
        for (int i = 0; i <fila ; i++) {
            for (int j = 0; j <coulumnas ; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

        }
}