package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class den extends ddp implements Serializable {
    public static final ddz a = new den(0);
    private static final long serialVersionUID = 0;
    private final int b = 0;

    static {
        int i = ded.b;
    }

    public den(int i) {
    }

    @Override // defpackage.ddz
    public final dea d() {
        return new dem(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof den)) {
            return false;
        }
        int i = ((den) obj).b;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
