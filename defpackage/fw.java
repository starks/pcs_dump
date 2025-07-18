package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i == 0) {
            if (((fx) this.a).u()) {
                fx fxVar = (fx) this.a;
                if (fxVar.a.p) {
                    return;
                }
                View view = fxVar.c;
                if (view == null || !view.isShown()) {
                    ((fx) this.a).f();
                    return;
                } else {
                    ((fx) this.a).a.s();
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            if (!((ez) this.a).u() || ((ez) this.a).b.size() <= 0 || ((jk) ((cgm) ((ez) this.a).b.get(0)).b).p) {
                return;
            }
            View view2 = ((ez) this.a).d;
            if (view2 == null || !view2.isShown()) {
                ((ez) this.a).f();
                return;
            }
            Iterator it = ((ez) this.a).b.iterator();
            while (it.hasNext()) {
                ((jk) ((cgm) it.next()).b).s();
            }
            return;
        }
        if (i == 2) {
            if (!((hr) this.a).b.u()) {
                ((hr) this.a).b();
            }
            ViewTreeObserver viewTreeObserver = ((hr) this.a).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        hr hrVar = ((ho) this.a).d;
        if (!hrVar.isAttachedToWindow() || !hrVar.getGlobalVisibleRect(((ho) this.a).c)) {
            ((jk) this.a).f();
        } else {
            ((ho) this.a).n();
            super/*jk*/.s();
        }
    }
}
