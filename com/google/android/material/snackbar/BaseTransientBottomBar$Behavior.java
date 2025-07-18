package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.brb;
import defpackage.cnx;
import defpackage.cov;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    private final cnx g = new cnx(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean D(View view) {
        return view instanceof cov;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.qy
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                synchronized (brb.N().a) {
                }
            }
        } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            synchronized (brb.N().a) {
            }
        }
        return super.i(coordinatorLayout, view, motionEvent);
    }
}
