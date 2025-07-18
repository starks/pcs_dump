package com.google.android.apps.miphone.astrea;

import android.content.Context;
import defpackage.alf;
import defpackage.alg;
import defpackage.ani;
import defpackage.czl;
import defpackage.czn;
import defpackage.dcg;
import defpackage.dcm;
import defpackage.dcn;
import defpackage.dco;
import defpackage.dcq;
import defpackage.dct;
import defpackage.ekb;
import j$.util.Collection;
import j$.util.Comparator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PrivateComputeServicesApplication extends alf {
    private static final czn c = czn.j("com/google/android/apps/miphone/astrea/PrivateComputeServicesApplication");
    private static final AtomicBoolean d = new AtomicBoolean();
    public Context a;
    public Set b;

    @Override // defpackage.alf, android.app.Application
    public final void onCreate() {
        super.onCreate();
        if (!d.getAndSet(true)) {
            ekb ekbVar = new ekb((byte[]) null);
            dco dcoVar = dcq.c;
            String str = dcoVar.a;
            ekbVar.a = new dco(false, dcoVar.c, dcoVar.d, dcoVar.e, dcoVar.f);
            if (!dcg.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
            Object obj = ekbVar.a;
            if (obj == null) {
                obj = dcq.c;
            }
            AtomicReference atomicReference = dcm.d;
            while (!atomicReference.compareAndSet(null, obj)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
            }
            dcm.e();
            dcn.a.b.set(dct.a);
        }
        ((czl) ((czl) c.c()).i("com/google/android/apps/miphone/astrea/PrivateComputeServicesApplication", "onCreate", 33, "PrivateComputeServicesApplication.java")).p("PrivateComputeServicesApplication#onCreate");
        Collection.EL.stream(this.b).sorted(Comparator.EL.reversed(Comparator.CC.comparing(new alg(0)))).forEach(new ani(1));
    }
}
