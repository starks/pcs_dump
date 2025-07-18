package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arp {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler");
    public final cxc b;
    public final Context c;
    public final aqm d;
    public final auh e;
    private final Executor f;

    public arp(aqm aqmVar, Set set, Executor executor, Context context, auh auhVar) {
        Stream map = Collection.EL.stream(set).filter(new ari(0)).map(new alg(3));
        int i = cxc.d;
        this.b = (cxc) map.collect(cvu.a);
        this.d = aqmVar;
        this.f = executor;
        this.c = context;
        this.e = auhVar;
    }

    public static apd a(String str) {
        int iA = arv.a(str);
        if (iA > 0) {
            iA = -iA;
        }
        asr asrVar = (asr) apd.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        apd apdVar = (apd) asrVar.a;
        str.getClass();
        apdVar.b |= 2;
        apdVar.d = str;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        apd apdVar2 = (apd) asrVar.a;
        apdVar2.b |= 4;
        apdVar2.e = iA;
        int i = apc.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        apd apdVar3 = (apd) asrVar.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        apdVar3.k = i2;
        apdVar3.b |= 256;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        apd apdVar4 = (apd) asrVar.a;
        str.getClass();
        apdVar4.b |= 8;
        apdVar4.f = str;
        int i3 = apa.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        apd apdVar5 = (apd) asrVar.a;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        apdVar5.c = i4;
        apdVar5.b |= 1;
        return (apd) asrVar.z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final djy b(Optional optional) {
        return dij.i(dij.j(djr.q(optional.isPresent() ? optional.get() : cnx.C(cyv.a)), new bbk(this, 1), this.f), new arl(this, 0), this.f);
    }
}
