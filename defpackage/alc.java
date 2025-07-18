package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alc implements ekr {
    private final ekr a;
    private final /* synthetic */ int b;

    public alc(ekr ekrVar, int i, byte[] bArr) {
        this.b = i;
        ekrVar.getClass();
        this.a = ekrVar;
    }

    public final Optional a() {
        int i = this.b;
        ekr ekrVar = this.a;
        return i != 0 ? Optional.of(ekrVar.b()) : Optional.of(ekrVar);
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }

    public alc(ekr ekrVar, int i) {
        this.b = i;
        ekrVar.getClass();
        this.a = ekrVar;
    }
}
