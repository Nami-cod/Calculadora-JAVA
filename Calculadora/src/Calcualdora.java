import java.util.Scanner;

public class Calcualdora {
// NOTA: El nombre se mantiene: 'Calcualdora' está mal escrito. Por lo que 
// debe quedar igual ya que debe coincidir exactamente con el nombre del archivo
// Calcualdora.java para que el compilador de Java pueda ejecutar el programa sin errores.
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int opcion;
        double primerNum, segundoNum, resultado = 0;
        boolean operacionValida;

        System.out.println("=== BIENVENIDO A LA CALCULADORA ==="); 
        do {
            operacionValida = true;

            System.out.println("Calculadora");
            System.out.println("----------------------------------------");

            System.out.println("¿Qué deseas hacer");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Finalizar");
            System.out.print("Ingrese su opción: ");

            while (!datos.hasNextInt()) {
                System.out.print(" Error: Intente de nuevo: ");
                datos.next();
            }
            opcion = datos.nextInt();

            if (opcion == 5) {
                System.out.println("¡Nos vemos pronto!");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println(" Opción inválida. Debe ser 1, 2, 3 o 4.");
                continue;
            }

            System.out.print("Ingrese el primer número: ");
            while (!datos.hasNextDouble()) {
                System.out.print(" Error");
                datos.next();
            }
            primerNum = datos.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            while (!datos.hasNextDouble()) {
                System.out.print(" Error: Intente de nuevo: ");
                datos.next();
            }
            segundoNum = datos.nextDouble();

            switch (opcion) {
                case 1: 
                    //--Operacion suma--
                    resultado = primerNum + segundoNum;
                    System.out.println(primerNum + " + " + segundoNum + " = " + resultado);
                    break;
                case 2:
                    //--Operacion resta--
                    resultado = primerNum - segundoNum;
                    System.out.println(primerNum + " - " + segundoNum + " = " + resultado);
                    break;
                case 3:
                    //--Operacion multiplicacion--
                    resultado = primerNum * segundoNum;
                    System.out.println(primerNum + " * " + segundoNum + " = " + resultado);
                    break;
                case 4:
                    //--Operacion Division--
                    if (segundoNum != 0) {
                        resultado = primerNum / segundoNum;
                        System.out.println(primerNum + " / " + segundoNum + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Debe ser 1, 2, 3 o 4.");
                    operacionValida = false;
                    break;
            }


            if (operacionValida && opcion >= 1 && opcion <= 4 && !(opcion == 4 && segundoNum == 0)) {
                System.out.println("Resultado:" + resultado);
            }

        } while (true);

        datos.close();
    }
}

