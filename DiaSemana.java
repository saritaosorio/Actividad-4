import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la semana: ");

        int semana = scanner.nextInt();

        switch (semana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("El dia no es valido, digite un numero de 1 a 7");
                break;


        }
    }
}
