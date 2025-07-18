package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhr extends bya {
    final /* synthetic */ bhs a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhr(bhs bhsVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = bhsVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        int iD = this.a.d(this.b);
        AtomicBoolean atomicBoolean = bio.d;
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            bhs bhsVar = this.a;
            Context context = this.b;
            bhsVar.c(context, iD, bhsVar.b(context, iD, "n"));
        }
    }
}
