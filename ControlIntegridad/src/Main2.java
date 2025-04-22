
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo:");
        String archivo = sc.nextLine();

        System.out.println("Nombre del archivo: " + archivo);

        byte[] md5 = Digest.getDigestFile("MD5", archivo);
        System.out.print("Digest MD5 obtenido: ");
        Digest.imprimirHexa(md5);

        byte[] sha1 = Digest.getDigestFile("SHA-1", archivo);
        System.out.print("Digest SHA-1 obtenido: ");
        Digest.imprimirHexa(sha1);
    }
}

