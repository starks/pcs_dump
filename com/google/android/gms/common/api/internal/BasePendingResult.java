package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.aso;
import defpackage.bjd;
import defpackage.bje;
import defpackage.bjf;
import defpackage.bjh;
import defpackage.bjv;
import defpackage.bjw;
import defpackage.zl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends zl {
    public static final ThreadLocal b = new bjv();
    private final ArrayList a;
    public final Object c;
    public final CountDownLatch d;
    public final AtomicReference e;
    public bjh f;
    public volatile boolean g;
    public boolean h;
    public volatile zl i;
    private Status j;
    private boolean k;

    @Deprecated
    BasePendingResult() {
        super(null, null);
        this.c = new Object();
        this.d = new CountDownLatch(1);
        this.a = new ArrayList();
        this.e = new AtomicReference();
        this.h = false;
        new bjw(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void m(bjh bjhVar) {
        if (bjhVar instanceof bjf) {
            try {
                ((bjf) bjhVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(bjhVar))), e);
            }
        }
    }

    @Override // defpackage.zl
    public final void g(bje bjeVar) {
        aso.z(true, "Callback cannot be null.");
        synchronized (this.c) {
            if (o()) {
                bjeVar.a(this.j);
            } else {
                this.a.add(bjeVar);
            }
        }
    }

    protected abstract bjh j(Status status);

    @Deprecated
    public final void l(Status status) {
        synchronized (this.c) {
            if (!o()) {
                n(j(status));
                this.k = true;
            }
        }
    }

    public final void n(bjh bjhVar) {
        synchronized (this.c) {
            if (this.k) {
                m(bjhVar);
                return;
            }
            o();
            aso.D(!o(), "Results have already been set");
            aso.D(!this.g, "Result has already been consumed");
            this.f = bjhVar;
            this.j = (Status) bjhVar;
            this.d.countDown();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bje) arrayList.get(i)).a(this.j);
            }
            this.a.clear();
        }
    }

    public final boolean o() {
        return this.d.getCount() == 0;
    }

    protected BasePendingResult(bjd bjdVar) {
        super(null, null);
        this.c = new Object();
        this.d = new CountDownLatch(1);
        this.a = new ArrayList();
        this.e = new AtomicReference();
        this.h = false;
        new bjw(bjdVar.a());
        new WeakReference(bjdVar);
    }
}
