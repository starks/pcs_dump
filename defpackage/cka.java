package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cka extends ckc {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public cka() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public float D(View view) {
        throw null;
    }

    public int E(View view) {
        throw null;
    }

    public abstract View F(List list);

    public final int H(View view) {
        if (this.d == 0) {
            return 0;
        }
        float fD = D(view);
        int i = this.d;
        return un.F((int) (fD * i), 0, i);
    }

    public boolean J() {
        return false;
    }

    @Override // defpackage.ckc
    protected final void ae(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewF = F(coordinatorLayout.a(view));
        if (viewF == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        rb rbVar = (rb) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + rbVar.leftMargin, viewF.getBottom() + rbVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - rbVar.rightMargin, ((coordinatorLayout.getHeight() + viewF.getBottom()) - coordinatorLayout.getPaddingBottom()) - rbVar.bottomMargin);
        vs vsVar = coordinatorLayout.e;
        if (vsVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += vsVar.b();
            rect.right -= vsVar.c();
        }
        Rect rect2 = this.b;
        int i2 = rbVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iH = H(viewF);
        view.layout(rect2.left, rect2.top - iH, rect2.right, rect2.bottom - iH);
        this.c = rect2.top - viewF.getBottom();
    }

    public cka(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
