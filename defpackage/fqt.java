package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqt {
    public boolean d;
    public final fpy e;
    public final boolean f;
    public final boolean g;
    public final fqi h;
    public final fql i;
    public final fpy j;
    public final SocketFactory k;
    public final List l;
    public final List m;
    public final HostnameVerifier n;
    public final fqc o;
    public int p;
    public int q;
    public int r;
    public final fuu s;
    private final long u;
    public final fqj a = new fqj();
    public final fsc t = new fsc((byte[]) null, (byte[]) null);
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public fqt() {
        fqm fqmVar = fqm.a;
        byte[] bArr = frh.a;
        this.s = new fuu(fqmVar);
        this.d = true;
        this.e = fpy.a;
        this.f = true;
        this.g = true;
        this.h = fqi.a;
        this.i = fql.a;
        this.j = fpy.a;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.k = socketFactory;
        this.l = fqu.b;
        this.m = fqu.a;
        this.n = fvd.a;
        this.o = fqc.a;
        this.p = 10000;
        this.q = 10000;
        this.r = 10000;
        this.u = 1024L;
    }
}
