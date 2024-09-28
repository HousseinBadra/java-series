package Day29;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UserInput {
    public static void main(String args[]) {

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {

            String a = bf.readLine();
            System.out.println(a);
            String b = bf.readLine();
            System.out.println(b);
            bf.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
