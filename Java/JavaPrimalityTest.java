import java.io.*;
public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        System.out.print(new BigInteger(n).isProbablePrime(100) ? "prime" : "not prime");
        bufferedReader.close();
    }
}
