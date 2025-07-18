package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auz {
    private int a;
    private aux b;
    private String c;
    private long d;
    private long e;
    private Instant f;
    private long g;
    private ajc h;
    private byte i;
    private int j;

    public auz() {
    }

    public final ava a() {
        if (this.i == 15 && this.b != null && this.c != null && this.j != 0 && this.f != null && this.h != null) {
            return new auv(this.a, this.b, this.c, this.j, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" connectionDetails");
        }
        if (this.c == null) {
            sb.append(" url");
        }
        if (this.j == 0) {
            sb.append(" status");
        }
        if ((this.i & 2) == 0) {
            sb.append(" downloadSize");
        }
        if ((this.i & 4) == 0) {
            sb.append(" uploadSize");
        }
        if (this.f == null) {
            sb.append(" creationTime");
        }
        if ((this.i & 8) == 0) {
            sb.append(" fcRunId");
        }
        if (this.h == null) {
            sb.append(" policyProto");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aux auxVar) {
        if (auxVar == null) {
            throw new NullPointerException("Null connectionDetails");
        }
        this.b = auxVar;
    }

    public final void c(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null creationTime");
        }
        this.f = instant;
    }

    public final void d(long j) {
        this.d = j;
        this.i = (byte) (this.i | 2);
    }

    public final void e(long j) {
        this.g = j;
        this.i = (byte) (this.i | 8);
    }

    public final void f(int i) {
        this.a = i;
        this.i = (byte) (this.i | 1);
    }

    public final void g(ajc ajcVar) {
        if (ajcVar == null) {
            throw new NullPointerException("Null policyProto");
        }
        this.h = ajcVar;
    }

    public final void h(int i) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.j = i;
    }

    public final void i(long j) {
        this.e = j;
        this.i = (byte) (this.i | 4);
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.c = str;
    }

    public auz(ava avaVar) {
        this();
        this.a = avaVar.b();
        this.b = avaVar.g();
        this.c = avaVar.j();
        this.j = avaVar.k();
        this.d = avaVar.c();
        this.e = avaVar.e();
        this.f = avaVar.i();
        this.g = avaVar.d();
        this.h = avaVar.f();
        this.i = (byte) 15;
    }

    public auz(byte[] bArr) {
        this();
    }
}
