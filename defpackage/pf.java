package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pf {
    public int b;
    public boolean c;
    public final pg d;
    public pf e;
    public pb h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public pf(pg pgVar, int i) {
        this.d = pgVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        pf pfVar;
        if (this.d.ai == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (pfVar = this.e) == null || pfVar.d.ai != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, pz pzVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                qy.y(((pf) it.next()).d, i, arrayList, pzVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        pf pfVar = this.e;
        if (pfVar != null && (hashSet = pfVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pf pfVar = (pf) it.next();
            int i = pfVar.i - 1;
            if ((i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : pfVar.d.L : pfVar.d.K : pfVar.d.N : pfVar.d.M).h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i(pf pfVar, int i, int i2, boolean z) {
        if (pfVar == null) {
            d();
            return;
        }
        this.e = pfVar;
        if (pfVar.a == null) {
            pfVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final void j() {
        pb pbVar = this.h;
        if (pbVar == null) {
            this.h = new pb(1);
        } else {
            pbVar.c();
        }
    }

    public final String toString() {
        return this.d.aj + ":" + qy.B(this.i);
    }
}
