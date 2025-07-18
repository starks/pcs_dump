package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ckc extends qy {
    private ckd a;
    private int b;

    public ckc() {
        this.b = 0;
    }

    public final int W() {
        ckd ckdVar = this.a;
        if (ckdVar != null) {
            return ckdVar.b;
        }
        return 0;
    }

    public final boolean X(int i) {
        ckd ckdVar = this.a;
        if (ckdVar != null) {
            return ckdVar.c(i);
        }
        this.b = i;
        return false;
    }

    protected void ae(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.qy
    public boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        ae(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new ckd(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    public ckc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
