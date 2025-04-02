public class ConvertidorMoneda {

        public static void main (String[] args) {

            //Peso Colombiano
            double Pesos = 200000;

            //Tasa de cambio
            double ValorDolar = 3895;

            double dolares;
            dolares = Pesos / ValorDolar;
            System.out.println("Pesos equivalente = " + Pesos);
            System.out.println("Valor dolar equivalentes = " + ValorDolar);
            System.out.println("Dolares equivalentes = " + dolares);
        }
    }

