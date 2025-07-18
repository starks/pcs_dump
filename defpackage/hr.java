package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hr extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public hq b;
    int c;
    final Rect d;
    private final gs f;
    private is g;
    private SpinnerAdapter h;
    private final boolean i;

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:214), block:B:39:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hr(android.content.Context r11, android.util.AttributeSet r12) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2130969802(0x7f0404ca, float:1.7548296E38)
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.d = r1
            android.content.Context r1 = r10.getContext()
            defpackage.kz.d(r10, r1)
            int[] r1 = defpackage.dp.u
            r2 = 0
            zw r1 = defpackage.zw.r(r11, r12, r1, r0, r2)
            gs r3 = new gs
            r3.<init>(r10)
            r10.f = r3
            r3 = 4
            int r3 = r1.g(r3, r2)
            if (r3 == 0) goto L31
            mx r4 = new mx
            r4.<init>(r11, r3)
            r10.a = r4
            goto L33
        L31:
            r10.a = r11
        L33:
            r3 = 1
            r4 = 0
            int[] r5 = defpackage.hr.e     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r0, r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Ld4
            if (r6 == 0) goto L46
            int r6 = r5.getInt(r2, r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Ld4
            goto L47
        L46:
            r6 = -1
        L47:
            if (r5 == 0) goto L4c
            r5.recycle()
        L4c:
            r5 = 2
            if (r6 == 0) goto L83
            if (r6 == r3) goto L52
            goto La5
        L52:
            ho r6 = new ho
            android.content.Context r7 = r10.a
            r6.<init>(r10, r7, r12)
            android.content.Context r7 = r10.a
            int[] r8 = defpackage.dp.u
            zw r7 = defpackage.zw.r(r7, r12, r8, r0, r2)
            r8 = 3
            r9 = -2
            int r8 = r7.f(r8, r9)
            r10.c = r8
            android.graphics.drawable.Drawable r8 = r7.i(r3)
            r6.g(r8)
            java.lang.String r5 = r1.l(r5)
            r6.a = r5
            r7.m()
            r10.b = r6
            hk r5 = new hk
            r5.<init>(r10, r10, r6)
            r10.g = r5
            goto La5
        L83:
            hl r6 = new hl
            r6.<init>(r10)
            r10.b = r6
            java.lang.String r5 = r1.l(r5)
            r6.j(r5)
            goto La5
        L92:
            r6 = move-exception
            goto L99
        L94:
            r10 = move-exception
            goto Ld6
        L96:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L99:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> Ld4
            if (r5 == 0) goto La5
            r5.recycle()
        La5:
            java.lang.Object r5 = r1.a
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            java.lang.CharSequence[] r2 = r5.getTextArray(r2)
            if (r2 == 0) goto Lc0
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r11, r6, r2)
            r11 = 2131558539(0x7f0d008b, float:1.8742397E38)
            r5.setDropDownViewResource(r11)
            r10.setAdapter(r5)
        Lc0:
            r1.m()
            r10.i = r3
            android.widget.SpinnerAdapter r11 = r10.h
            if (r11 == 0) goto Lce
            r10.setAdapter(r11)
            r10.h = r4
        Lce:
            gs r10 = r10.f
            r10.b(r12, r0)
            return
        Ld4:
            r10 = move-exception
            r4 = r5
        Ld6:
            if (r4 == 0) goto Ldb
            r4.recycle()
        Ldb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i2 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i = i2;
        }
        if (drawable == null) {
            return iMax3;
        }
        drawable.getPadding(this.d);
        Rect rect = this.d;
        return iMax3 + rect.left + rect.right;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gs gsVar = this.f;
        if (gsVar != null) {
            gsVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        hq hqVar = this.b;
        return hqVar != null ? hqVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        hq hqVar = this.b;
        return hqVar != null ? hqVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        hq hqVar = this.b;
        return hqVar != null ? hqVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        hq hqVar = this.b;
        return hqVar != null ? hqVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hq hqVar = this.b;
        if (hqVar == null || !hqVar.u()) {
            return;
        }
        this.b.f();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        hp hpVar = (hp) parcelable;
        super.onRestoreInstanceState(hpVar.getSuperState());
        if (!hpVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new fw(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        hp hpVar = new hp(super.onSaveInstanceState());
        hq hqVar = this.b;
        boolean z = false;
        if (hqVar != null && hqVar.u()) {
            z = true;
        }
        hpVar.a = z;
        return hpVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        is isVar = this.g;
        if (isVar == null || !isVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        hq hqVar = this.b;
        if (hqVar == null) {
            return super.performClick();
        }
        if (hqVar.u()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.f;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.f;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        hq hqVar = this.b;
        if (hqVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            hqVar.i(i);
            this.b.h(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        hq hqVar = this.b;
        if (hqVar != null) {
            hqVar.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        hq hqVar = this.b;
        if (hqVar != null) {
            hqVar.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.t(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        hq hqVar = this.b;
        if (hqVar != null) {
            hqVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new hm(spinnerAdapter, context.getTheme()));
        }
    }
}
