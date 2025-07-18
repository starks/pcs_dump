package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkb implements bjb, bjc {
    public final biw b;
    public final bjr c;
    public final int e;
    public boolean f;
    public final /* synthetic */ bkf h;
    private final bkt j;
    private final bnz l;
    public final Queue a = new LinkedList();
    private final Set i = new HashSet();
    public final Map d = new HashMap();
    public final List g = new ArrayList();
    private bho k = null;

    /* JADX WARN: Multi-variable type inference failed */
    public bkb(bkf bkfVar, biz bizVar) {
        this.h = bkfVar;
        Looper looper = bkfVar.n.getLooper();
        blh blhVarG = bizVar.g().g();
        biw biwVarE = ((yt) bizVar.k.c).e(bizVar.b, looper, blhVarG, bizVar.d, this, this);
        brb brbVar = bizVar.j;
        if (brbVar != null) {
            ((blg) biwVarE).p = brbVar;
        } else {
            String str = bizVar.c;
            if (str != null) {
                ((blg) biwVarE).j = str;
            }
        }
        this.b = biwVarE;
        this.c = bizVar.e;
        this.l = new bnz();
        this.e = bizVar.g;
        if (biwVarE.m()) {
            this.j = new bkt(bkfVar.h, bkfVar.n, bizVar.g().g());
        } else {
            this.j = null;
        }
    }

    private final bhq q(bhq[] bhqVarArr) {
        if (bhqVarArr != null) {
            bhq[] bhqVarArrN = this.b.n();
            if (bhqVarArrN == null) {
                bhqVarArrN = new bhq[0];
            }
            nv nvVar = new nv(bhqVarArrN.length);
            for (bhq bhqVar : bhqVarArrN) {
                nvVar.put(bhqVar.a, Long.valueOf(bhqVar.a()));
            }
            for (int i = 0; i <= 0; i++) {
                bhq bhqVar2 = bhqVarArr[i];
                Long l = (Long) nvVar.get(bhqVar2.a);
                if (l == null || l.longValue() < bhqVar2.a()) {
                    return bhqVar2;
                }
            }
        }
        return null;
    }

    private final Status r(bho bhoVar) {
        return bkf.a(this.c, bhoVar);
    }

    private final void s(bho bhoVar) {
        Iterator it = this.i.iterator();
        if (!it.hasNext()) {
            this.i.clear();
            return;
        }
        if (a.g(bhoVar, bho.a)) {
            this.b.o();
        }
        throw null;
    }

    private final void t(Status status, Exception exc, boolean z) {
        aso.A(this.h.n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            bjq bjqVar = (bjq) it.next();
            if (!z || bjqVar.c == 2) {
                if (status != null) {
                    bjqVar.d(status);
                } else {
                    bjqVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void u() {
        this.h.n.removeMessages(12, this.c);
        Handler handler = this.h.n;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), this.h.f);
    }

    private final void v(bjq bjqVar) {
        bjqVar.g(this.l, o());
        try {
            bjqVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.i("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean w(bjq bjqVar) throws Resources.NotFoundException {
        if (!(bjqVar instanceof bjk)) {
            v(bjqVar);
            return true;
        }
        bjk bjkVar = (bjk) bjqVar;
        bhq bhqVarQ = q(bjkVar.b(this));
        if (bhqVarQ == null) {
            v(bjqVar);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + bhqVarQ.a + ", " + bhqVarQ.a() + ").");
        if (!this.h.o || !bjkVar.a(this)) {
            bjkVar.e(new bjj(bhqVarQ));
            return true;
        }
        bkc bkcVar = new bkc(this.c, bhqVarQ);
        int iIndexOf = this.g.indexOf(bkcVar);
        if (iIndexOf >= 0) {
            bkc bkcVar2 = (bkc) this.g.get(iIndexOf);
            this.h.n.removeMessages(15, bkcVar2);
            Handler handler = this.h.n;
            handler.sendMessageDelayed(Message.obtain(handler, 15, bkcVar2), 5000L);
            return false;
        }
        this.g.add(bkcVar);
        Handler handler2 = this.h.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, bkcVar), 5000L);
        Handler handler3 = this.h.n;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, bkcVar), 120000L);
        bho bhoVar = new bho(2, null);
        x();
        this.h.d(bhoVar, this.e);
        return false;
    }

    private final boolean x() {
        synchronized (bkf.c) {
        }
        return false;
    }

    @Override // defpackage.bjx
    public final void a(int i) {
        if (Looper.myLooper() == this.h.n.getLooper()) {
            k(i);
            return;
        }
        bkf bkfVar = this.h;
        bkfVar.n.post(new sp(this, i, 2, null));
    }

    @Override // defpackage.bjx
    public final void b() {
        if (Looper.myLooper() == this.h.n.getLooper()) {
            h();
            return;
        }
        bkf bkfVar = this.h;
        bkfVar.n.post(new ls(this, 20, null));
    }

    public final void c() {
        aso.A(this.h.n);
        this.k = null;
    }

    public final void d() {
        int i;
        int iE;
        aso.A(this.h.n);
        if (this.b.k() || this.b.l()) {
            return;
        }
        try {
            bkf bkfVar = this.h;
            fpf fpfVar = bkfVar.q;
            Context context = bkfVar.h;
            biw biwVar = this.b;
            aso.F(context);
            aso.F(biwVar);
            biwVar.p();
            int iA = biwVar.a();
            int i2 = fpfVar.i(iA);
            if (i2 == -1) {
                synchronized (fpfVar.b) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= ((SparseIntArray) fpfVar.b).size()) {
                            i = -1;
                            break;
                        }
                        int iKeyAt = ((SparseIntArray) fpfVar.b).keyAt(i3);
                        if (iKeyAt > iA && ((SparseIntArray) fpfVar.b).get(iKeyAt) == 0) {
                            i = 0;
                            break;
                        }
                        i3++;
                    }
                    iE = i == -1 ? ((bht) fpfVar.a).e(context, iA) : i;
                    ((SparseIntArray) fpfVar.b).put(iA, iE);
                }
                i2 = iE;
            }
            if (i2 != 0) {
                bho bhoVar = new bho(i2, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + bhoVar.toString());
                i(bhoVar);
                return;
            }
            bkf bkfVar2 = this.h;
            biw biwVar2 = this.b;
            bke bkeVar = new bke(bkfVar2, biwVar2, this.c);
            if (biwVar2.m()) {
                bkt bktVar = this.j;
                aso.F(bktVar);
                bzt bztVar = bktVar.e;
                if (bztVar != null) {
                    bztVar.x();
                }
                bktVar.d.g = Integer.valueOf(System.identityHashCode(bktVar));
                yt ytVar = bktVar.g;
                Context context2 = bktVar.a;
                Handler handler = bktVar.b;
                blh blhVar = bktVar.d;
                bktVar.e = (bzt) ytVar.e(context2, handler.getLooper(), blhVar, blhVar.f, bktVar, bktVar);
                bktVar.f = bkeVar;
                Set set = bktVar.c;
                if (set == null || set.isEmpty()) {
                    bktVar.b.post(new bks(bktVar, 0));
                } else {
                    bktVar.e.G();
                }
            }
            try {
                this.b.h(bkeVar);
            } catch (SecurityException e) {
                j(new bho(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new bho(10), e2);
        }
    }

    public final void e(bjq bjqVar) {
        aso.A(this.h.n);
        if (this.b.k()) {
            if (w(bjqVar)) {
                u();
                return;
            } else {
                this.a.add(bjqVar);
                return;
            }
        }
        this.a.add(bjqVar);
        bho bhoVar = this.k;
        if (bhoVar == null || !bhoVar.b()) {
            d();
        } else {
            i(this.k);
        }
    }

    public final void f(Status status) {
        aso.A(this.h.n);
        t(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjq bjqVar = (bjq) arrayList.get(i);
            if (!this.b.k()) {
                return;
            }
            if (w(bjqVar)) {
                this.a.remove(bjqVar);
            }
        }
    }

    public final void h() {
        c();
        s(bho.a);
        n();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            fcy fcyVar = (fcy) it.next();
            if (q(((bko) fcyVar.c).b) != null) {
                it.remove();
            } else {
                try {
                    ((bko) fcyVar.c).b(this.b, new brb((byte[]) null, (char[]) null, (byte[]) null));
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.i("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        u();
    }

    @Override // defpackage.bkn
    public final void i(bho bhoVar) {
        j(bhoVar, null);
    }

    public final void j(bho bhoVar, Exception exc) {
        bzt bztVar;
        aso.A(this.h.n);
        bkt bktVar = this.j;
        if (bktVar != null && (bztVar = bktVar.e) != null) {
            bztVar.x();
        }
        c();
        this.h.q.h();
        s(bhoVar);
        if ((this.b instanceof bmy) && bhoVar.c != 24) {
            bkf bkfVar = this.h;
            bkfVar.g = true;
            Handler handler = bkfVar.n;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = bhoVar.c;
        if (i == 4) {
            f(bkf.b);
            return;
        }
        if (i == 25) {
            f(r(bhoVar));
            return;
        }
        if (this.a.isEmpty()) {
            this.k = bhoVar;
            return;
        }
        if (exc != null) {
            aso.A(this.h.n);
            t(null, exc, false);
            return;
        }
        if (!this.h.o) {
            f(r(bhoVar));
            return;
        }
        t(r(bhoVar), null, true);
        if (this.a.isEmpty()) {
            return;
        }
        x();
        if (this.h.d(bhoVar, this.e)) {
            return;
        }
        if (bhoVar.c == 18) {
            this.f = true;
        }
        if (!this.f) {
            f(r(bhoVar));
            return;
        }
        bkf bkfVar2 = this.h;
        bjr bjrVar = this.c;
        Handler handler2 = bkfVar2.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 9, bjrVar), 5000L);
    }

    public final void k(int i) {
        c();
        this.f = true;
        String strF = this.b.f();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strF != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strF);
        }
        this.l.b(true, new Status(20, sb.toString()));
        bkf bkfVar = this.h;
        bjr bjrVar = this.c;
        Handler handler = bkfVar.n;
        handler.sendMessageDelayed(Message.obtain(handler, 9, bjrVar), 5000L);
        bkf bkfVar2 = this.h;
        bjr bjrVar2 = this.c;
        Handler handler2 = bkfVar2.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, bjrVar2), 120000L);
        this.h.q.h();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Object obj = ((fcy) it.next()).b;
        }
    }

    public final void l(bho bhoVar) {
        aso.A(this.h.n);
        biw biwVar = this.b;
        biwVar.i("onSignInFailed for " + biwVar.getClass().getName() + " with " + String.valueOf(bhoVar));
        i(bhoVar);
    }

    public final void m() {
        aso.A(this.h.n);
        f(bkf.a);
        this.l.b(false, bkf.a);
        for (bkk bkkVar : (bkk[]) this.d.keySet().toArray(new bkk[0])) {
            e(new bjp(bkkVar, new brb((byte[]) null, (char[]) null, (byte[]) null)));
        }
        s(new bho(4));
        if (this.b.k()) {
            this.b.q(new fuu(this, null));
        }
    }

    public final void n() {
        if (this.f) {
            bkf bkfVar = this.h;
            bkfVar.n.removeMessages(11, this.c);
            bkf bkfVar2 = this.h;
            bkfVar2.n.removeMessages(9, this.c);
            this.f = false;
        }
    }

    public final boolean o() {
        return this.b.m();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    public final void p(boolean z) {
        aso.A(this.h.n);
        if (this.b.k() && this.d.isEmpty()) {
            bnz bnzVar = this.l;
            if (bnzVar.b.isEmpty() && bnzVar.a.isEmpty()) {
                this.b.i("Timing out service connection.");
            } else {
                u();
            }
        }
    }
}
