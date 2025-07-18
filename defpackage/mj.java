package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mj extends fjr implements fin {
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(Object obj, int i) {
        super(0, obj, mk.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V");
        this.e = i;
    }

    @Override // defpackage.fin
    public final /* synthetic */ Object a() {
        int i = this.e;
        if (i == 0) {
            ((mk) this.b).d();
            return ffz.a;
        }
        if (i == 1) {
            ((mk) this.b).d();
            return ffz.a;
        }
        add addVar = (add) this.b;
        fma fmaVar = addVar.a;
        ach achVar = null;
        if (fmaVar == null) {
            fjs.b("coroutineScope");
            fmaVar = null;
        }
        fna fnaVar = (fna) fmaVar.c().get(fna.c);
        if (fnaVar == null) {
            Objects.toString(fmaVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(fmaVar)));
        }
        fnaVar.o(null);
        wh whVar = addVar.b().h;
        ach achVar2 = addVar.h;
        if (achVar2 == null) {
            fjs.b("connectionManager");
        } else {
            achVar = achVar2;
        }
        achVar.b.a();
        return ffz.a;
    }
}
