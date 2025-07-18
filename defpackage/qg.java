package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qg {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public qg(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void a(pg pgVar, po poVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (pgVar == null) {
            return;
        }
        if (pgVar.ai == 8) {
            poVar.e = 0;
            poVar.f = 0;
            poVar.g = 0;
            return;
        }
        if (pgVar.V != null) {
            int i3 = poVar.k;
            int i4 = poVar.l;
            int i5 = poVar.c;
            int i6 = poVar.d;
            int i7 = this.b + this.c;
            int i8 = this.d;
            Object obj = pgVar.ah;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = pgVar.t;
                int i11 = poVar.j;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int iH = pgVar.h();
                    if (poVar.j == 2 || i10 != 1 || measuredHeight == iH || (obj instanceof qs) || pgVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(pgVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                pf pfVar = pgVar.K;
                int i13 = pfVar != null ? pfVar.f : 0;
                pf pfVar2 = pgVar.M;
                if (pfVar2 != null) {
                    i13 += pfVar2.f;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = pgVar.u;
                int i16 = poVar.j;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int iJ = pgVar.j();
                    if (poVar.j == 2 || i15 != 1 || measuredWidth == iJ || (obj instanceof qs) || pgVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(pgVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = pgVar.K != null ? pgVar.L.f : 0;
                if (pgVar.M != null) {
                    i18 += pgVar.N.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            pg pgVar2 = pgVar.V;
            if (pgVar2 != null && pl.b(this.h.e, 256)) {
                View view = (View) obj;
                if (view.getMeasuredWidth() == pgVar.j() && view.getMeasuredWidth() < pgVar2.j() && view.getMeasuredHeight() == pgVar.h() && view.getMeasuredHeight() < pgVar2.h() && view.getBaseline() == pgVar.ac && !pgVar.K() && b(pgVar.I, iMakeMeasureSpec, pgVar.j()) && b(pgVar.J, iMakeMeasureSpec2, pgVar.h())) {
                    poVar.e = pgVar.j();
                    poVar.f = pgVar.h();
                    poVar.g = pgVar.ac;
                    return;
                }
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && pgVar.Y > 0.0f;
            boolean z6 = z2 && pgVar.Y > 0.0f;
            if (obj != null) {
                View view2 = (View) obj;
                qf qfVar = (qf) view2.getLayoutParams();
                boolean z7 = z4;
                int i19 = poVar.j;
                if (i19 != 1 && i19 != 2 && z && pgVar.t == 0 && z2 && pgVar.u == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((obj instanceof qv) && (pgVar instanceof pm)) {
                        throw null;
                    }
                    view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    pgVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    int i20 = pgVar.w;
                    iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = pgVar.x;
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    int i22 = pgVar.z;
                    iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    int i23 = pgVar.A;
                    if (i23 > 0) {
                        iMax2 = Math.min(i23, iMax2);
                    }
                    if (!pl.b(this.h.e, 1)) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * pgVar.Y) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / pgVar.Y) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                        if (measuredWidth2 != iMax) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        pgVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view2.getMeasuredWidth();
                        iMax2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                poVar.i = (iMax == poVar.c && iMax2 == poVar.d) ? false : true;
                boolean z9 = qfVar.ag | z8;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (pgVar.ac != baseline) {
                        poVar.i = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                poVar.e = iMax;
                poVar.f = iMax2;
                poVar.h = z9;
                poVar.g = i2;
            }
        }
    }
}
