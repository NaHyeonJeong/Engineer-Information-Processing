package exampackage;

public class Sample06 { // π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯
    /**
     * study : String
     * λλ¬΄λλ¬΄ μ€μν΄μ
     */
    public static void main(String[] args) {
        // String : μ°Έμ‘° νμ
        String str = "information~~~"; // μΈλ±μ€ 0 ~ 13 : μ΄ 14
        int len = str.length(); // 1 λΆν° μ²΄ν¬νλκ±°μ.. λ°°μ΄ μΈλ±μ€λ μ’ λ€λ¦
        char[] c = new char[len];
        int i;

        System.out.printf("str.length() is %d\n", len);

        /**
         * μ§κΈ str μ μλ λ¬Έμμ΄μ κ±°κΎΈλ‘ μΆλ ₯ν΄λ³΄μ
         */
        System.out.println(str);
        len--; // 13
        for(i = len; i >= 0; i--) {
            // μ μ²΄ μΈλ±μ€μμ νμ¬ iμ κ°μ λΉΌλ©΄ c[0] λΆν° μμ κ°λ₯
            // 13 - 13 >> 13 - 12 >> 13 - 11 >> ... 13 - 0
            c[len - i] = str.charAt(i); // charAt() : ν΄λΉλλ μμΉμ λ¬Έμλ₯Ό κ°μ ΈμλΌ
            //System.out.printf("in : %d | ", i);
        }
        //System.out.printf("out : %d\n", i);
        for(char k: c) {
            System.out.printf("%c", k);
        }
    }
}
