package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bbg implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ bbg(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        if (i == 0) {
            czn cznVar = bbq.b;
            return new IllegalStateException("No key available for VM");
        }
        if (i == 1) {
            return new AssertionError();
        }
        if (i == 2) {
            int i2 = cxc.d;
            return new cwy();
        }
        if (i == 3) {
            return new cxm();
        }
        if (i != 4) {
            return new cxe();
        }
        cxl cxlVar = cxl.a;
        return new brb((short[]) null);
    }
}
