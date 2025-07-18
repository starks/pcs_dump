package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hs extends rv {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ hu d;

    public hs(hu huVar, int i, int i2, WeakReference weakReference) {
        this.d = huVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.rv
    public final void b(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        hu huVar = this.d;
        WeakReference weakReference = this.c;
        if (huVar.c) {
            huVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new bdq(textView, typeface, huVar.a, 1));
                } else {
                    hu.b(textView, typeface, huVar.a);
                }
            }
        }
    }

    @Override // defpackage.rv
    public final void a(int i) {
    }
}
