package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwb extends cvk {
    final /* synthetic */ cwd a;
    private final Object b;
    private int c;

    public cwb(cwd cwdVar, int i) {
        this.a = cwdVar;
        this.b = cwdVar.e(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !a.g(this.b, this.a.e(this.c))) {
            this.c = this.a.d(this.b);
        }
    }

    @Override // defpackage.cvk, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.cvk, java.util.Map.Entry
    public final Object getValue() {
        Map mapJ = this.a.j();
        if (mapJ != null) {
            return mapJ.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.h(i);
    }

    @Override // defpackage.cvk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapJ = this.a.j();
        if (mapJ != null) {
            return mapJ.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        cwd cwdVar = this.a;
        Object objH = cwdVar.h(i);
        cwdVar.n(this.c, obj);
        return objH;
    }
}
