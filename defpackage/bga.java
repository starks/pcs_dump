package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bga extends bfw {
    public static final List n = new CopyOnWriteArrayList();
    public final List o;
    public final bfy p;

    public bga(Context context, String str, bgw bgwVar, csg csgVar, bfy bfyVar) {
        super(context, "BRELLA", bgwVar, csgVar);
        this.o = new CopyOnWriteArrayList();
        this.p = null;
    }

    public static void e(bfz bfzVar) {
        n.add(0, bfzVar);
    }

    @Deprecated
    public final bfx f(egi egiVar) {
        aso.F(egiVar);
        return new bfx(this, egiVar);
    }
}
