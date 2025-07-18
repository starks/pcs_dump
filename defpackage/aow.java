package defpackage;

import android.app.job.JobService;
import android.content.Context;
import com.google.android.apps.miphone.astrea.common.jobs.HeartbeatService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aow extends JobService implements ekk {
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
            HeartbeatService heartbeatService = (HeartbeatService) this;
            alk alkVar = (alk) aS();
            heartbeatService.c = (arp) alkVar.a.E.b();
            heartbeatService.j = (auh) alkVar.a.i.b();
            heartbeatService.d = alkVar.a.a();
            heartbeatService.e = (Executor) alkVar.a.y.b();
            heartbeatService.f = (arc) alkVar.a.L.b();
            heartbeatService.g = ann.a();
            heartbeatService.h = alkVar.a.b();
            heartbeatService.i = (Context) alkVar.a.a.a;
        }
        super.onCreate();
    }
}
