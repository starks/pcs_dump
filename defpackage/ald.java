package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ald {
    public static int c;
    public Object a;
    public final Object b;

    public ald(all allVar) {
        this.b = allVar;
    }

    public final long a(ps psVar, long j) {
        qa qaVar = psVar.d;
        if (qaVar instanceof pw) {
            return j;
        }
        int size = psVar.j.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            pq pqVar = (pq) psVar.j.get(i);
            if (pqVar instanceof ps) {
                ps psVar2 = (ps) pqVar;
                if (psVar2.d != qaVar) {
                    jMin = Math.min(jMin, a(psVar2, psVar2.e + j));
                }
            }
        }
        if (psVar != qaVar.i) {
            return jMin;
        }
        long jA = j - qaVar.a();
        return Math.min(Math.min(jMin, a(qaVar.h, jA)), jA - qaVar.h.e);
    }

    public final long b(ps psVar, long j) {
        qa qaVar = psVar.d;
        if (qaVar instanceof pw) {
            return j;
        }
        int size = psVar.j.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            pq pqVar = (pq) psVar.j.get(i);
            if (pqVar instanceof ps) {
                ps psVar2 = (ps) pqVar;
                if (psVar2.d != qaVar) {
                    jMax = Math.max(jMax, b(psVar2, psVar2.e + j));
                }
            }
        }
        if (psVar != qaVar.h) {
            return jMax;
        }
        long jA = j + qaVar.a();
        return Math.max(Math.max(jMax, b(qaVar.i, jA)), jA - qaVar.i.e);
    }

    public final ali c() {
        ebq.r(this.a, ekb.class);
        return new ali((all) this.b);
    }

    public ald(qa qaVar) {
        this.a = null;
        this.b = new ArrayList();
        c++;
        this.a = qaVar;
    }
}
