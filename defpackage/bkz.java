package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkz extends bya {
    final /* synthetic */ blg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkz(blg blgVar, Looper looper) {
        super(looper);
        this.a = blgVar;
    }

    private static final void a(Message message) {
        bla blaVar = (bla) message.obj;
        blaVar.b();
        blaVar.f();
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [bjx, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        if (this.a.n.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.l()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            this.a.k = new bho(message.arg2);
            blg blgVar = this.a;
            if (!blgVar.l && !TextUtils.isEmpty(blgVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(blgVar.c());
                    blg blgVar2 = this.a;
                    if (!blgVar2.l) {
                        blgVar2.I(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            bho bhoVar = this.a.k;
            if (bhoVar == null) {
                bhoVar = new bho(8);
            }
            this.a.g.a(bhoVar);
            blg.F(bhoVar);
            return;
        }
        if (message.what == 5) {
            bho bhoVar2 = this.a.k;
            if (bhoVar2 == null) {
                bhoVar2 = new bho(8);
            }
            this.a.g.a(bhoVar2);
            blg.F(bhoVar2);
            return;
        }
        if (message.what == 3) {
            bho bhoVar3 = new bho(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            this.a.g.a(bhoVar3);
            blg.F(bhoVar3);
            return;
        }
        if (message.what == 6) {
            this.a.I(5, null);
            fuu fuuVar = this.a.r;
            if (fuuVar != null) {
                fuuVar.a.a(message.arg2);
            }
            int i = message.arg2;
            System.currentTimeMillis();
            this.a.A(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.k()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        bla blaVar = (bla) message.obj;
        synchronized (blaVar) {
            obj = blaVar.d;
            if (blaVar.e) {
                Log.w("GmsClient", a.G(blaVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            blaVar.d();
        }
        synchronized (blaVar) {
            blaVar.e = true;
        }
        blaVar.f();
    }
}
