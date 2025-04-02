import java.util.Scanner;

public class PrimerCifra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de 5 digitos: ");
        int num = scanner.nextInt();

        if (num >= -99999 && num <= 99999) {
            int numerocompleto = Math.abs(num);
            int PrimeraCifra = numerocompleto;

            while (PrimeraCifra >=10) {
                PrimeraCifra/=10;

            }
            System.out.println("La primera cifra es : " + PrimeraCifra);

        } else {
            System.out.println("El numero no es valido digite un numero de 5 digitos");
        }
    }
}
