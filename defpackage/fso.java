package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fso {
    public static final fso a = new fso();

    private fso() {
    }

    public static final String a(fqq fqqVar) {
        String strB = fqqVar.b();
        String strC = fqqVar.c();
        if (strC == null) {
            return strB;
        }
        return strB + "?" + strC;
    }
}
