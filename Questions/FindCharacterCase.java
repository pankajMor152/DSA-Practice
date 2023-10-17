import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FindCharacterCase {
    public static void main(String[] args) {
        try {
            InputStreamReader inp = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(inp);
            int inputChar = br.read();
            if (inputChar >= 'a' && inputChar <= 'z') {
                System.out.println(0);
            } else if (inputChar >= 'A' && inputChar <= 'Z') {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}

