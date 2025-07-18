package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adi extends zh {
    public final add g;
    public final AtomicBoolean h;
    public final fhq i;
    private final acq j;
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final fiy m;
    private final ayo n;

    public adi(add addVar, ayo ayoVar, String[] strArr, fiy fiyVar) {
        this(addVar, ayoVar, strArr);
        this.m = fiyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.zh
    protected final void e() {
        this.n.b.add(this);
        fjp.q(this.g.h(), this.i, new acr(this, (fhk) null, 3, (byte[]) null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.zh
    protected final void f() {
        this.n.b.remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[Catch: all -> 0x0032, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x002d, B:51:0x00f4), top: B:73:0x002d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002d, B:49:0x00e9, B:51:0x00f4, B:58:0x0110, B:55:0x0106, B:56:0x010d), top: B:71:0x0025, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e6 -> B:49:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0127 -> B:63:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.fhk r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adi.k(fhk):java.lang.Object");
    }

    public final Object l(fhk fhkVar) {
        return un.v(this.g, true, false, this.m, fhkVar);
    }

    public adi(add addVar, ayo ayoVar, String[] strArr) {
        this.g = addVar;
        this.n = ayoVar;
        this.j = new adg(strArr, this);
        this.h = new AtomicBoolean(true);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.i = addVar.i() ? addVar.g() : fhr.a;
    }
}
