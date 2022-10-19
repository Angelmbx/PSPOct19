import java.io.*;

public class Ppadre {

    public static void main(String[] args) throws IOException {

        File ruta = new File("C:\\Users\\a21angelmb\\IdeaProjects\\Oct19\\target\\classes");
        ProcessBuilder pb = new ProcessBuilder("Java", "Hijo", "paco");
        pb.directory(ruta);

        Process p = pb.start();

        /* try {
            InputStream is = p.getErrorStream();
            BufferedReader buffr = new BufferedReader(new InputStreamReader(is));
            String linea = null;
            while ((linea = buffr.readLine()) != null)
                System.out.println("ERROR: "+linea);
        } catch (IOException ioe) {

        } */

        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de salida "+exitVal);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
