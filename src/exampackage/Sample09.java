package exampackage;

public class Sample09 {
    /**
     * study : 2차원 배열
     */
    public static void main(String[] args) {
        int[][] a = new int[3][5]; // 3행 5열
        int i, j;

        // 우리가 그리기는 행, 열을 나누지만 실제로는 한 줄로 나와있음
        for(i = 0; i < 3; i++) { // 행
            for(j = 0; j < 5; j++) { // 열
                a[i][j] = i + j; // 0 - 0,1,2,3,4 | 1 - 0,1,2,3,4 | 2 - 0,1,2,3,4
                System.out.printf("%d", a[i][j]);
            }
            System.out.println();
        }
    }
}
