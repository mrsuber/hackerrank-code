import java.io.BufferedReader;
import java.io.InputStreamReader;


class hackerearth_ex1 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read the name from the input
        String line = br.readLine();

        // print the name
        System.out.println("Hello "+ line);

    }
}
