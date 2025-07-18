package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgx extends fgw implements Iterator {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgx(fgy fgyVar, int i, byte[] bArr) {
        super(fgyVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            fgy fgyVar = this.a;
            if (i >= fgyVar.e) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            Object obj = fgyVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        fgy fgyVar2 = this.a;
        if (i2 >= fgyVar2.e) {
            throw new NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        Object[] objArr = fgyVar2.c;
        objArr.getClass();
        Object obj2 = objArr[i2];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgx(fgy fgyVar, int i) {
        super(fgyVar);
        this.d = i;
    }
}
