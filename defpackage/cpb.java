package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.as.oss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpb extends gr {
    public final jk a;
    public final int b;
    public final ColorStateList c;
    private final AccessibilityManager d;
    private final Rect e;
    private final int f;

    public cpb(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(cpg.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.e = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = cnb.a(context2, attributeSet, cpc.a, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayA.hasValue(0) && typedArrayA.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = typedArrayA.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f = resourceId;
        typedArrayA.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayA.hasValue(2)) {
            ColorStateList.valueOf(typedArrayA.getColor(2, 0));
        }
        this.b = typedArrayA.getColor(4, 0);
        this.c = cnx.i(context2, typedArrayA, 5);
        this.d = (AccessibilityManager) context2.getSystemService("accessibility");
        jk jkVar = new jk(context2, null, R.attr.listPopupWindowStyle);
        this.a = jkVar;
        jkVar.y();
        jkVar.l = this;
        jkVar.x();
        jkVar.e(getAdapter());
        jkVar.m = new bdr(this, 2);
        if (typedArrayA.hasValue(6)) {
            setAdapter(new cpa(this, getContext(), resourceId, getResources().getStringArray(typedArrayA.getResourceId(6, 0))));
        }
        typedArrayA.recycle();
    }

    private final cpd b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof cpd) {
                return (cpd) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        AccessibilityManager accessibilityManager2 = this.d;
        if (accessibilityManager2 == null || !accessibilityManager2.isEnabled() || (enabledAccessibilityServiceList = this.d.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.a.f();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        if (b() == null) {
            return super.getHint();
        }
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b() != null) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.f();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            cpd cpdVarB = b();
            int i3 = 0;
            if (adapter == null || cpdVarB == null) {
                setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                return;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            int iMin = Math.min(adapter.getCount(), Math.max(0, this.a.o()) + 15);
            int iMax = Math.max(0, iMin - 15);
            View view = null;
            int iMax2 = 0;
            while (iMax < iMin) {
                int itemViewType = adapter.getItemViewType(iMax);
                int i4 = itemViewType != i3 ? itemViewType : i3;
                if (itemViewType != i3) {
                    view = null;
                }
                view = adapter.getView(iMax, view, cpdVarB);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                iMax++;
                i3 = i4;
            }
            Drawable drawableC = this.a.c();
            if (drawableC == null) {
                throw null;
            }
            drawableC.getPadding(this.e);
            int i5 = this.e.left;
            int i6 = this.e.right;
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        jk jkVar = this.a;
        if (jkVar != null) {
            jkVar.g(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.n = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        if (b() != null) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.a.s();
        } else {
            super.showDropDown();
        }
    }
}
