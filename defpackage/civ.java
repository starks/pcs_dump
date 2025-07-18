package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class civ {
    public final Uri a;
    public final egi b;
    public final cru c;
    public final cxc d;
    public final boolean e;
    public final clq f;

    public civ() {
    }

    public static ciu a() {
        ciu ciuVar = new ciu(null);
        ciuVar.d = cja.a;
        ciuVar.b();
        ciuVar.b = true;
        ciuVar.c = (byte) (1 | ciuVar.c);
        return ciuVar;
    }

    public final Uri b() {
        return this.a;
    }

    public final cru c() {
        return this.c;
    }

    public final cxc d() {
        return this.d;
    }

    public final egi e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof civ) {
            civ civVar = (civ) obj;
            if (this.a.equals(civVar.b()) && this.b.equals(civVar.e()) && this.c.equals(civVar.c()) && dcr.v(this.d, civVar.d()) && this.f.equals(civVar.g()) && this.e == civVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.e;
    }

    public final clq g() {
        return this.f;
    }

    public final int hashCode() {
        return (((true != this.e ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        clq clqVar = this.f;
        cxc cxcVar = this.d;
        cru cruVar = this.c;
        egi egiVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(egiVar) + ", handler=" + String.valueOf(cruVar) + ", migrations=" + String.valueOf(cxcVar) + ", variantConfig=" + String.valueOf(clqVar) + ", useGeneratedExtensionRegistry=" + this.e + ", enableTracing=false}";
    }

    public civ(Uri uri, egi egiVar, cru cruVar, cxc cxcVar, clq clqVar, boolean z) {
        this();
        this.a = uri;
        this.b = egiVar;
        this.c = cruVar;
        this.d = cxcVar;
        this.f = clqVar;
        this.e = z;
    }
}
