package exampackage;

public class Sample01_4 {

    // 자바는 "배열의 크기 0"을 인정함
    public static void main(String[] args) { // entry point
        /**
         * sum : 2+3+5+8+12+17+?...+NUM(10) 항까지의 합
         * i = 2  3  5  8 ...
         * j =  1  2  3 ...
         */
        int cnt, i = (2), j = (0), sum = 0;
        for(cnt = 1; cnt <= 10; cnt++){
            sum += i;
            j += 1;
            i += j;
            System.out.println("cnt = " + cnt + " j = " + j + " i = " + i);
        }
        System.out.println("---------------------------");
        System.out.println("cnt = " + cnt + ", j = " + j + ", i = " + i + ", sum = " + sum);
    }
}
