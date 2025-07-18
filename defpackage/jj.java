package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jj implements View.OnTouchListener {
    final /* synthetic */ jk a;

    public jj(jk jkVar) {
        this.a = jkVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            jk jkVar = this.a;
            jkVar.o.removeCallbacks(jkVar.r);
            return false;
        }
        PopupWindow popupWindow = this.a.q;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.q.getWidth() || y < 0 || y >= this.a.q.getHeight()) {
            return false;
        }
        jk jkVar2 = this.a;
        jkVar2.o.postDelayed(jkVar2.r, 250L);
        return false;
    }
}
