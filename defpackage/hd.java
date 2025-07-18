package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hd extends MultiAutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final gs b;
    private final hu c;
    private final bnz d;

    public hd(Context context, AttributeSet attributeSet) {
        super(lb.a(context), attributeSet, com.google.android.as.oss.R.attr.autoCompleteTextViewStyle);
        kz.d(this, getContext());
        zw zwVarR = zw.r(getContext(), attributeSet, a, com.google.android.as.oss.R.attr.autoCompleteTextViewStyle, 0);
        if (zwVarR.o(0)) {
            setDropDownBackgroundDrawable(zwVarR.i(0));
        }
        zwVarR.m();
        gs gsVar = new gs(this);
        this.b = gsVar;
        gsVar.b(attributeSet, com.google.android.as.oss.R.attr.autoCompleteTextViewStyle);
        hu huVar = new hu(this);
        this.c = huVar;
        huVar.c(attributeSet, com.google.android.as.oss.R.attr.autoCompleteTextViewStyle);
        huVar.a();
        bnz bnzVar = new bnz((EditText) this, (byte[]) null);
        this.d = bnzVar;
        bnzVar.k(attributeSet, com.google.android.as.oss.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (bnz.l(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerI = bnzVar.i(keyListener);
            if (keyListenerI == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerI);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.a();
        }
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.s(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.j(inputConnectionOnCreateInputConnection, editorInfo);
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

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.t(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.i(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hu huVar = this.c;
        if (huVar != null) {
            huVar.d(context, i);
        }
    }
}
