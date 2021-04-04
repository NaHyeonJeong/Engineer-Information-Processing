package exampackage;

public class Sample09_rightTriangle {
    /**
     * study : 2차원 배열
     * 총 4가지의 직각 삼각형을 그려보자
     */
    public static void main(String[] args) {
        int[][] a = new int[5][5]; // 5행 5열
        int i, j, k = 1;

        for(i = 0; i < 5; i++) {
            for(j = 0; j < i; j++) { // 직각삼각형 1번
            //for(j = (0+4)-i; j < 5; j++) { // 직각삼각형 2번 : 4부터 4까지 - reverse
            //for(j = i; j < 5; j++) { // 직각삼각형 3번 : 선택 정렬에 활용
            //for(j = 0; j <= (0+4)-i; j++) { // 직각삼각형 4번 : 버블 정렬에 활용
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
