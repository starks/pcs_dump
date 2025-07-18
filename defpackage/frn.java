package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frn {
    public static final Logger b;
    public boolean c;
    public long d;
    public final fsc h;
    public static final fwv i = new fwv();
    public static final frn a = new frn(new fsc(frh.p(String.valueOf(frh.f).concat(" TaskRunner"), true)));
    private int j = 10000;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Runnable g = new ezk(this, 9);

    static {
        Logger logger = Logger.getLogger(frn.class.getName());
        logger.getClass();
        b = logger;
    }

    public frn(fsc fscVar) {
        this.h = fscVar;
    }

    public final frm a() {
        int i2;
        synchronized (this) {
            i2 = this.j;
            this.j = i2 + 1;
        }
        return new frm(this, a.x(i2, "Q"));
    }

    public final void b(frk frkVar, long j) {
        byte[] bArr = frh.a;
        frm frmVar = frkVar.b;
        frmVar.getClass();
        if (frmVar.d != frkVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = frmVar.f;
        frmVar.f = false;
        frmVar.d = null;
        this.e.remove(frmVar);
        if (j != -1 && !z && !frmVar.c) {
            frmVar.e(frkVar, j, true);
        }
        if (frmVar.e.isEmpty()) {
            return;
        }
        this.f.add(frmVar);
    }

    public final void c(frm frmVar) {
        byte[] bArr = frh.a;
        if (frmVar.d == null) {
            if (frmVar.e.isEmpty()) {
                this.f.remove(frmVar);
            } else {
                List list = this.f;
                if (!list.contains(frmVar)) {
                    list.add(frmVar);
                }
            }
        }
        if (this.c) {
            fsc.e(this);
        } else {
            this.h.d(this.g);
        }
    }
}
