package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arh implements arq {
    final /* synthetic */ aor a;
    final /* synthetic */ Context b;
    final /* synthetic */ aoa c;

    public arh(aor aorVar, Context context, aoa aoaVar) {
        this.a = aorVar;
        this.b = context;
        this.c = aoaVar;
    }

    @Override // defpackage.arq
    public final apd a() {
        return arp.a(this.a.b() ? arv.PLATFORM_LOGGING.jY : arv.PLATFORM_LOGGING_DEV.jY);
    }

    @Override // defpackage.arq
    public final boolean b() {
        UserManager userManager = (UserManager) this.b.getSystemService(UserManager.class);
        int i = sj.a;
        return userManager.isSystemUser() && ((ard) this.c.b()).b() && !((ard) this.c.b()).a();
    }
}
