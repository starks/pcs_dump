package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aal extends zi {
    public final int g = 54321;
    public final aas h;
    public aam i;
    private yz j;

    public aal(aas aasVar) {
        this.h = aasVar;
        if (aasVar.i != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        aasVar.i = this;
        aasVar.c = 54321;
    }

    @Override // defpackage.zh
    protected final void e() {
        if (aap.c(2)) {
            toString();
        }
        aas aasVar = this.h;
        aasVar.e = true;
        aasVar.g = false;
        aasVar.f = false;
        aasVar.f();
    }

    @Override // defpackage.zh
    protected final void f() {
        if (aap.c(2)) {
            toString();
        }
        aas aasVar = this.h;
        aasVar.e = false;
        aasVar.g();
    }

    @Override // defpackage.zh
    public final void h(zj zjVar) {
        super.h(zjVar);
        this.j = null;
        this.i = null;
    }

    public final void k() {
        yz yzVar = this.j;
        aam aamVar = this.i;
        if (yzVar == null || aamVar == null) {
            return;
        }
        super.h(aamVar);
        d(yzVar, aamVar);
    }

    public final void l() {
        if (aap.c(3)) {
            toString();
        }
        this.h.i();
        this.h.f = true;
        aam aamVar = this.i;
        if (aamVar != null) {
            h(aamVar);
            if (aamVar.b) {
                if (aap.c(2)) {
                    Objects.toString(aamVar.a);
                }
                bds bdsVar = aamVar.c;
                bdsVar.a.clear();
                bdsVar.a.notifyDataSetChanged();
            }
        }
        aas aasVar = this.h;
        aal aalVar = aasVar.i;
        if (aalVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aalVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        aasVar.i = null;
        aasVar.g = true;
        aasVar.e = false;
        aasVar.f = false;
        aasVar.h = false;
    }

    public final void m(yz yzVar, bds bdsVar) {
        aam aamVar = new aam(this.h, bdsVar);
        d(yzVar, aamVar);
        zj zjVar = this.i;
        if (zjVar != null) {
            h(zjVar);
        }
        this.j = yzVar;
        this.i = aamVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        sb.append(this.h.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.h)));
        sb.append("}}");
        return sb.toString();
    }
}
