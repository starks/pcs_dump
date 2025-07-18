package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wj implements tr {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public wj(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.tr
    public final float a() {
        float fA;
        if (this.b == 0) {
            fA = ((NestedScrollView) this.a).a();
        } else if (((RecyclerView) this.a).n.X()) {
            fA = ((RecyclerView) this.a).G;
        } else {
            if (!((RecyclerView) this.a).n.W()) {
                return 0.0f;
            }
            fA = ((RecyclerView) this.a).F;
        }
        return -fA;
    }

    @Override // defpackage.tr
    public final void b() {
        if (this.b != 0) {
            ((RecyclerView) this.a).Z();
        } else {
            ((NestedScrollView) this.a).a.abortAnimation();
        }
    }

    @Override // defpackage.tr
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b == 0) {
            if (f == 0.0f) {
                return false;
            }
            b();
            ((NestedScrollView) this.a).j((int) f);
            return true;
        }
        if (((RecyclerView) this.a).n.X()) {
            i2 = (int) f;
            i = 0;
        } else if (((RecyclerView) this.a).n.W()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        ((RecyclerView) this.a).Z();
        return ((RecyclerView) this.a).ac(i, i2, 0, Integer.MAX_VALUE);
    }
}
