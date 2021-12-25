public class Star {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        char arr[][] = new char[n][];
        int i, j;
        for (i = 0; i < n; i++) {
            arr[i] = new char[i + 1];
        }

        for (i = 0; i < n; i++)
            for (j = 0; j < i + 1; j++) {
                arr[i][j] = '*';
            }

        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}