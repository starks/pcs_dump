package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bg {
    public static final bg a = new bg();
    public static final bo b = new bm();
    public static final bo c;

    static {
        bo boVar = null;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            cls.getClass();
            boVar = (bo) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        c = boVar;
    }

    private bg() {
    }

    public static final void a(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
