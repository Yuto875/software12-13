public class AlphameticValueTester {

    // 指定された割り当て（vals）で問題が成立するか検証
    public static boolean isValidSolution(int[] vals) {
        AlphameticValue.setVals(vals);

        AlphameticValue abc = new AlphameticValue("ABC");
        AlphameticValue def = new AlphameticValue("DEF");
        AlphameticValue cab = new AlphameticValue("CAB");

        int abcVal = abc.toInt();
        int defVal = def.toInt();
        int cabVal = cab.toInt();

        return abcVal + defVal == cabVal;
    }

    public static void solve() {
        int[] vals = new int[6];

        for (int A = 0; A <= 9; A++) {
            for (int B = 0; B <= 9; B++) {
                if (B == A) continue;
                for (int C = 0; C <= 9; C++) {
                    if (C == A || C == B) continue;
                    for (int D = 0; D <= 9; D++) {
                        if (D == A || D == B || D == C) continue;
                        for (int E = 0; E <= 9; E++) {
                            if (E == A || E == B || E == C || E == D) continue;
                            for (int F = 0; F <= 9; F++) {
                                if (F == A || F == B || F == C || F == D || F == E) continue;

                                vals[0] = A;
                                vals[1] = B;
                                vals[2] = C;
                                vals[3] = D;
                                vals[4] = E;
                                vals[5] = F;

                                if (isValidSolution(vals)) {
                                    System.out.println("条件を見たす解を発見:");
                                    System.out.println("A=" + A + ", B=" + B + ", C=" + C +
                                            ", D=" + D + ", E=" + E + ", F=" + F);

                                    AlphameticValue.setVals(vals);
                                    AlphameticValue abc = new AlphameticValue("ABC");
                                    AlphameticValue def = new AlphameticValue("DEF");
                                    AlphameticValue cab = new AlphameticValue("CAB");

                                    System.out.println("ABC = " + abc.toInt());
                                    System.out.println("DEF = " + def.toInt());
                                    System.out.println("CAB = " + cab.toInt());
                                    return; // 最初の解だけで終了
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("解が見つかりませんでした。");
    }

    // main メソッド
    public static void main(String[] args) {
        solve();
    }
}
