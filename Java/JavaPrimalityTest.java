import java.io.*;
public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int a = Integer.parseInt(n);
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
        bufferedReader.close();
    }
}
