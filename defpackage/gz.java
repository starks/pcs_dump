package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gz extends EditText {
    private final gs a;
    private final hu b;
    private final bnz c;
    private fuu d;

    public gz(Context context, AttributeSet attributeSet) {
        super(lb.a(context), attributeSet, R.attr.editTextStyle);
        kz.d(this, getContext());
        gs gsVar = new gs(this);
        this.a = gsVar;
        gsVar.b(attributeSet, R.attr.editTextStyle);
        hu huVar = new hu(this);
        this.b = huVar;
        huVar.c(attributeSet, R.attr.editTextStyle);
        huVar.a();
        bnz bnzVar = new bnz((EditText) this, (byte[]) null);
        this.c = bnzVar;
        bnzVar.k(attributeSet, R.attr.editTextStyle);
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

    private final fuu c() {
        if (this.d == null) {
            this.d = new fuu(this, null);
        }
        return this.d;
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
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return vq.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.s(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.c.j(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.i(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }
}
