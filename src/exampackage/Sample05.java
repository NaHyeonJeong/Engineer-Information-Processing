package exampackage;

public class Sample05 {
    /**
     * study : array
     */
    public static void main(String[] args) {
        // 배열 선언하면서 초기값을 넣음 (C와 같은 형식 사용)
        // new 필요 없음
        int[] a = {90, 100, 80, 70, 60, 50, 20};
        int sum = 0;
        double avg = 0.0;

        /*for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }*/
        for(int k: a){ // 위의 for 랑 완전 같은 의미
            sum += k;
            System.out.printf("sum = %d, k = %d\n", sum, k);
        }
        avg = (double) sum / a.length; // 평균 내는거(소수점까지)는 강제 형변환 필요, 한쪽만, 둘 다 해도 됨
        System.out.printf("----------------------\nsum = %d, average = %4.2f\n", sum, avg);
    }
}
