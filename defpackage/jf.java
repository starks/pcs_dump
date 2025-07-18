package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jf {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(kc kcVar) {
        List list = this.l;
        if (list == null) {
            View viewB = kcVar.b(this.d);
            this.d += this.e;
            return viewB;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((km) this.l.get(i)).a;
            jz jzVar = (jz) view.getLayoutParams();
            if (!jzVar.c() && this.d == jzVar.a()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int iA;
        int size = this.l.size();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((km) this.l.get(i)).a;
            jz jzVar = (jz) view3.getLayoutParams();
            if (view3 != view && !jzVar.c() && (iA = (jzVar.a() - this.d) * this.e) >= 0 && iA < i2) {
                if (iA == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = iA;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((jz) view2.getLayoutParams()).a();
        }
    }

    public final boolean d(kj kjVar) {
        int i = this.d;
        return i >= 0 && i < kjVar.a();
    }
}
