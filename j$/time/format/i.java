package j$.time.format;

/* loaded from: classes2.dex */
final class i implements f {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lE = vVar.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (lE == null) {
                    return false;
                }
                sb.append("GMT");
                long jLongValue = lE.longValue();
                int i = (int) jLongValue;
                if (jLongValue != i) {
                    throw new ArithmeticException();
                }
                if (i != 0) {
                    int iAbs = Math.abs((i / 3600) % 100);
                    int iAbs2 = Math.abs((i / 60) % 60);
                    int iAbs3 = Math.abs(i % 60);
                    sb.append(i < 0 ? "-" : "+");
                    if (((C) this.b) == C.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.b);
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + String.valueOf((C) this.b) + ")";
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }
}
