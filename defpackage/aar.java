package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aar extends aas {
    public volatile aaq a;
    public volatile aaq b;
    private Executor j;
    private List k;

    public aar(Context context) {
        super(context);
    }

    final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.j == null) {
            this.j = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        aaq aaqVar = this.a;
        Executor executor = this.j;
        if (aaqVar.f == 1) {
            aaqVar.f = 2;
            executor.execute(aaqVar.c);
            return;
        }
        int i = aaqVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @Override // defpackage.aas
    protected final void b() {
        i();
        this.a = new aaq(this);
        a();
    }

    public final /* bridge */ /* synthetic */ Object c() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = bfe.d(this.d.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            clq.G(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n".concat(String.valueOf(str)));
            arrayList.add(new bdp(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d(List list) {
        this.k = list;
        aal aalVar = this.i;
        if (aalVar != null) {
            if (aap.c(2)) {
                Objects.toString(aalVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aalVar.i(list);
                return;
            }
            if (aap.c(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            aalVar.g(list);
        }
    }

    @Override // defpackage.aas
    public final void f() {
        List list = this.k;
        if (list != null) {
            d(list);
        } else {
            b();
        }
    }

    @Override // defpackage.aas
    public final void g() {
        i();
    }

    final void h(aaq aaqVar) {
        if (this.b == aaqVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.aas
    public final void i() {
        if (this.a != null) {
            if (!this.e) {
                this.h = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                aaq aaqVar = this.a;
                aaqVar.d.set(true);
                if (aaqVar.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }

    public aar(Context context, byte[] bArr) {
        this(context.getApplicationContext());
    }
}
