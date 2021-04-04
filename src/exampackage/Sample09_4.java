package exampackage;

public class Sample09_4 {
    /**
     * study : 2차원 배열
     */
    public static void main(String[] args) {
        int[][] a = new int[5][6]; // 5행 5열
        int i, j, k = 1;

        for(i = 0; i < 5; i++) { // 행
            for(j = 0; j < 6; j++) { // 열
                a[i][j] = k++; // ++k 였다면 k의 초기값은 0 (증가한 값을 넣는거임)
            }
        }
        for(i = 0; i < a.length; i++) { // 행
            for(j = 0; j < a[i].length; j++) { // 열
                System.out.printf("%03d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
