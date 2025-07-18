package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wy extends xg {
    public wy() {
        super("alpha");
    }

    @Override // defpackage.xi
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getAlpha();
    }

    @Override // defpackage.xi
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }
}
