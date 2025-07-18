package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkz implements fku {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public fkz(fku fkuVar, fiy fiyVar, int i) {
        this.c = i;
        this.a = fkuVar;
        this.b = fiyVar;
    }

    @Override // defpackage.fku
    public final Iterator a() {
        int i = this.c;
        return i != 0 ? i != 1 ? new flb(this) : new fkt(this) : new fky(this);
    }

    public fkz(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
