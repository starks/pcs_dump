package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcr {
    public final fcp a;
    public final fdj b;
    public int c;
    public final fco d;

    public fcr(fcp fcpVar, fdj fdjVar) {
        this.a = fcpVar;
        fdjVar.getClass();
        this.b = fdjVar;
        this.c = 65535;
        this.d = new fco(this, 0, 65535, null);
    }

    public final void a(boolean z, fco fcoVar, fvk fvkVar, boolean z2) {
        fvkVar.getClass();
        int iC = fcoVar.c();
        boolean zE = fcoVar.e();
        int i = (int) fvkVar.b;
        if (zE || iC < i) {
            if (!zE && iC > 0) {
                fcoVar.d(fvkVar, iC, false);
            }
            fcoVar.a.bi(fvkVar, (int) fvkVar.b);
            fcoVar.d = z | fcoVar.d;
        } else {
            fcoVar.d(fvkVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    public final void b() {
        try {
            this.b.g();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        fco[] fcoVarArrR = this.a.r();
        Collections.shuffle(Arrays.asList(fcoVarArrR));
        int length = fcoVarArrR.length;
        int i = this.d.b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                fco fcoVar = fcoVarArrR[i3];
                int iMin = Math.min(i, Math.min(fcoVar.b(), iCeil));
                if (iMin > 0) {
                    fcoVar.c += iMin;
                    i -= iMin;
                }
                if (fcoVar.b() > 0) {
                    fcoVarArrR[i2] = fcoVar;
                    i2++;
                }
            }
            length = i2;
        }
        fcq fcqVar = new fcq();
        for (fco fcoVar2 : this.a.r()) {
            fcoVar2.f(fcoVar2.c, fcqVar);
            fcoVar2.c = 0;
        }
        if (fcqVar.a()) {
            b();
        }
    }

    public final void d(fco fcoVar, int i) {
        if (fcoVar == null) {
            this.d.a(i);
            c();
            return;
        }
        fcoVar.a(i);
        fcq fcqVar = new fcq();
        fcoVar.f(fcoVar.c(), fcqVar);
        if (fcqVar.a()) {
            b();
        }
    }
}
