package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eds extends edt {
    final /* synthetic */ eea a;
    private int b = 0;
    private final int c;

    public eds(eea eeaVar) {
        this.a = eeaVar;
        this.c = eeaVar.d();
    }

    @Override // defpackage.edw
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
