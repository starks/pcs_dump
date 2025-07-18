package defpackage;

import android.content.Context;
import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogDatabase;
import com.google.android.as.oss.R;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avm {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogRepositoryImpl");
    public final NetworkUsageLogDatabase b;
    public final avs c;
    private final Context d;
    private final aoa e;
    private final Executor f;

    public avm(Context context, NetworkUsageLogDatabase networkUsageLogDatabase, avs avsVar, aoa aoaVar, Executor executor) {
        this.d = context;
        this.b = networkUsageLogDatabase;
        this.c = avsVar;
        this.e = aoaVar;
        this.f = executor;
    }

    public final Optional a() {
        return Optional.of(this.c);
    }

    public final Optional b() {
        return Optional.of(this.f);
    }

    public final void c(Instant instant, djj djjVar) {
        cnx.J(un.w(((ave) this.b.l()).a, new ada(instant, 3)), djjVar, this.f);
    }

    public final void d(final ava avaVar) {
        aqp aqpVar = new aqp(this, avaVar, 2);
        if (f()) {
            NetworkUsageLogDatabase networkUsageLogDatabase = this.b;
            ((czl) ((czl) NetworkUsageLogDatabase.j.c()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogDatabase", "insertNetworkUsageEntity", 35, "NetworkUsageLogDatabase.java")).r("Inserting new NetworkUsageEntity of type %s", avaVar.c.b());
            final ave aveVar = (ave) networkUsageLogDatabase.l();
            cnx.J(dij.i(dhq.i(djr.q(un.w(aveVar.a, new fiy() { // from class: avd
                @Override // defpackage.fiy
                public final Object a(Object obj) throws Exception {
                    long j;
                    ady adyVar = (ady) obj;
                    adyVar.getClass();
                    afa afaVarB = adyVar.b(fuu.z());
                    try {
                        fuu.y(afaVarB, avaVar);
                        afaVarB.k();
                        fjp.w(afaVarB, null);
                        if (uo.k(adyVar) == 0) {
                            j = -1;
                        } else {
                            afaVarB = adyVar.b("SELECT last_insert_rowid()");
                            try {
                                afaVarB.k();
                                long jB = afaVarB.b(0);
                                fjp.w(afaVarB, null);
                                j = jB;
                            } finally {
                            }
                        }
                        return Long.valueOf(j);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            })), Throwable.class, new avf(1), diy.a), new avf(0), diy.a), aqpVar, this.f);
        }
    }

    public final boolean e(auw auwVar, String str) {
        switch (auwVar.ordinal()) {
            case 1:
                return true;
            case 2:
            case 3:
                return this.c.c(str).isPresent();
            case 4:
                return this.c.e(str).isPresent();
            case 5:
                return this.c.h(str).isPresent();
            case 6:
                return this.c.g(str).isPresent();
            case 7:
                return this.c.a(str).isPresent();
            case 8:
                return this.c.f(str).isPresent();
            case 9:
                return this.c.i(str).isPresent();
            default:
                return false;
        }
    }

    public final boolean f() {
        return ((aur) this.e.b()).a() && g();
    }

    public final boolean g() {
        Context context = this.d;
        return abx.c(context).getBoolean(context.getString(R.string.pref_network_usage_log_enabled_key), context.getResources().getBoolean(R.bool.pref_network_usage_log_enabled_default));
    }

    public final boolean h(auw auwVar, String str) {
        return f() && e(auwVar, str);
    }

    public final boolean i(auw auwVar, String str) {
        return ((aur) this.e.b()).b() && !e(auwVar, str);
    }
}
