package exampackage;

public class Sample03 {
    /**
     * study : while
     */
    public static void main(String[] args) { // entry point
        /**
         * sum : 1+2+3+4+...+NUM   NUM(10)항까지의 합
         */
        int i = 0, sum = 0, cnt;

        // while : 초기식, 조건식, 💥증감식(카운트 하고 작업 할래, 작업 끝나고 카운트 할래)
        // 첫번째 작업을 한다 - 카운트 1 or 첫번째 작업이 끝났다 - 카운트 1
        // 두번째 작업을 한다 - 카운트 2 or 두번째 작업이 끝났다 - 카운트 2
        // ...
        cnt = (0); // 초기식
        while(cnt < 10) { // 조건식
            cnt++; // 증감식 : cnt 초기값은 0(0~9 : 10회), while 조건은 (cnt < 10) == (cnt <= 9) == (cnt != 10)
            i = i + 1;
            sum += i;
            //i = i + 1; // i의 초기값은 1로 줘야함, 대신 while 끝난 후 i의 값은 11
            //cnt++; // 증감식 : cnt 초기값은 1(1~10: 10회), while 조건은 (cnt <= 10)
        }
        // 최종적으로 나왔을 때 i와 cnt의 값이 같은게 제일 좋음
        System.out.println("cnt value  = " + cnt + ", total sum value = " + sum + ", last i value is = " + i);
    }
}
