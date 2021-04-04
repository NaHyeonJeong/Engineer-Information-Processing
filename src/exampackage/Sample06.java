package exampackage;

public class Sample06 { // 💥💥💥💥💥💥💥💥💥💥
    /**
     * study : String
     * 너무너무 중요해요
     */
    public static void main(String[] args) {
        // String : 참조 타입
        String str = "information~~~"; // 인덱스 0 ~ 13 : 총 14
        int len = str.length(); // 1 부터 체크하는거임.. 배열 인덱스랑 좀 다름
        char[] c = new char[len];
        int i;

        System.out.printf("str.length() is %d\n", len);

        /**
         * 지금 str 에 있는 문자열을 거꾸로 출력해보자
         */
        System.out.println(str);
        len--; // 13
        for(i = len; i >= 0; i--) {
            // 전체 인덱스에서 현재 i의 값을 빼면 c[0] 부터 시작 가능
            // 13 - 13 >> 13 - 12 >> 13 - 11 >> ... 13 - 0
            c[len - i] = str.charAt(i); // charAt() : 해당되는 위치의 문자를 가져와라
            //System.out.printf("in : %d | ", i);
        }
        //System.out.printf("out : %d\n", i);
        for(char k: c) {
            System.out.printf("%c", k);
        }
    }
}
