package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgp implements Iterator {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public fgp() {
    }

    public final int a() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
            return i;
        }
        if (!this.c) {
            throw new NoSuchElementException();
        }
        this.c = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }

    public fgp(int i, int i2, int i3) {
        this();
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = true != z ? i2 : i;
    }
}
