package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnw extends fnk implements fmh {
    private final Handler c;
    private final String d;
    private final boolean e;
    private final fnw f;

    public fnw(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // defpackage.flx
    public final void d(fhq fhqVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        fme.e(fhqVar, new CancellationException(a.y(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        flx flxVar = fml.a;
        fpm.c.d(fhqVar, runnable);
    }

    @Override // defpackage.flx
    public final boolean e() {
        if (this.e) {
            return !fjs.c(Looper.myLooper(), this.c.getLooper());
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fnw)) {
            return false;
        }
        fnw fnwVar = (fnw) obj;
        return fnwVar.c == this.c && fnwVar.e == this.e;
    }

    @Override // defpackage.fnk
    public final /* synthetic */ fnk g() {
        return this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (true != this.e ? 1237 : 1231);
    }

    @Override // defpackage.fnk, defpackage.flx
    public final String toString() {
        String strC = c();
        if (strC == null) {
            strC = this.d;
            if (strC == null) {
                strC = this.c.toString();
            }
            if (this.e) {
                return String.valueOf(strC).concat(".immediate");
            }
        }
        return strC;
    }

    public /* synthetic */ fnw(Handler handler) {
        this(handler, null);
    }

    private fnw(Handler handler, String str, boolean z) {
        this();
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new fnw(handler, str, true);
    }

    public fnw() {
    }
}
