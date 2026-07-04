void main() {
    IO.println(String.format("Practica"));
    IO.println("-".repeat(20));
    IO.println("-----PUCE----");
    IO.println("-".repeat(20));

    String texto1 = IO.readln("Ingrese el primer valor");
    IO.println(texto1);

    int numero1 = 0;
    try {
        numero1 = Integer.parseInt(texto1);
    } catch (NumberFormatException e) {
        IO.println("Error, por favor, no es valido el ingreso de letras (solo digitos)");
    }

    int numero2 = 0;
    IO.println("Calculadora");
    String texto = IO.readln("Ingrese el primer valor:");
    IO.println(texto);
    numero1 = Integer.parseInt(texto);
    texto = IO.readln("Ingrese el segundo valor:");
    IO.println(texto);
    numero2 = Integer.parseInt(texto);


    int resultado = 0;
    resultado = numero1 - numero2;
    IO.println(String.format("El resultado de %s - %s = %s", numero1, numero2, resultado));

    String opcion = "";

    while (!Objects.equals(opcion, "0")) {
    IO.println("1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Salir");
    opcion = IO.readln("Ingrese opcion");
    IO.println(opcion);
    switch (opcion) {
        case "1": {
            IO.println("Sumar");
            IO.println("Operar");
            break;
        }
        case "2": IO.println("Restar"); break;
        default: {};
    }


}