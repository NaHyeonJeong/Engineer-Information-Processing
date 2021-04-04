package exampackage;

public class Sample01 {

    // 자바는 "배열의 크기 0"을 인정함
    public static void main(String[] args) { // entry point
        /**
         * sum : 1+2+3+4+...+NUM   NUM(10)항까지의 합
         */
        int i = 0;
        int sum = 0;
        int cnt;

        for(cnt = 1; cnt <= 10; cnt++) {
            // System.out.println("i+1 value is " + (i + 1)); // ()가 없으면 문자열 더하기 된다고*/
            i = i + 1; // i의 초기값은 0으로 줘야함 - i가 10일때 for 탈출, 이게 더 좋은 방법임
            sum += i;
            //i = i + 1; // i의 초기값은 1로 줘야함 - i가 11일때 for 탈출
        }
        // i의 값이 시험 문제의 핵심임
        System.out.println("cnt value  = " + cnt + ", total sum value = " + sum + ", last i value is = " + i);
    }
}
