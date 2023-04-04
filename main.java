public class Ejercicios {

    public static void main(String[] args) {

        // if
        int numeroIf = 0; // cambiar el valor de la variable aquí

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        // while
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // do-while
        int numeroDoWhile = 0;
        boolean ejecutar = true;

        do {
            ejecutar = false;
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (ejecutar || numeroDoWhile < 3);

        // for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // switch
        String estacion = "invierno"; // cambiar el valor de la variable aquí

        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            default:
                System.out.println("No es una estación válida.");
                break;
        }

    }

}