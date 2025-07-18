package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gt extends Button {
    public final gs a;
    private final hu b;
    private ayo c;

    public gt(Context context) {
        this(context, null);
    }

    private final ayo a() {
        if (this.c == null) {
            this.c = new ayo(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.a();
        }
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return vq.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().q(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().r(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.d(context, i);
        }
    }

    public gt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public gt(Context context, AttributeSet attributeSet, int i) {
        super(lb.a(context), attributeSet, i);
        kz.d(this, getContext());
        gs gsVar = new gs(this);
        this.a = gsVar;
        gsVar.b(attributeSet, i);
        hu huVar = new hu(this);
        this.b = huVar;
        huVar.c(attributeSet, i);
        huVar.a();
        a().p(attributeSet, i);
    }
}
