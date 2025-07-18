package defpackage;

import android.content.Context;
import android.os.SystemProperties;
import j$.util.Optional;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqx implements eko {
    private final ekr a;
    private final ekr b;
    private final ekr c;
    private final ekr d;
    private final /* synthetic */ int e;

    public aqx(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, int i) {
        this.e = i;
        this.a = ekrVar;
        this.b = ekrVar2;
        this.c = ekrVar3;
        this.d = ekrVar4;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        int i = this.e;
        if (i == 0) {
            return new aqw((aqr) this.a.b(), (auh) this.b.b(), (akp) this.c.b(), ((avn) this.d).b());
        }
        if (i == 1) {
            ekr ekrVar = this.c;
            aoa aoaVarA = ((arg) this.a).a();
            anj anjVar = (anj) ekrVar.b();
            Executor executor = (Executor) this.d.b();
            api apiVar = (api) this.b.b();
            if (((ang) aoaVarA.b()).d()) {
                return new aqq(anjVar, executor, apiVar, aoaVarA, new Random());
            }
            return null;
        }
        if (i == 2) {
            return new arc((dke) this.d.b(), ((ekg) this.c).b(), (auh) this.b.b(), (akp) this.a.b());
        }
        if (i == 3) {
            return new arc((dke) this.d.b(), ((ekg) this.c).b(), (auh) this.b.b(), (akp) this.a.b());
        }
        if (i == 4) {
            return new arw(((aqn) this.b).b(), (Optional) ((ekp) this.d).a, (aqr) this.a.b(), (Executor) this.c.b());
        }
        if (i == 5) {
            return (SystemProperties.get("ro.boot.hardware.revision").contains("EVT") || !(ann.a().a() || ((bak) ((aoa) this.d.b()).b()).a())) ? new aym() : new ayl((anj) this.c.b(), (Executor) this.b.b());
        }
        aoa aoaVar = (aoa) this.c.b();
        bnz bnzVar = (bnz) this.b.b();
        Executor executor2 = (Executor) this.d.b();
        Context contextB = ((ekg) this.a).b();
        if (((bak) aoaVar.b()).b()) {
            return new bcy(bnzVar, executor2, contextB);
        }
        return null;
    }

    public aqx(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = ekrVar;
        this.c = ekrVar2;
        this.d = ekrVar3;
        this.b = ekrVar4;
    }

    public aqx(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, int i, char[] cArr) {
        this.e = i;
        this.d = ekrVar;
        this.c = ekrVar2;
        this.b = ekrVar3;
        this.a = ekrVar4;
    }

    public aqx(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, int i, float[] fArr) {
        this.e = i;
        this.c = ekrVar;
        this.b = ekrVar2;
        this.d = ekrVar3;
        this.a = ekrVar4;
    }

    public aqx(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, int i, int[] iArr) {
        this.e = i;
        this.b = ekrVar;
        this.d = ekrVar2;
        this.a = ekrVar3;
        this.c = ekrVar4;
    }

    public aqx(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = ekrVar;
        this.d = ekrVar2;
        this.c = ekrVar3;
        this.b = ekrVar4;
    }
}
