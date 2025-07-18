package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cfo implements csg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cfo(cgc cgcVar, bfx bfxVar, int i) {
        this.c = i;
        this.b = cgcVar;
        this.a = bfxVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.csg
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return ((det) ((fcy) this.a).c).h(((eea) this.b).x());
        }
        if (i == 1) {
            return ((aqi) this.a).a((String) this.b);
        }
        if (i != 2) {
            Set set = (Set) ((cgc) this.b).a.b.get(((bfx) this.a).h);
            return set != null ? set : cyv.a;
        }
        Set set2 = (Set) ((cgc) this.b).a.a.get(new crv(((bfx) this.a).h, null));
        return set2 != null ? set2 : cyv.a;
    }

    public /* synthetic */ cfo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
