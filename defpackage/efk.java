package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efk extends AbstractList {
    private final efi a;
    private final efj b;

    public efk(efi efiVar, efj efjVar) {
        this.a = efiVar;
        this.b = efjVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
