package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ago extends ahc {
    private static final String[] u = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property v = new agg(PointF.class);
    private static final Property w = new agh(PointF.class);
    private static final Property x = new agi(PointF.class);
    private static final Property y = new agj(PointF.class);
    private static final Property z = new agk(PointF.class);

    private static final void f(ahl ahlVar) {
        View view = ahlVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        ahlVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        ahlVar.a.put("android:changeBounds:parent", ahlVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // defpackage.ahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.ahl r21, defpackage.ahl r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ago.a(android.view.ViewGroup, ahl, ahl):android.animation.Animator");
    }

    @Override // defpackage.ahc
    public final void b(ahl ahlVar) {
        f(ahlVar);
    }

    @Override // defpackage.ahc
    public final void c(ahl ahlVar) {
        f(ahlVar);
    }

    @Override // defpackage.ahc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ahc
    public final String[] e() {
        return u;
    }
}
