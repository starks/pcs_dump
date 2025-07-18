package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqi {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager");
    public final cxg b;
    public final String c;
    public final String d;
    public final int e;
    private final Context h;
    private final auh i;
    private final Map g = new HashMap();
    private final Map f = new HashMap();

    public aqi(Context context, cxg cxgVar, int i, auh auhVar, String str, String str2) {
        this.h = context;
        this.b = cxgVar;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.i = auhVar;
    }

    public final synchronized djy a(String str) {
        dki dkiVar = new dki();
        Intent intent = new Intent();
        intent.setAction((String) this.b.get(str)).setPackage(str);
        aqh aqhVar = new aqh(this, dkiVar, str);
        this.g.put(str, aqhVar);
        if (this.h.bindService(intent, aqhVar, 1)) {
            return dkiVar;
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager", "initialize", 191, "ConnectionManager.java")).p("Failed to bind to service");
        if (this.f.get(str) != null) {
            ((anw) this.f.get(str)).b();
        }
        try {
            this.h.unbindService(aqhVar);
        } catch (Throwable th) {
            ((czl) ((czl) ((czl) a.e()).h(th)).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager", "initialize", (char) 200, "ConnectionManager.java")).p("Unbinding service failed.");
        }
        this.g.put(str, null);
        return cnx.B(new RuntimeException("Failed to bind AiAiFederatedDataService"));
    }

    public final synchronized djy b(String str) {
        Map.EL.putIfAbsent(this.f, str, new anw("IInterface", diy.a));
        return ((anw) this.f.get(str)).a(new cfo(this, str, 1));
    }

    public final void c(atk atkVar) {
        asr asrVar = (asr) atc.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        auh auhVar = this.i;
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
    }

    public final void d(String str, dki dkiVar) {
        synchronized (this) {
            if (!dkiVar.isDone()) {
                dkiVar.e(new RuntimeException(String.format("Failed to bind: %s", str)));
            }
            e(str);
        }
    }

    final synchronized void e(String str) {
        if (this.f.get(str) != null) {
            ((anw) this.f.get(str)).b();
        }
        ServiceConnection serviceConnection = (ServiceConnection) Map.EL.getOrDefault(this.g, str, null);
        if (serviceConnection != null) {
            try {
                this.h.unbindService(serviceConnection);
            } catch (Throwable th) {
                ((czl) ((czl) ((czl) a.e()).h(th)).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager", "resetClient", 'v', "ConnectionManager.java")).p("Unbinding service failed.");
            }
        }
    }

    public final synchronized void f() {
        for (ServiceConnection serviceConnection : this.g.values()) {
            if (serviceConnection != null) {
                try {
                    this.h.unbindService(serviceConnection);
                } catch (Throwable th) {
                    ((czl) ((czl) ((czl) a.e()).h(th)).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager", "unbindService", 'c', "ConnectionManager.java")).p("Unbinding service failed.");
                }
            }
        }
    }
}
