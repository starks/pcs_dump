package defpackage;

import android.os.UserManager;
import com.google.android.apps.miphone.astrea.common.jobs.HeartbeatService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aou implements arq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aou(aor aorVar, aoa aoaVar, int i) {
        this.c = i;
        this.a = aorVar;
        this.b = aoaVar;
    }

    @Override // defpackage.arq
    public final apd a() {
        if (this.c != 0) {
            return arp.a(arv.OPSTATS.jY);
        }
        return arp.a(String.format("%s/%s", ((HeartbeatService) this.b).g.b() ? arv.PLATFORM_LOGGING.jY : arv.PLATFORM_LOGGING_DEV.jY, this.a));
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [aoa, java.lang.Object] */
    @Override // defpackage.arq
    public final boolean b() {
        if (this.c != 0) {
            return ((aor) this.a).b() && ((ang) this.b.b()).g();
        }
        UserManager userManager = (UserManager) ((HeartbeatService) this.b).i.getSystemService(UserManager.class);
        if (userManager != null) {
            int i = sj.a;
            if (userManager.isSystemUser() && ((ard) ((HeartbeatService) this.b).h.b()).b() && ((ard) ((HeartbeatService) this.b).h.b()).a()) {
                return true;
            }
        }
        return false;
    }

    public aou(HeartbeatService heartbeatService, Long l, int i) {
        this.c = i;
        this.a = l;
        this.b = heartbeatService;
    }
}
