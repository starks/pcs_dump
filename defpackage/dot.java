package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dot extends dte {
    public final int a;
    public final dos b;

    public dot(int i, dos dosVar) {
        this.a = i;
        this.b = dosVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.b != dos.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dot)) {
            return false;
        }
        dot dotVar = (dot) obj;
        return dotVar.a == this.a && dotVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(dot.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
