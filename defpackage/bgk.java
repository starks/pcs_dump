package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgk {
    public final int a;

    public bgk(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("bad alias: %s", objArr));
        }
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgk) && this.a == ((bgk) obj).a;
    }
}
