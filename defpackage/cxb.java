package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxb extends cxc {
    final transient int a;
    final transient int b;
    final /* synthetic */ cxc c;

    public cxb(cxc cxcVar, int i, int i2) {
        this.c = cxcVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cwu
    public final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // defpackage.cwu
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return true;
    }

    @Override // defpackage.cwu
    public final Object[] g() {
        return this.c.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        clq.K(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.cxc
    /* renamed from: i */
    public final cxc subList(int i, int i2) {
        clq.E(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.cxc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.cxc, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
