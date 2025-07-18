package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xd extends xg {
    public xd() {
        super("rotationX");
    }

    @Override // defpackage.xi
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getRotationX();
    }

    @Override // defpackage.xi
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setRotationX(f);
    }
}
