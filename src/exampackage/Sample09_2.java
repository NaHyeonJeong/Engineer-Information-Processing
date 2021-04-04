package exampackage;

public class Sample09_2 {
    /**
     * study : 2차원 배열
     */
    public static void main(String[] args) {
        int[][] a = { // 칸의 수가 달라도 가변 배열 지원함
                {1, 2, 3, 4, 5, 6},
                {10, 20, 30, 40, 50},
                {100, 200},
                {1, 2, 3}
        };
        int i, j;

        for(i = 0; i < a.length; i++) {
            for(j = 0; j < a[i].length; j++) {
                System.out.printf(" %3d ", a[i][j]);
            }
            System.out.println();
        }

    }
}
