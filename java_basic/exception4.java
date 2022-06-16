package java_basic;

// throws : 예외를 사용자에게 전가해서 사용자가 예외처리를 할수 있게 한다.

import java.io.*;
class B_exception4{
    void run() throws IOException, FileNotFoundException{  // B를 사용하는 C에게 넘겨준다
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C_exception4{
    void run() throws IOException, FileNotFoundException{ // C를 사용하는 사용자(main) 에게 넘겨준다.
        B_exception4 b = new B_exception4(); // C 에서 B를 사용
        b.run();
    }
}
public class exception4 {
    public static void main(String[] args) {
        C_exception4 c = new C_exception4();
        try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
