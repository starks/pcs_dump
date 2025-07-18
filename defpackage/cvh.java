package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvh extends cvf implements ListIterator {
    final /* synthetic */ cvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvh(cvi cviVar) {
        super(cviVar);
        this.d = cviVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.d.isEmpty();
        b().add(obj);
        cvi cviVar = this.d;
        cviVar.f.b++;
        if (zIsEmpty) {
            cviVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvh(cvi cviVar, int i) {
        super(cviVar, cviVar.d().listIterator(i));
        this.d = cviVar;
    }
}
