package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cks extends wr {
    final /* synthetic */ BottomSheetBehavior a;

    public cks(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.wr
    public final void c(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.v) {
                bottomSheetBehavior.J(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cks.d(android.view.View, float, float):void");
    }

    @Override // defpackage.wr
    public final boolean e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.w;
        if (i2 == 1 || bottomSheetBehavior.D) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.C == i) {
            WeakReference weakReference = bottomSheetBehavior.B;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference2 = this.a.A;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.wr
    public final int f(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.wr
    public final int g(View view, int i) {
        return un.F(i, this.a.D(), h());
    }

    @Override // defpackage.wr
    public final int h() {
        boolean zL = this.a.L();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return zL ? bottomSheetBehavior.z : bottomSheetBehavior.r;
    }

    @Override // defpackage.wr
    public final void i(View view, int i, int i2) {
        this.a.F(i2);
    }
}
