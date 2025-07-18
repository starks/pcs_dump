package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eks {
    private final List a;
    private final List b = ebq.u(0);

    public /* synthetic */ eks(int i) {
        this.a = ebq.u(i);
    }

    public final ekt a() {
        return new ekt(this.a, this.b);
    }

    public final void b(ekr ekrVar) {
        this.a.add(ekrVar);
    }
}
