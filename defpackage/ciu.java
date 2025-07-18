package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciu {
    public cru a;
    public boolean b;
    public byte c;
    public clq d;
    private Uri e;
    private egi f;
    private cxc g;

    public ciu() {
    }

    public final civ a() {
        Uri uri;
        egi egiVar;
        clq clqVar;
        if (this.g == null) {
            int i = cxc.d;
            this.g = cyp.a;
        }
        if (this.c == 3 && (uri = this.e) != null && (egiVar = this.f) != null && (clqVar = this.d) != null) {
            return new civ(uri, egiVar, this.a, this.g, clqVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" uri");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.d == null) {
            sb.append(" variantConfig");
        }
        if ((this.c & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.c = (byte) (this.c | 2);
    }

    public final void c(egi egiVar) {
        if (egiVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = egiVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.e = uri;
    }

    public ciu(byte[] bArr) {
        this();
        this.a = crd.a;
    }
}
