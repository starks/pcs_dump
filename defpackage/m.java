package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class m {
    public final bw a;

    public m(bw bwVar) {
        this.a = bwVar;
    }

    public final boolean b() {
        View view = this.a.a.O;
        int i = view != null ? bv.a.i(view) : 0;
        int i2 = this.a.h;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }
}
