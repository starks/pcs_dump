package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rh extends rj {
    public CharSequence a;

    @Override // defpackage.rj
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.rj
    public final void b(fcy fcyVar) {
        new Notification.BigTextStyle((Notification.Builder) fcyVar.c).setBigContentTitle(null).bigText(this.a);
    }
}
