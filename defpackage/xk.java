package defpackage;

import android.animation.ValueAnimator;
import android.util.AndroidRuntimeException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xk extends xh {
    public xl r;
    public boolean s;
    private float t;

    public xk(xj xjVar) {
        super(xjVar);
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.s = false;
    }

    @Override // defpackage.xh
    public final boolean c(long j) {
        float f;
        if (this.s) {
            float f2 = this.t;
            if (f2 != Float.MAX_VALUE) {
                this.r.d(f2);
                this.t = Float.MAX_VALUE;
            }
            this.h = this.r.a();
            this.g = 0.0f;
            this.s = false;
            return true;
        }
        if (this.t != Float.MAX_VALUE) {
            long j2 = j / 2;
            xf xfVarB = this.r.b(this.h, this.g, j2);
            this.r.d(this.t);
            this.t = Float.MAX_VALUE;
            xf xfVarB2 = this.r.b(xfVarB.a, xfVarB.b, j2);
            f = xfVarB2.a;
            this.h = f;
            this.g = xfVarB2.b;
        } else {
            xf xfVarB3 = this.r.b(this.h, this.g, j);
            f = xfVarB3.a;
            this.h = f;
            this.g = xfVarB3.b;
        }
        float fMax = Math.max(f, this.n);
        this.h = fMax;
        this.h = Math.min(fMax, this.m);
        float f3 = this.g;
        xl xlVar = this.r;
        if (Math.abs(f3) >= xlVar.d || Math.abs(r1 - xlVar.a()) >= xlVar.c) {
            return false;
        }
        this.h = this.r.a();
        this.g = 0.0f;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    public final void d(float f) {
        if (this.l) {
            this.t = f;
            return;
        }
        if (this.r == null) {
            this.r = new xl(f);
        }
        this.r.d(f);
        xl xlVar = this.r;
        if (xlVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = xlVar.a();
        if (dA > this.m) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        xl xlVar2 = this.r;
        double dAbs = Math.abs(this.o * 0.75f);
        xlVar2.c = dAbs;
        xlVar2.d = dAbs * 62.5d;
        if (!wx.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            return;
        }
        this.l = true;
        if (!this.i) {
            this.h = this.k.a(this.j);
        }
        float f2 = this.h;
        if (f2 > this.m || f2 < this.n) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        wx wxVarA = wx.a();
        if (wxVarA.b.size() == 0) {
            wxVarA.h.g(wxVarA.c);
            wxVarA.f = ValueAnimator.getDurationScale();
            if (wxVarA.g == null) {
                wxVarA.g = new wv(wxVarA);
            }
            final wv wvVar = wxVarA.g;
            if (wvVar.a == null) {
                wvVar.a = new ValueAnimator.DurationScaleChangeListener() { // from class: wu
                    @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                    public final void onChanged(float f3) {
                        ((wx) wvVar.b).f = f3;
                    }
                };
                ValueAnimator.registerDurationScaleChangeListener(wvVar.a);
            }
        }
        if (wxVarA.b.contains(this)) {
            return;
        }
        wxVarA.b.add(this);
    }

    public xk(Object obj, xi xiVar) {
        super(obj, xiVar);
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.s = false;
    }
}
