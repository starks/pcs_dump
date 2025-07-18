package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddf {
    public int a;
    public int b;
    protected final Object[] c;
    public final StringBuilder d;
    private final dcc e;
    private int f;

    public ddf(dcc dccVar, Object[] objArr, StringBuilder sb) {
        this(dccVar);
        this.f = 0;
        this.c = objArr;
        this.d = sb;
    }

    public static void e(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(dbe.b(obj));
        sb.append("]");
    }

    public final ddg a() {
        return this.e.a;
    }

    public final String b() {
        return this.e.b;
    }

    public final /* bridge */ /* synthetic */ Object c() {
        a().c(this.d, b(), this.f, b().length());
        return this.d;
    }

    public final void d(int i, int i2, ddb ddbVar) {
        a().c(this.d, b(), this.f, i);
        Object[] objArr = this.c;
        int i3 = ddbVar.a;
        if (i3 < objArr.length) {
            Object obj = objArr[i3];
            if (obj != null) {
                ddbVar.a(this, obj);
            } else {
                this.d.append("null");
            }
        } else {
            this.d.append("[ERROR: MISSING LOG ARGUMENT]");
        }
        this.f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r7, defpackage.dav r8, defpackage.daw r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddf.f(java.lang.Object, dav, daw):void");
    }

    public ddf(dcc dccVar) {
        this.a = 0;
        this.b = -1;
        dccVar.getClass();
        this.e = dccVar;
    }
}
