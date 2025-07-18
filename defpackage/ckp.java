package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckp implements Runnable {
    public final Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ckp(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fd fdVar;
        int i = this.c;
        if (i == 0) {
            ws wsVar = ((SwipeDismissBehavior) this.b).a;
            if (wsVar == null || !wsVar.l()) {
                return;
            }
            ((View) this.a).postOnAnimation(this);
            return;
        }
        if (i != 1) {
            ezv ezvVar = (ezv) this.b;
            ezt eztVarA = ezvVar.a(ezvVar.r.e, false);
            if (eztVarA == null) {
                return;
            }
            ((ezv) this.b).g.execute(new euy(this, eztVarA, 9));
            return;
        }
        ff ffVar = ((gl) this.b).c;
        if (ffVar != null && (fdVar = ffVar.b) != null) {
            fdVar.F(ffVar);
        }
        View view = (View) ((gl) this.b).h;
        if (view != null && view.getWindowToken() != null && ((fp) this.a).h()) {
            ((gl) this.b).k = (gk) this.a;
        }
        ((gl) this.b).m = null;
    }
}
