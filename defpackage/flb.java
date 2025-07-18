package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flb implements Iterator {
    final /* synthetic */ fkz a;
    private int b = -1;
    private int c;
    private int d;
    private fki e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    public flb(fkz fkzVar) {
        this.a = fkzVar;
        int iK = fjs.k(0, 0, fkzVar.b.length());
        this.c = iK;
        this.d = iK;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fjc, java.lang.Object] */
    private final void a() {
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        if (i > this.a.b.length()) {
            this.e = new fki(this.c, fjz.h(this.a.b));
            this.d = -1;
        } else {
            fkz fkzVar = this.a;
            ffs ffsVar = (ffs) fkzVar.a.a(fkzVar.b, Integer.valueOf(this.d));
            if (ffsVar == null) {
                this.e = new fki(this.c, fjz.h(this.a.b));
                this.d = -1;
            } else {
                int iIntValue = ((Number) ffsVar.a).intValue();
                int iIntValue2 = ((Number) ffsVar.b).intValue();
                this.e = fjs.m(this.c, iIntValue);
                int i2 = iIntValue + iIntValue2;
                this.c = i2;
                this.d = i2 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        fki fkiVar = this.e;
        fkiVar.getClass();
        this.e = null;
        this.b = -1;
        return fkiVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
