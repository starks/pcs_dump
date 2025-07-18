package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fra {
    public int a;
    public String b;
    public fqn c;
    public frd d;
    public frb e;
    public long f;
    public long g;
    public frs h;
    public fsc i;
    private fqx j;
    private fqv k;
    private frb l;
    private frb m;

    public fra() {
        this.a = -1;
        this.i = new fsc((byte[]) null);
    }

    private static final void g(String str, frb frbVar) {
        if (frbVar != null) {
            if (frbVar.g != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (frbVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (frbVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (frbVar.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }
    }

    public final fra a(frb frbVar) {
        g("cacheResponse", frbVar);
        this.m = frbVar;
        return this;
    }

    public final fra b(fqo fqoVar) {
        this.i = fqoVar.g();
        return this;
    }

    public final fra c(frb frbVar) {
        g("networkResponse", frbVar);
        this.l = frbVar;
        return this;
    }

    public final fra d(fqv fqvVar) {
        fqvVar.getClass();
        this.k = fqvVar;
        return this;
    }

    public final fra e(fqx fqxVar) {
        fqxVar.getClass();
        this.j = fqxVar;
        return this;
    }

    public final frb f() {
        int i = this.a;
        if (i < 0) {
            throw new IllegalStateException(a.x(i, "code < 0: "));
        }
        fqx fqxVar = this.j;
        if (fqxVar == null) {
            throw new IllegalStateException("request == null");
        }
        fqv fqvVar = this.k;
        if (fqvVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.b;
        if (str != null) {
            return new frb(fqxVar, fqvVar, str, i, this.c, this.i.h(), this.d, this.l, this.m, this.e, this.f, this.g, this.h);
        }
        throw new IllegalStateException("message == null");
    }

    public fra(frb frbVar) {
        this.a = -1;
        this.j = frbVar.a;
        this.k = frbVar.b;
        this.a = frbVar.d;
        this.b = frbVar.c;
        this.c = frbVar.e;
        this.i = frbVar.f.g();
        this.d = frbVar.g;
        this.l = frbVar.h;
        this.m = frbVar.i;
        this.e = frbVar.j;
        this.f = frbVar.k;
        this.g = frbVar.l;
        this.h = frbVar.m;
    }
}
