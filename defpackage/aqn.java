package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqn implements eko {
    private final ekr a;
    private final ekr b;
    private final ekr c;

    public aqn(ekr ekrVar, ekr ekrVar2, ekr ekrVar3) {
        this.a = ekrVar;
        this.b = ekrVar2;
        this.c = ekrVar3;
    }

    @Override // defpackage.ffk, defpackage.ffj
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aqm b() {
        Optional optionalA = ((alc) this.a).a();
        return new aqm((Executor) this.c.b(), ((ekg) this.b).b(), optionalA, new wh());
    }
}
