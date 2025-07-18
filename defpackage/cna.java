package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cna {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean j;
    public vr l;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 1.0f;
    public int h = 1;
    public boolean i = true;
    public TextUtils.TruncateAt k = null;

    public cna(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }
}
