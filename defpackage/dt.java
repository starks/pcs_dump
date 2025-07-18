package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dt extends ea {
    final /* synthetic */ du a;

    public dt(du duVar) {
        this.a = duVar;
    }

    @Override // defpackage.ea
    public final int a() {
        return ((cyp) this.a.b).c;
    }

    @Override // defpackage.ea
    public final int b() {
        return ((cyp) this.a.a).c;
    }

    @Override // defpackage.ea
    public final boolean c(int i, int i2) {
        List list = this.a.b;
        Object obj = this.a.a.get(i);
        Object obj2 = list.get(i2);
        if (obj != null && obj2 != null) {
            return ((awk) obj2).c((awk) obj);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.ea
    public final boolean d(int i, int i2) {
        List list = this.a.b;
        Object obj = this.a.a.get(i);
        Object obj2 = list.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((awk) obj2).d((awk) obj);
    }

    @Override // defpackage.ea
    public final void e(int i, int i2) {
        List list = this.a.b;
        Object obj = this.a.a.get(i);
        Object obj2 = list.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
    }
}
