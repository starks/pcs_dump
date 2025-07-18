package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpe {
    public static final fpc a = new fpc("NO_THREAD_ELEMENTS");
    private static final fjc b = new flv(2);
    private static final fjc c = new flv(3);
    private static final fjc d = new flv(4);

    public static final Object a(fhq fhqVar) {
        Object objFold = fhqVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(fhq fhqVar, Object obj) {
        if (obj == null) {
            obj = a(fhqVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? fhqVar.fold(new fph(fhqVar, ((Number) obj).intValue()), d) : ((fnp) obj).be(fhqVar);
    }

    public static final void c(fhq fhqVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof fph)) {
            Object objFold = fhqVar.fold(null, c);
            objFold.getClass();
            ((fnp) objFold).bf(obj);
            return;
        }
        fph fphVar = (fph) obj;
        int length = fphVar.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            fnp fnpVar = fphVar.c[length];
            fnpVar.getClass();
            fnpVar.bf(fphVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
