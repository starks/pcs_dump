package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xc extends xg {
    public xc() {
        super("rotation");
    }

    @Override // defpackage.xi
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getRotation();
    }

    @Override // defpackage.xi
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setRotation(f);
    }
}
