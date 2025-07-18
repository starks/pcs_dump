package defpackage;

import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class da extends cz {
    final /* synthetic */ de a;
    private final fcy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(de deVar, fcy fcyVar) {
        super(deVar);
        this.a = deVar;
        this.b = fcyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb A[RETURN] */
    @Override // defpackage.cz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.a():int");
    }

    @Override // defpackage.cz
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.cz
    public final void c() {
        this.a.N();
    }
}
