package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fau extends fjp {
    public static final Logger a = Logger.getLogger(fau.class.getName());
    private static final eyg s = new fbg(evt.o, 0);
    private static final enf t = new fat();
    private static final emu u = emu.a;
    private static final emf v = emf.a;
    private static final long w = TimeUnit.SECONDS.toMillis(120);
    final List b;
    public final List c;
    public final List d;
    enf e;
    public eyg f;
    public emu g;
    public emf h;
    long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    enl n;
    etk o;
    public final eqz p;
    public final ekf q;
    fjp r;

    public fau(eqz eqzVar) {
        super((char[]) null);
        this.q = new ekf((byte[]) null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = t;
        this.f = s;
        this.g = u;
        this.h = v;
        this.i = w;
        this.r = ems.c;
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = enl.b;
        this.o = etl.a;
        this.p = eqzVar;
        Iterator it = fsc.s().p().iterator();
        while (it.hasNext()) {
            ((emg) it.next()).b();
        }
    }
}
