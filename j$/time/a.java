package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class a extends b implements Serializable {
    static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneOffset a;

    static {
        System.currentTimeMillis();
        b = new a(ZoneOffset.UTC);
    }

    a(ZoneOffset zoneOffset) {
        this.a = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.b
    public final long d() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + String.valueOf(this.a) + "]";
    }
}
