package defpackage;

import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avn implements eko {
    private final ekr a;
    private final ekr b;
    private final ekr c;
    private final ekr d;
    private final ekr e;

    public avn(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5) {
        this.a = ekrVar;
        this.b = ekrVar2;
        this.c = ekrVar3;
        this.d = ekrVar4;
        this.e = ekrVar5;
    }

    @Override // defpackage.ffk, defpackage.ffj
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final avm b() {
        return new avm(((ekg) this.a).b(), (NetworkUsageLogDatabase) this.b.b(), (avs) this.c.b(), ((aus) this.d).b(), (Executor) this.e.b());
    }
}
