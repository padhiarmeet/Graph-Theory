package lab_4;

public class Lab_4_1 {
    public static void main(String[] args) {
        int[][] adj = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };
        int count = 0;
        int n = adj.length;
        boolean count0 = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (adj[i][j] == 1)
                    count++;
                else
                    count0 = true;
            }
        }
        if (!count0) {
            System.out.println("Total group is - 1");
        } 
        else {
            if (count == 0) {
                for (int i = 0; i < n; i++) {
                    if (adj[i][i] == 1)
                        count++;
                }
                System.out.println("Total group is - " + count);
            } 
            else {
                System.out.println("Total group is - " + count);

            }
        }
    }
}
