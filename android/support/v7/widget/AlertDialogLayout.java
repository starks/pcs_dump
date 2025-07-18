package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;
import defpackage.jb;
import defpackage.jc;
import defpackage.ut;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AlertDialogLayout extends jc {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private static int a(View view) {
        int[] iArr = ut.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // defpackage.jc, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r13 = r13 - r11
            int r10 = r9.getPaddingLeft()
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.f
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L37
            r4 = 80
            if (r3 == r4) goto L2e
            int r12 = r9.getPaddingTop()
            goto L41
        L2e:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L41
        L37:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L41:
            android.graphics.drawable.Drawable r14 = r9.g
            r0 = 0
            if (r14 != 0) goto L48
            r14 = r0
            goto L4c
        L48:
            int r14 = r14.getIntrinsicHeight()
        L4c:
            if (r0 >= r1) goto Laa
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto La7
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto La7
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            jb r6 = (defpackage.jb) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L6f
            r7 = r2
        L6f:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L88
            r8 = 5
            if (r7 == r8) goto L83
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L93
        L83:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L92
        L88:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L92:
            int r7 = r7 - r8
        L93:
            boolean r8 = r9.r(r0)
            if (r8 == 0) goto L9a
            int r12 = r12 + r14
        L9a:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        La7:
            int r0 = r0 + 1
            goto L4c
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // defpackage.jc, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iA;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int i3;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        View view4 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = alertDialogLayout.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view2 = childAt;
                } else if (id == R.id.buttonPanel) {
                    view3 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view4 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view4 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = alertDialogLayout.getPaddingTop() + alertDialogLayout.getPaddingBottom();
        if (view2 != null) {
            view2.measure(i, 0);
            paddingTop += view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view2.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view3 != null) {
            view3.measure(i, 0);
            iA = a(view3);
            measuredHeight = view3.getMeasuredHeight() - iA;
            paddingTop += iA;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            iA = 0;
            measuredHeight = 0;
        }
        if (view4 != null) {
            view4.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            int measuredHeight2 = view4.getMeasuredHeight();
            paddingTop += measuredHeight2;
            int iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates, view4.getMeasuredState());
            i3 = measuredHeight2;
            view = view4;
            iCombineMeasuredStates2 = iCombineMeasuredStates3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            i3 = 0;
        }
        int i5 = size - paddingTop;
        if (view3 != null) {
            int i6 = paddingTop - iA;
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iA += iMin;
            }
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(iA, 1073741824));
            paddingTop = i6 + view3.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view3.getMeasuredState());
        }
        if (view != null && i5 > 0) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(i3 + i5, mode));
            paddingTop = (paddingTop - i3) + view.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = alertDialogLayout.getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int iResolveSizeAndState = View.resolveSizeAndState(iMax + alertDialogLayout.getPaddingLeft() + alertDialogLayout.getPaddingRight(), i, iCombineMeasuredStates2);
        int i8 = i2;
        alertDialogLayout.setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(paddingTop, i8, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i9 = 0;
            while (i9 < childCount) {
                int i10 = iMakeMeasureSpec;
                View childAt3 = alertDialogLayout.getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    jb jbVar = (jb) childAt3.getLayoutParams();
                    if (jbVar.width == -1) {
                        int i11 = jbVar.height;
                        jbVar.height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, i10, 0, i8, 0);
                        jbVar.height = i11;
                    }
                }
                i9++;
                alertDialogLayout = this;
                i8 = i2;
                iMakeMeasureSpec = i10;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
