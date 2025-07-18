package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnp extends dte {
    public final dno a;

    public dnp(dno dnoVar) {
        this.a = dnoVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.a != dno.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dnp) && ((dnp) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(dnp.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
