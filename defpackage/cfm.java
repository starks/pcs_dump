package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfm implements Comparable {
    public final long a;
    public final String b;
    final int c;
    final long d;
    final Object e;
    private final RuntimeException f;

    public cfm(long j, String str, int i, long j2, Object obj) {
        clq.v(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        if (i != 5) {
            this.f = null;
            return;
        }
        if (obj == null) {
            this.f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof eea)) {
            this.f = null;
        } else {
            this.f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
    }

    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return Long.valueOf(this.d);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(this.d));
        }
        if (i == 4) {
            Object obj = this.e;
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        Object obj2 = this.e;
        obj2.getClass();
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((eea) obj2).x();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    public final String b() {
        String str = this.b;
        return str != null ? str : Long.toString(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cfm cfmVar = (cfm) obj;
        int iCompare = Long.compare(this.a, cfmVar.a);
        if (iCompare != 0) {
            return iCompare;
        }
        if (this.a != 0) {
            return 0;
        }
        String str = this.b;
        str.getClass();
        String str2 = cfmVar.b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfm)) {
            return false;
        }
        cfm cfmVar = (cfm) obj;
        return this.a == cfmVar.a && Objects.equals(this.b, cfmVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return b() + ":" + String.valueOf(a());
    }
}
