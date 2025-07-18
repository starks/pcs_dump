package defpackage;

import android.app.job.JobService;
import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogTtlService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class avb extends JobService implements ekk {
    private volatile ekd a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ekk
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ekd a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new ekd(this);
                }
            }
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            Object objAS = aS();
            NetworkUsageLogTtlService networkUsageLogTtlService = (NetworkUsageLogTtlService) this;
            networkUsageLogTtlService.c = ann.c();
            networkUsageLogTtlService.d = ((alk) objAS).a.c();
        }
        super.onCreate();
    }
}
