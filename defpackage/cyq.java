package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyq extends cxc {
    final /* synthetic */ cyr a;

    public cyq(cyr cyrVar) {
        this.a = cyrVar;
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        clq.K(i, this.a.c);
        cyr cyrVar = this.a;
        Object[] objArr = cyrVar.a;
        int i2 = i + i;
        int i3 = cyrVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.cxc, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
