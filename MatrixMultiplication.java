public class MatrixMultiplication {
    public static double[][] multiply(double[][] a, double[][] b) {
        if (a[0].length != b.length) return null;
        double[][] res = new double[a.length][b[0].length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        double[][] m1 = {
            {1.0, 2.0, 3.0, 5.0}, 
            {4.0, 5.0, 6.0, 7.0}, 
            {7.0, 8.0, 9.0, 9.0}
        };
        
        double[][] m2 = {
            {1.0, 2.0, 3.0, 4.0, 5.0}, 
            {4.0, 5.0, 6.0, 7.0, 8.0}, 
            {7.0, 8.0, 9.0, 10.0, 11.0}, 
            {10.0, 11.0, 12.0, 13.0, 14.0}
        };
        
        double[][] m3 = MatrixMultiplication.multiply(m1, m2);
        
        if (m3 == null) {
            System.out.println("Matrix multiplication not possible.");
        } else {
            for (double[] row : m3) {
                for (double val : row) {
                    System.out.print(String.format("%5.1f ", val));
                }
                System.out.println();
            }
        }
    }
}
