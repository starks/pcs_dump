package com.android.settingslib.widget;

import android.content.Context;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinkTextView extends TextView {
    public LinkTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned) || ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            return;
        }
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
