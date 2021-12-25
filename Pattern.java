class Pattern {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int arr[][] = new int[n][];
        int i, j;
        for (i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
        }

        for (i = 0; i < n; i++)
            for (j = 0; j < i + 1; j++) {
                if (j % 2 == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
            }

        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Pattern []";
    }
}