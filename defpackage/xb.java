package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xb extends xg {
    public xb() {
        super("scaleY");
    }

    @Override // defpackage.xi
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getScaleY();
    }

    @Override // defpackage.xi
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setScaleY(f);
    }
}
