package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bst extends BroadcastReceiver {
    final /* synthetic */ bsx a;

    public bst(bsx bsxVar) {
        this.a = bsxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            this.a.b.k(ccj.f);
            this.a.a();
        }
    }
}
