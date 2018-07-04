public class Spiral {

    public void Spiral() {

        int n = 4;

        int[][] grid = new int[n][n];
        int largest = n * n;
        int middle = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    grid[i][j] = j + 1;
                } else if (i == middle && j == middle) {
                    grid[i][j] = largest;
                } else if (j == n-1){
                    grid[i][j] = n + i;
                } else if (j == 0){
                    grid[i][j] = largest - i;
                } else {
                    grid[i][j] = i*n;
                }
            }
        }

        for (int i = 0; i< n; i++){
            for (int j =0; j< n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
