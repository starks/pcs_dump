package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ga extends ViewGroup {
    protected final fz a;
    public final Context b;
    public ActionMenuView c;
    public gl d;
    public int e;
    protected fsc f;
    private boolean g;
    private boolean h;

    ga(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        int i5 = measuredHeight + i4;
        if (z) {
            view.layout(i - measuredWidth, i4, i, i5);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, i5);
        return measuredWidth;
    }

    public void c(int i) {
        throw null;
    }

    public final fsc g(int i, long j) {
        fsc fscVar = this.f;
        if (fscVar != null) {
            fscVar.ak();
        }
        if (i != 0) {
            fsc fscVarO = ut.o(this);
            fscVarO.al(0.0f);
            fscVarO.am(j);
            fz fzVar = this.a;
            fzVar.d(fscVarO, i);
            fscVarO.an(fzVar);
            return fscVarO;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        fsc fscVarO2 = ut.o(this);
        fscVarO2.al(1.0f);
        fscVarO2.am(j);
        fz fzVar2 = this.a;
        fzVar2.d(fscVarO2, 0);
        fscVarO2.an(fzVar2);
        return fscVarO2;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dp.a, R.attr.actionBarStyle, 0);
        c(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        gl glVar = this.d;
        if (glVar != null) {
            glVar.j = new fsc(glVar.b).at();
            ff ffVar = glVar.c;
            if (ffVar != null) {
                ffVar.l(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            fsc fscVar = this.f;
            if (fscVar != null) {
                fscVar.ak();
            }
            super.setVisibility(i);
        }
    }

    public ga(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ga(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new fz(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
