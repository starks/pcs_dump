package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdi implements cdm {
    private final cbu a;
    private final bpz b;
    private final bqm c;
    private final bus d;
    private final ccb e;
    private final long f;
    private final AtomicLong g;
    private final cbp h;

    public cdi(cbu cbuVar, cbx cbxVar, bpz bpzVar, bqm bqmVar, bus busVar, ccb ccbVar, cbp cbpVar) {
        this.a = cbuVar;
        cbxVar.b("TrngConditions");
        this.b = bpzVar;
        this.c = bqmVar;
        this.d = busVar;
        this.e = ccbVar;
        this.h = cbpVar;
        this.f = bpzVar.U();
        this.g = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Set c(defpackage.cck r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdi.c(cck, boolean, java.lang.String):java.util.Set");
    }

    @Override // defpackage.cdm
    public final Set a(cck cckVar, String str) {
        return c(cckVar, true, str);
    }

    @Override // defpackage.cdm
    public final Set b(cck cckVar, String str) {
        return c(cckVar, false, str);
    }
}
