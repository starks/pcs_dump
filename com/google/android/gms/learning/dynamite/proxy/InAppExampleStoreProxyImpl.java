package com.google.android.gms.learning.dynamite.proxy;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.asr;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bpz;
import defpackage.bqk;
import defpackage.bqm;
import defpackage.brg;
import defpackage.brt;
import defpackage.bsc;
import defpackage.bum;
import defpackage.buo;
import defpackage.cbq;
import defpackage.ccd;
import defpackage.ccj;
import defpackage.ceu;
import defpackage.crc;
import defpackage.csm;
import defpackage.dfa;
import defpackage.dfc;
import defpackage.dfe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppExampleStoreProxyImpl extends buo {
    public Context a;
    public bum b;
    public bqm e;
    public csm f;
    public boolean g;
    private cbq h;
    private bpz i;
    public final Object c = new Object();
    public final List d = new ArrayList();
    private final IBinder j = new bsc(this);

    private final void b(int i, String str) {
        bqm bqmVar = this.e;
        asr asrVar = (asr) dfa.a.createBuilder();
        asr asrVar2 = (asr) dfc.a.createBuilder();
        asr asrVar3 = (asr) dfe.a.createBuilder();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        dfe dfeVar = (dfe) asrVar3.a;
        str.getClass();
        dfeVar.b |= 1;
        dfeVar.c = str;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dfc dfcVar = (dfc) asrVar2.a;
        dfe dfeVar2 = (dfe) asrVar3.z();
        dfeVar2.getClass();
        dfcVar.c = dfeVar2;
        dfcVar.b |= 1;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dfa dfaVar = (dfa) asrVar.a;
        dfc dfcVar2 = (dfc) asrVar2.z();
        dfcVar2.getClass();
        dfaVar.g = dfcVar2;
        dfaVar.b |= 4096;
        this.e.f(bqk.EXAMPLE_STORE_ERROR_COUNT, bqmVar.c((dfa) asrVar.z()), ccj.a(i));
        this.e.d();
    }

    public final void a(int i, String str) {
        this.e.k(i);
        if (this.i.be()) {
            b(i, str);
        }
    }

    @Override // defpackage.bup
    public void init(bpf bpfVar, bum bumVar) {
        Context context = (Context) bpe.a(bpfVar);
        this.a = context;
        this.b = bumVar;
        ceu.f(context);
        brg.b();
        cbq cbqVarB = cbq.b(this.a.getApplicationContext());
        this.h = cbqVarB;
        this.e = (bqm) cbqVarB.c(bqm.class);
        this.i = (bpz) this.h.c(bpz.class);
        this.f = crc.a;
        this.g = this.i.bl();
    }

    @Override // defpackage.bup
    public IBinder onBind(Intent intent) {
        return this.j;
    }

    @Override // defpackage.bup
    public void onDestroy() {
        synchronized (this.c) {
            if (!this.d.isEmpty()) {
                Log.w("brella.InAppExStPrxImpl", this.d.size() + " orphaned iterators, cleaning them up");
                this.e.k(ccj.bN);
                if (this.i.be()) {
                    Iterator it = this.d.iterator();
                    while (it.hasNext()) {
                        b(ccj.bN, ((brt) it.next()).a);
                    }
                }
            }
            while (!this.d.isEmpty()) {
                ((brt) this.d.get(0)).c();
            }
        }
        this.e.h(ccd.IN_APP_EXAMPLE_STORE_PROXY_DESTROY);
        cbq cbqVar = this.h;
        if (cbqVar != null) {
            cbqVar.close();
            this.h = null;
        }
    }

    @Override // defpackage.bup
    public boolean onUnbind(Intent intent) {
        return false;
    }

    @Override // defpackage.bup
    public void onRebind(Intent intent) {
    }

    @Override // defpackage.bup
    public void onTrimMemory(int i) {
    }
}
