package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsr {
    private final fvm a;
    private long b = 262144;

    public fsr(fvm fvmVar) {
        this.a = fvmVar;
    }

    public final String a() {
        String strO = this.a.o(this.b);
        this.b -= strO.length();
        return strO;
    }

    public final fqo b() {
        fsc fscVar = new fsc((byte[]) null);
        while (true) {
            String strA = a();
            if (strA.length() == 0) {
                return fscVar.h();
            }
            int iU = fjz.u(strA, ':', 1, 4);
            if (iU != -1) {
                String strSubstring = strA.substring(0, iU);
                strSubstring.getClass();
                String strSubstring2 = strA.substring(iU + 1);
                strSubstring2.getClass();
                fscVar.j(strSubstring, strSubstring2);
            } else if (strA.charAt(0) == ':') {
                String strSubstring3 = strA.substring(1);
                strSubstring3.getClass();
                fscVar.j("", strSubstring3);
            } else {
                fscVar.j("", strA);
            }
        }
    }
}
