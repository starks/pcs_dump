package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cga {
    private final boolean a = true;
    private final Set b;
    private final cgu c;
    private final cgu d;

    public cga(boolean z, Set set, cgu cguVar, cgu cguVar2) {
        this.b = set;
        this.c = cguVar;
        this.d = cguVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    private final cge d(final cem cemVar, final String str) {
        cge cgeVar;
        cge[] cgeVarArr;
        int length;
        brb brbVar = cge.h;
        final Set set = this.b;
        csg csgVarT = clq.t(new csg() { // from class: cgd
            public final /* synthetic */ String c = "";

            @Override // defpackage.csg
            public final Object a() {
                return new cge(cemVar, str, this.c, set);
            }
        });
        AtomicReference atomicReference = (AtomicReference) ConcurrentMap.EL.computeIfAbsent(brbVar.a, str, new bog(2));
        loop0: while (true) {
            cge[] cgeVarArr2 = (cge[]) atomicReference.get();
            if (cgeVarArr2 == null || (length = cgeVarArr2.length) == 0) {
                cge cgeVar2 = (cge) csgVarT.a();
                cgeVar = cgeVar2;
                cgeVarArr = new cge[]{cgeVar2};
            } else {
                cge cgeVar3 = cgeVarArr2[0];
                if (cgeVar3.c.equals("")) {
                    cgeVar = cgeVar3;
                    cgeVarArr = null;
                } else {
                    cgeVar = (cge) csgVarT.a();
                    cgeVarArr = new cge[length + 1];
                    cgeVarArr[0] = cgeVar;
                    System.arraycopy(cgeVarArr2, 0, cgeVarArr, 1, length);
                }
            }
            if (cgeVarArr == null) {
                break;
            }
            while (!atomicReference.compareAndSet(cgeVarArr2, cgeVarArr)) {
                if (atomicReference.get() != cgeVarArr2) {
                    break;
                }
            }
            break loop0;
        }
        if (cgeVarArr != null) {
            Context context = cemVar.c;
            fuu fuuVar = new fuu(brbVar);
            fuu fuuVar2 = new fuu(brbVar);
            if (cgp.b == null) {
                synchronized (cgp.class) {
                    if (cgp.b == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            context.registerReceiver(new cgp(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        }
                        cgp.b = fuuVar;
                        cgp.a = fuuVar2;
                    }
                }
            }
        }
        boolean z = cgeVar.d;
        clq.A(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return cgeVar;
    }

    public final Object a(String str, String str2) {
        try {
            return this.c.a(str2);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PhenotypeCombinedFlags", "Invalid Phenotype flag value for flag ".concat(str), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.cem r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            android.content.Context r0 = r7.c
            cru r0 = defpackage.ceh.a(r0)
            boolean r1 = r0.c()
            r2 = 0
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.a()
            android.net.Uri r3 = defpackage.cej.a(r8)
            brb r1 = (defpackage.brb) r1
            java.lang.String r1 = r1.B(r3, r2, r9)
            if (r1 != 0) goto L1e
            goto L23
        L1e:
            java.lang.Object r1 = r6.a(r9, r1)
            goto L24
        L23:
            r1 = r2
        L24:
            android.content.Context r3 = r7.c
            java.lang.String r8 = defpackage.cej.b(r3, r8)
            android.content.Context r3 = r7.c
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = "com.android.vending"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L49
            dke r3 = r7.c()
            cfz r4 = new cfz
            r5 = 0
            r4.<init>(r7, r8, r5)
            djy r3 = r3.submit(r4)
            defpackage.clq.r(r3)
        L49:
            cge r7 = r6.d(r7, r8)
            egc r7 = r7.d()
            java.lang.Object r7 = r7.d
            cxg r7 = (defpackage.cxg) r7
            java.lang.Object r7 = r7.get(r9)
            if (r7 != 0) goto L5c
            goto L6f
        L5c:
            cgu r6 = r6.d     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r6.a(r7)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r6 = move-exception
            java.lang.String r7 = "Invalid Phenotype flag value for flag "
            java.lang.String r7 = r7.concat(r9)
            java.lang.String r8 = "PhenotypeCombinedFlags"
            android.util.Log.e(r8, r7, r6)
        L6f:
            boolean r6 = r0.c()
            if (r6 == 0) goto L76
            return r1
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cga.b(cem, java.lang.String, java.lang.String):java.lang.Object");
    }

    public final brb c(cem cemVar, String str) {
        cem.d();
        return d(cemVar, cej.b(cemVar.c, str)).g;
    }
}
