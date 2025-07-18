package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class add {
    public fma a;
    public fhq b;
    public Executor c;
    public Executor d;
    public acs e;
    public final Map f;
    public boolean g;
    public ach h;
    public final ayo i = new ayo();

    public add() {
        new ThreadLocal();
        this.f = new LinkedHashMap();
        this.g = true;
    }

    public abstract acs a();

    public final acs b() {
        acs acsVar = this.e;
        if (acsVar != null) {
            return acsVar;
        }
        fjs.b("internalTracker");
        return null;
    }

    public adf c() {
        throw new ffr(null);
    }

    public final Object d(boolean z, fjc fjcVar, fhk fhkVar) {
        ach achVar = this.h;
        if (achVar == null) {
            fjs.b("connectionManager");
            achVar = null;
        }
        return achVar.b.b(fjcVar, fhkVar);
    }

    public Map e() {
        return fgn.a;
    }

    public Set f() {
        return fgo.a;
    }

    public final fhq g() {
        fma fmaVar = this.a;
        if (fmaVar == null) {
            fjs.b("coroutineScope");
            fmaVar = null;
        }
        return fmaVar.c();
    }

    public final fma h() {
        fma fmaVar = this.a;
        if (fmaVar != null) {
            return fmaVar;
        }
        fjs.b("coroutineScope");
        return null;
    }

    public final boolean i() {
        ach achVar = this.h;
        if (achVar == null) {
            fjs.b("connectionManager");
            achVar = null;
        }
        return achVar.d() != null;
    }

    public final boolean j() {
        ach achVar = this.h;
        if (achVar == null) {
            fjs.b("connectionManager");
            achVar = null;
        }
        afb afbVar = achVar.a;
        if (afbVar != null) {
            return afbVar.i();
        }
        return false;
    }

    public List k() {
        return fgm.a;
    }
}
