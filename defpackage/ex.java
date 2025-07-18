package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ex implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ex(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.b != 1) {
            return;
        }
        ((View) this.a).removeOnAttachStateChangeListener(this);
        Object obj = this.a;
        int[] iArr = ut.a;
        ul.b((View) obj);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i == 0) {
            ViewTreeObserver viewTreeObserver = ((ez) this.a).e;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ((ez) this.a).e = view.getViewTreeObserver();
                }
                ez ezVar = (ez) this.a;
                ezVar.e.removeGlobalOnLayoutListener(ezVar.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            ViewTreeObserver viewTreeObserver2 = ((fx) this.a).d;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    ((fx) this.a).d = view.getViewTreeObserver();
                }
                fx fxVar = (fx) this.a;
                fxVar.d.removeGlobalOnLayoutListener(fxVar.b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }
}
