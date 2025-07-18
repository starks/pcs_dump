package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xh implements wt {
    public static final xg a = new xa();
    public static final xg b = new xb();
    public static final xg c = new xc();
    public static final xg d = new xd();
    public static final xg e = new xe();
    public static final xg f = new wy();
    public float g;
    public float h;
    public boolean i;
    final Object j;
    final xi k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public final ArrayList p;
    public final ArrayList q;
    private long r;

    public xh(xj xjVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = null;
        this.k = new wz(xjVar);
        this.o = 1.0f;
    }

    private static void d(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.wt
    public final void a(long j) {
        long j2 = this.r;
        if (j2 == 0) {
            this.r = j;
            b(this.h);
            return;
        }
        long j3 = j - j2;
        this.r = j;
        float f2 = wx.a().f;
        boolean zC = c(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float fMin = Math.min(this.h, this.m);
        this.h = fMin;
        float fMax = Math.max(fMin, this.n);
        this.h = fMax;
        b(fMax);
        if (zC) {
            this.l = false;
            wx wxVarA = wx.a();
            wxVarA.a.remove(this);
            int iIndexOf = wxVarA.b.indexOf(this);
            if (iIndexOf >= 0) {
                wxVarA.b.set(iIndexOf, null);
                wxVarA.e = true;
            }
            this.r = 0L;
            this.i = false;
            for (int i = 0; i < this.p.size(); i++) {
                if (this.p.get(i) != null) {
                    ((fuu) this.p.get(i)).v(this, this.h, this.g);
                }
            }
            d(this.p);
        }
    }

    final void b(float f2) {
        this.k.b(this.j, f2);
        for (int i = 0; i < this.q.size(); i++) {
            if (this.q.get(i) != null) {
                ((agy) this.q.get(i)).l(this.h);
            }
        }
        d(this.q);
    }

    public abstract boolean c(long j);

    public xh(Object obj, xi xiVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = obj;
        this.k = xiVar;
        float f2 = 0.1f;
        if (xiVar != c && xiVar != d && xiVar != e) {
            if (xiVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (xiVar != a && xiVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
    }
}
