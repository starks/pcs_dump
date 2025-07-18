package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coy implements Handler.Callback {
    final /* synthetic */ brb a;

    public coy(brb brbVar) {
        this.a = brbVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        brb brbVar = this.a;
        brb brbVar2 = (brb) message.obj;
        synchronized (brbVar.a) {
            if (brbVar2 == null) {
                throw null;
            }
        }
        return true;
    }
}
