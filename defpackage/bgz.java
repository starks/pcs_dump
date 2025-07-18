package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bgz implements bzx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bgz(byw bywVar, cfa cfaVar, int i) {
        this.c = i;
        this.b = bywVar;
        this.a = cfaVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [crp, java.lang.Object] */
    @Override // defpackage.bzx
    public final Object a(cag cagVar) {
        bgv bgvVar;
        int i = this.c;
        if (i == 0) {
            if (cagVar.e()) {
                bgvVar = (bgv) cagVar.c();
            } else {
                Log.e("ClearcutLoggerApiImpl", "Error sampling log.", cagVar.b());
                bgvVar = bgv.a;
            }
            return ((bhc) this.a).a((bfx) this.b, bgvVar);
        }
        if (i == 1) {
            int i2 = bhc.a;
            if (cagVar.e()) {
                return (cag) this.a.a(this.b);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", cagVar.b());
            return cagVar;
        }
        boolean z = cagVar.b() instanceof bjj;
        Object obj = this.a;
        Object obj2 = this.b;
        if (z) {
            return ((byw) obj2).a(((cfa) obj).c);
        }
        if (cagVar.b() instanceof bix) {
            bix bixVar = (bix) cagVar.b();
            bixVar.getClass();
            if (bixVar.a() == 29514) {
                return ((byw) obj2).a(((cfa) obj).c);
            }
        }
        return cagVar;
    }

    public /* synthetic */ bgz(Object obj, bfx bfxVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = bfxVar;
    }
}
