package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewk {
    public List a;
    public int b;
    public int c;

    public ewk(List list) {
        this.a = list;
    }

    public final elp a() {
        return ((emv) this.a.get(this.b)).c;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((emv) this.a.get(this.b)).b.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}
