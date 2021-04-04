package exampackage;

public class Sample09_3 {
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

        // 이차원 배열의 가장 간결한 출력 방법
        for(int i[]: a) { // 전체 층을 가져와서
            for(int j: i) { // 방 수는 몇 개?
                System.out.printf(" %3d ", j);
            }
            System.out.println();
        }
    }
}
