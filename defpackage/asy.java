package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asy implements eko {
    private final ekr a;
    private final ekr b;
    private final ekr c;
    private final ekr d;
    private final ekr e;
    private final ekr f;
    private final /* synthetic */ int g;

    public asy(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5, ekr ekrVar6, int i) {
        this.g = i;
        this.a = ekrVar;
        this.b = ekrVar2;
        this.c = ekrVar3;
        this.d = ekrVar4;
        this.e = ekrVar5;
        this.f = ekrVar6;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        int i = this.g;
        if (i == 0) {
            ekr ekrVar = this.b;
            return new asx(asz.a(), (Executor) ekrVar.b(), ((avn) this.c).b(), ((arg) this.d).a(), (auh) this.e.b(), ann.a());
        }
        if (i != 1) {
            return new bfr(asz.a(), ((avn) this.b).b(), (Executor) this.d.b(), (auh) this.c.b(), ((arg) this.e).a(), ann.a());
        }
        Executor executor = (Executor) this.f.b();
        ekr ekrVar2 = this.e;
        avm avmVarB = ((avn) this.b).b();
        api apiVar = (api) ekrVar2.b();
        auh auhVar = (auh) this.c.b();
        ekr ekrVar3 = this.d;
        aoa aoaVarA = ((arg) this.a).a();
        Context contextB = ((ekg) ekrVar3).b();
        epc epcVar = new epc();
        epcVar.f(eox.c("X-Goog-Api-Key", epc.b), "AIzaSyBQh4wsrcdUrsSFXLvhdQPcIXtnOuAyZoI");
        fbz fbzVar = new fbz("androidattestationvalidation-pa.googleapis.com", 443);
        elx[] elxVarArr = {new fep(epcVar)};
        ((exp) fbzVar.b()).i.addAll(Arrays.asList(elxVarArr));
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        eon eonVarB = fbzVar.b();
        if (executorServiceNewSingleThreadExecutor != null) {
            ((exp) eonVarB).g = new fbg(executorServiceNewSingleThreadExecutor, 1);
        } else {
            ((exp) eonVarB).g = exp.d;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        eon eonVarB2 = fbzVar.b();
        clq.z(true, "idle timeout is %s, but must be positive", 1L);
        if (timeUnit.toDays(1L) >= 30) {
            ((exp) eonVarB2).p = -1L;
        } else {
            ((exp) eonVarB2).p = Math.max(timeUnit.toMillis(1L), exp.c);
        }
        return new anj(executor, fbzVar.a(), avmVarB, apiVar, auhVar, ((ang) aoaVarA.b()).e(), contextB);
    }

    public asy(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5, ekr ekrVar6, int i, byte[] bArr) {
        this.g = i;
        this.f = ekrVar;
        this.b = ekrVar2;
        this.e = ekrVar3;
        this.c = ekrVar4;
        this.a = ekrVar5;
        this.d = ekrVar6;
    }

    public asy(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5, ekr ekrVar6, int i, char[] cArr) {
        this.g = i;
        this.a = ekrVar;
        this.b = ekrVar2;
        this.d = ekrVar3;
        this.c = ekrVar4;
        this.e = ekrVar5;
        this.f = ekrVar6;
    }
}
