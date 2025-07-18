package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ht {
    public static final ob a = new ob(30);
    public static Paint b;

    static void a(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
