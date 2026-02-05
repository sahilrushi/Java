import java.util.*;

public class Bellmanford19 {
    private int D[];
    private int n;
    public static final int max_value = 999;

    public Bellmanford19(int n) {
        this.n = n;
        D = new int[n + 1]; // Using 1-based indexing
    }

    public void shortest(int s, int a[][]) {
        // Initialize distances to max_value
        for (int i = 1; i <= n; i++) {
            D[i] = max_value;
        }
        D[s] = 0; // Distance to source is 0

        // Relax all edges n-1 times
        for (int k = 1; k <= n - 1; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (a[i][j] != max_value) {
                        if (D[j] > D[i] + a[i][j]) {
                            D[j] = D[i] + a[i][j];
                        }
                    }
                }
            }
        }

        // Check for negative-weight cycles
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] != max_value) {
                    if (D[j] > D[i] + a[i][j]) {
                        System.out.println("\n The graph contains -ve edge cycle ");
                        return;
                    }
                }
            }
        }

        // Print shortest distances
        for (int i = 1; i <= n; i++) {
            System.out.println(" Distance of source " + s + " to " + i + " is " + D[i]);
        }
    }

    public static void main(String[] args) {
        int n = 0, s;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number of nodes : ");
        n = sc.nextInt();

        int[][] a = new int[n + 1][n + 1];

        System.out.println("\n Enter the weighted matrix : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();

                if (i == j) {       // distance from a node to itself is 0
                    a[i][j] = 0;
                    continue;
                }

                if (a[i][j] == 0)   // 0 means no edge, so set to max_value
                    a[i][j] = max_value;
            }
        }

        System.out.print("\n Enter the source vertex : ");
        s = sc.nextInt();
        

        Bellmanford19 b = new Bellmanford19(n);
        b.shortest(s, a);

        sc.close();
    }
}
