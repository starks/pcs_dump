package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gv extends CheckedTextView {
    private final gw a;
    private final gs b;
    private final hu c;
    private ayo d;

    public gv(Context context, AttributeSet attributeSet) {
        super(lb.a(context), attributeSet, R.attr.checkedTextViewStyle);
        kz.d(this, getContext());
        hu huVar = new hu(this);
        this.c = huVar;
        huVar.c(attributeSet, R.attr.checkedTextViewStyle);
        huVar.a();
        gs gsVar = new gs(this);
        this.b = gsVar;
        gsVar.b(attributeSet, R.attr.checkedTextViewStyle);
        gw gwVar = new gw(this);
        this.a = gwVar;
        gwVar.b(attributeSet);
        a().p(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final ayo a() {
        if (this.d == null) {
            this.d = new ayo(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.a();
        }
        gw gwVar = this.a;
        if (gwVar != null) {
            gwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return vq.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.s(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().q(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.t(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hu huVar = this.c;
        if (huVar != null) {
            huVar.d(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        gw gwVar = this.a;
        if (gwVar != null) {
            if (gwVar.a) {
                gwVar.a = false;
            } else {
                gwVar.a = true;
                gwVar.a();
            }
        }
    }
}
