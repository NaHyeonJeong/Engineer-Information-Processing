package exampackage;

public class Sample01_1 {

    // 자바는 "배열의 크기 0"을 인정함
    // 최종 cnt와 i 값이 다름
    public static void main(String[] args) { // entry point
        /**
         * sum : 1+3+7+9+...+NUM(10)항까지의 합
         */
        /*int cnt, i = (1), sum = 1; // 1항이 미리 주어짐 sum = 1

        System.out.printf("---\"for statement\" start---\n");
//        for(cnt = 1; cnt <= (9); cnt++) {
        for(cnt = 1; cnt < (10); cnt++) { // 이미 sum 초기 값에 1이 들어 있었고 i는 현재 3이고 10항까지 더해야 하기 때문에 < 10이 맞는거임
            i += 2; // i = 3
            sum += i; // sum + i = 1 + 3
            // 2자리의 오른쪽 정렬, 3자리의 오른쪽 정렬 (왼쪽 기준 하고 싶으면 숫자 앞에 - 붙이기)
            System.out.printf("i is %2d, sum is %3d\n", i, sum);
        }
        System.out.printf("---\"for statement\" end---\n");
        System.out.println("total sum value = " + sum + ", last cnt value is = " + cnt + ", last i value is = " + i);*/

        /**
         * 위의 주석 처리한 코드를 sum 초기값을 다르게 주어주고 해봄
         * 똑같이 10항까지의 합을 구함
         */
        int cnt, i = (-1), sum = (0);
        System.out.printf("---\"for statement\" start---\n");
        for(cnt = 1; cnt <= (10); cnt++) {
            i += (2);
            sum += i;
            System.out.printf("i is %2d, sum is %3d\n", i, sum);
        }
        System.out.printf("---\"for statement\" end---\n");
        System.out.println("total sum value = " + sum + ", last cnt value is = " + cnt + ", last i value is = " + i);
    }
}
