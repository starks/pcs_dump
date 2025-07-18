package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbb {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/pd/networkusage/impl/PDNetworkUsageLogHelperImpl");
    private final avm b;

    public bbb(avm avmVar) {
        this.b = avmVar;
    }

    public final void a(String str) throws avo {
        if (this.b.i(auw.PD, str)) {
            throw avo.a("PD-".concat(String.valueOf(str)));
        }
    }

    public final void b(String str, int i, int i2) {
        if (!this.b.h(auw.PD, str) || this.b.a().isEmpty()) {
            return;
        }
        Optional optionalG = ((avs) this.b.a().get()).g(str);
        if (optionalG.isEmpty()) {
            ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/pd/networkusage/impl/PDNetworkUsageLogHelperImpl", "logDownloadIfNeeded", 54, "PDNetworkUsageLogHelperImpl.java")).r("Unknown clientId '%s' for logging AP network usage", str);
            return;
        }
        avm avmVar = this.b;
        long j = i2;
        aux auxVar = (aux) optionalG.get();
        clq.v(auxVar.b() == auw.PD);
        clq.v(auxVar.a().b == 4);
        auj aujVarA = auxVar.a();
        clq.v(str.matches((aujVarA.b == 4 ? (aun) aujVarA.c : aun.a).c));
        avmVar.d(ayg.f(auxVar, i, j).a());
    }
}
