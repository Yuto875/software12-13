class AlphameticValue{
    private static int[] vals = new vals[6];
     private String digits;

    // コンストラクタ
    public AlphameticValue(String digits) {
        this.digits = digits;
    }

    // ゲッター
    public String getDigits() {
        return digits;
    }

    // セッター
    public void setDigits(String digits) {
        this.digits = digits;
    }

    // クラス変数valsのセッター
    public static void setVals(int[] values) {
        if (values.length != 6) throw new IllegalArgumentException("Length must be 6.");
        for (int i = 0; i < 6; i++) {
            vals[i] = values[i];
        }
    }

    public int toInt() {
        int result = 0;
        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            int index = ch - 'A';  // 'A' → 0, 'B' → 1, ..., 'F' → 5
            result = result * 10 + vals[index];
        }
        return result;
    }
}