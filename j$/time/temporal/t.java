package j$.time.temporal;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t implements Serializable {
    private static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final TemporalUnit h;
    private static final long serialVersionUID = -1177360819670808121L;
    private final j$.time.d a;
    private final int b;
    private final transient n c = s.d(this);
    private final transient n d = s.f(this);
    private final transient n e;
    private final transient n f;

    static {
        new t(j$.time.d.MONDAY, 4);
        f(j$.time.d.SUNDAY, 1);
        h = h.d;
    }

    private t(j$.time.d dVar, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.e = s.h(this);
        this.f = s.e(this);
        Objects.a(dVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = dVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t f(j$.time.d dVar, int i) {
        String str = dVar.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        t tVar = (t) concurrentHashMap.get(str);
        if (tVar != null) {
            return tVar;
        }
        concurrentHashMap.putIfAbsent(str, new t(dVar, i));
        return (t) concurrentHashMap.get(str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return f(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final n c() {
        return this.c;
    }

    public final j$.time.d d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && hashCode() == obj.hashCode();
    }

    public final n g() {
        return this.f;
    }

    public final n h() {
        return this.d;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final n i() {
        return this.e;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.a) + "," + this.b + "]";
    }
}
