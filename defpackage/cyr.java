package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyr extends cxo {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient cxg d;

    public cyr(cxg cxgVar, Object[] objArr, int i, int i2) {
        this.d = cxgVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.cwu
    public final int a(Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cxo, defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final czc listIterator() {
        return d().iterator();
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return true;
    }

    @Override // defpackage.cxo
    public final cxc k() {
        return new cyq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.cxo, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
