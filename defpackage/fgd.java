package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgd extends fgc implements ListIterator {
    final /* synthetic */ fgf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgd(fgf fgfVar, int i) {
        super(fgfVar);
        this.c = fgfVar;
        ffh.aq(i, fgfVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ffh.ao();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        fgf fgfVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return fgfVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        ffh.ao();
    }
}
