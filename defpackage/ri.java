package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ri {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public rj j;
    public Bundle l;
    public String m;
    final boolean n;
    public final Notification o;

    @Deprecated
    public final ArrayList p;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    final boolean i = true;
    public boolean k = false;

    @Deprecated
    public ri(Context context) {
        Notification notification = new Notification();
        this.o = notification;
        this.a = context;
        this.m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.p = new ArrayList();
        this.n = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Bundle a() {
        if (this.l == null) {
            this.l = new Bundle();
        }
        return this.l;
    }

    public final void c(int i) {
        this.o.icon = i;
    }

    public final void d(rj rjVar) {
        if (this.j != rjVar) {
            this.j = rjVar;
            if (rjVar == null || rjVar.b == this) {
                return;
            }
            rjVar.b = this;
            ri riVar = rjVar.b;
            if (riVar != null) {
                riVar.d(rjVar);
            }
        }
    }
}
