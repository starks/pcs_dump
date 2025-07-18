package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgu extends fgw implements Iterator {
    public fgu(fgy fgyVar) {
        super(fgyVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        fgy fgyVar = this.a;
        int i = this.b;
        if (i >= fgyVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        fgv fgvVar = new fgv(fgyVar, i);
        b();
        return fgvVar;
    }
}
