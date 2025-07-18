package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xa extends xg {
    public xa() {
        super("scaleX");
    }

    @Override // defpackage.xi
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getScaleX();
    }

    @Override // defpackage.xi
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setScaleX(f);
    }
}
