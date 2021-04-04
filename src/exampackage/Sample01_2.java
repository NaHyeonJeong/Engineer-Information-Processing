package exampackage;

public class Sample01_2 {

    // 시험 문제로 더 자주 나오는 형식
    // 최종 cnt와 i의 값이 같음
    // 자바는 "배열의 크기 0"을 인정함
    public static void main(String[] args) { // entry point
        /**
         * sum :1+2+3+4+...+NUM(10)항까지의 합
         */
        int cnt, i = (1), sum = 0;
        for(cnt = 1; cnt <= 10; cnt++){
            sum += i;
            System.out.println("cnt = " + cnt + " i = " + i);
            i += 1;
        }
        System.out.println("---------------------------");
        System.out.println("cnt = " + cnt + " i = " + i);
        System.out.println("sum = " + sum);
    }
}
