package com.android.settingslib.widget;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.as.oss.R;
import defpackage.a;
import defpackage.aca;
import defpackage.ajz;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FooterPreference extends Preference {
    public FooterPreference(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, R.attr.footerPreferenceStyle);
        this.A = R.layout.preference_footer;
        if (this.r == null && (i = this.q) != 0) {
            this.r = a.t(this.j, i);
        }
        if (this.r == null) {
            C(R.drawable.settingslib_ic_info_outline_24);
        }
        D(2147483646);
        if (TextUtils.isEmpty(this.s)) {
            this.s = "footer_preference";
            if (this.v && !J()) {
                if (TextUtils.isEmpty(this.s)) {
                    throw new IllegalStateException("Preference does not have a key assigned.");
                }
                this.v = true;
            }
        }
        P();
    }

    private final void k(TextView textView) {
        URLSpan uRLSpan;
        String url;
        CharSequence charSequence = this.o;
        if (charSequence instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                SpannableString spannableString = new SpannableString(charSequence);
                for (ClickableSpan clickableSpan : clickableSpanArr) {
                    if ((clickableSpan instanceof URLSpan) && (url = (uRLSpan = (URLSpan) clickableSpan).getURL()) != null && url.startsWith("intent:")) {
                        int spanStart = spannableString.getSpanStart(uRLSpan);
                        int spanEnd = spannableString.getSpanEnd(uRLSpan);
                        spannableString.removeSpan(uRLSpan);
                        try {
                            spannableString.setSpan(new ajz(this, Intent.parseUri(url, 1)), spanStart, spanEnd, 33);
                        } catch (URISyntaxException e) {
                            Log.e("FooterPreference", "Invalid URI ".concat(url), e);
                        }
                    }
                }
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        super.a(acaVar);
        TextView textView = (TextView) acaVar.a.findViewById(android.R.id.title);
        if (textView != null) {
            if (!TextUtils.isEmpty(null)) {
                textView.setContentDescription(null);
            }
            k(textView);
        }
        TextView textView2 = (TextView) acaVar.a.findViewById(R.id.settingslib_learn_more);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        View viewFindViewById = acaVar.a.findViewById(R.id.icon_frame);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        return this.o;
    }
}
