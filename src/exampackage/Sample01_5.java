package exampackage;

public class Sample01_5 {

    // 자바는 "배열의 크기 0"을 인정함
    // 최종 cnt와 i 값이 다름
    public static void main(String[] args) { // entry point
        /**
         * sum : 1 + 1 + 2 + 3 + 5 + 8 + 13 + ? ... + NUM(10) 항까지의 합
         *       0+1  1+1  1+2  2+3  3+5  ... (i+j)
         *       i + j = fi
         *           i   j   fi
         *       1회 끝나고 대입 방향 : i  <  j  < fi
         * (0    1)    1    2    3    5    8   ...
         * 피보나치 수열 : 처음 보이는 두 수를 주어주고 시작함
         * "반복문"을 사용한 피보나치 수열
         */
        int cnt, i = 1, j = 1, fi = (0), sum = (2);

        System.out.printf("---\"for statement\" start---\n");
        // 10항 중 앞의 2개의 항은 sum에 이미 계산되어 있기 떄문에 3항 부터임
        // for(cnt = 1; cnt <= 8; cnt++) {
        for(cnt = (3); cnt <= 10; cnt++) {
            fi = i + j;
            sum = sum + fi; // cnt = 1일 때 3항(2)이 들어옴, 그러므로 1+1은 sum에 미리 넣어두어야 하니까 sum의 초기값은 2
            System.out.printf("cnt = %2d, i = %2d, j = %2d, fi = %2d, sum = %2d\n", cnt, i, j, fi, sum);
            // 다음 계산을 위해 새로 setting
            i = j;
            j = fi;
        }
        System.out.printf("---\"for statement\" end---\n");
        System.out.printf("cnt = %2d, i = %2d, j = %2d, fi = %2d, sum = %2d\n", cnt, i, j, fi, sum);
    }
}
