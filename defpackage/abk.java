package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abk extends Handler {
    final /* synthetic */ abp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abk(abp abpVar, Looper looper) {
        super(looper);
        this.a = abpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.m();
    }
}
