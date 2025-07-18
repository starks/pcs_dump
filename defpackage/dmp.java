package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmp extends dte {
    public final dmo a;

    public dmp(dmo dmoVar) {
        this.a = dmoVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.a != dmo.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dmp) && ((dmp) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(dmp.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
