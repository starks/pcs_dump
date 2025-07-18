package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmb {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private static final /* synthetic */ int[] e = {a, b, c, d};

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNDISPATCHED" : "ATOMIC" : "LAZY" : "DEFAULT";
    }

    public static void b(int i, fjc fjcVar, Object obj, fhk fhkVar) {
        Object objA;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            fjz.M(fjcVar, obj, fhkVar);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fjp.C(fjp.B(fjcVar, obj, fhkVar)).e(ffz.a);
                return;
            }
            if (i2 != 3) {
                throw new ffq();
            }
            try {
                fhq fhqVarD = fhkVar.d();
                Object objB = fpe.b(fhqVarD, null);
                try {
                    if (fjcVar instanceof fhx) {
                        fjz.c(fjcVar, 2);
                        objA = fjcVar.a(obj, fhkVar);
                    } else {
                        objA = fjp.A(fjcVar, obj, fhkVar);
                    }
                    if (objA != fhs.a) {
                        fhkVar.e(objA);
                    }
                } finally {
                    fpe.c(fhqVarD, objB);
                }
            } catch (Throwable th) {
                fhkVar.e(ffh.b(th));
            }
        }
    }

    public static boolean c(int i) {
        if (i != 0) {
            return i == b;
        }
        throw null;
    }

    public static int[] values$ar$edu$30af0825_0() {
        return new int[]{a, b, c, d};
    }
}
