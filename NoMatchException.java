import java.io.*;

class MyException extends Exception {
    private String excp = "NoMatchFoundException", exp;

    MyException(String exp) {
        this.exp = exp;
    }

    public String toString() {
        return "Exception: " + excp + " : " + exp;
    }
}

public class NoMatchException {
    static String[] str = { "Kolkata", "Chennai", "Delhi", "Mumbai", "Bangalore", "Ahmedabad" };
    static int i = str.length - 1;

    static void find(String s) throws MyException {
        if (i >= 0 && str[i].equals(s)) {
            System.out.println("Match Found!");
        } else if (i >= 0 && !str[i].equals(s)) {
            i--;
            find(s);
        } else {
            throw new MyException(s);
        }
    }

    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string --->");
        String s = br.readLine();
        try {
            find(s);
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }
    }
}