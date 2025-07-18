package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ckn;
import defpackage.cko;
import defpackage.qy;
import defpackage.ut;
import defpackage.vv;
import defpackage.wr;
import defpackage.ws;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeDismissBehavior extends qy {
    public ws a;
    public boolean b;
    private boolean g;
    public int c = 2;
    final float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    private final wr h = new ckn(this);

    public static float E(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    public boolean D(View view) {
        return true;
    }

    @Override // defpackage.qy
    public boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zK = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zK = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = zK;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (zK) {
            if (this.a == null) {
                this.a = ws.b(coordinatorLayout, this.h);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qy
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        ut.i(view, 1048576);
        if (!D(view)) {
            return false;
        }
        ut.n(view, vv.e, new cko(this));
        return false;
    }

    @Override // defpackage.qy
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }
}
