package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cx extends cz {
    public final PowerManager a;
    final /* synthetic */ de b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(de deVar, Context context) {
        super(deVar);
        this.b = deVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.cz
    public final int a() {
        throw null;
    }

    @Override // defpackage.cz
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.cz
    public final void c() {
        this.b.N();
    }
}
