import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static boolean verificar(byte[] a, byte[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer texto
        System.out.print("Escriba un mensaje de texto: ");
        String mensaje = sc.nextLine();
        byte[] buffer = mensaje.getBytes();

        System.out.println("Mensaje de entrada: " + mensaje);

        // Digest MD5
        System.out.print("Digest MD5 obtenido: ");
        byte[] md5 = Digest.digest("MD5", buffer);
        Digest.imprimirHexa(md5);

        // Digest SHA-1
        System.out.print("Digest SHA-1 obtenido: ");
        byte[] sha1 = Digest.digest("SHA-1", buffer);
        Digest.imprimirHexa(sha1);

        // Comparación ejemplo
        boolean iguales = verificar(md5, sha1);
        System.out.println("¿Digest MD5 y SHA-1 son iguales?: " + iguales);

        sc.close();
    }

}
