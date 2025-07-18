package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fni {
    public static final fpc a = new fpc("COMPLETING_ALREADY");
    public static final fpc b = new fpc("COMPLETING_WAITING_CHILDREN");
    public static final fpc c = new fpc("COMPLETING_RETRY");
    public static final fpc d = new fpc("TOO_LATE_TO_CANCEL");
    public static final fpc e = new fpc("SEALED");
    public static final fmn f = new fmn(false);
    public static final fmn g = new fmn(true);

    public static final Object a(Object obj) {
        return obj instanceof fmx ? new fmy((fmx) obj) : obj;
    }

    public static final Object b(Object obj) {
        fmx fmxVar;
        fmy fmyVar = obj instanceof fmy ? (fmy) obj : null;
        return (fmyVar == null || (fmxVar = fmyVar.a) == null) ? obj : fmxVar;
    }
}
