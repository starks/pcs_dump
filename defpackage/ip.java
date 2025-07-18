package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ip extends jt {
    final /* synthetic */ ir a;

    public ip(ir irVar) {
        this.a = irVar;
    }

    @Override // defpackage.jt
    public final void a(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ir irVar = this.a;
        int iComputeVerticalScrollRange = irVar.l.computeVerticalScrollRange();
        int i = irVar.k;
        irVar.m = iComputeVerticalScrollRange - i > 0 && i >= irVar.a;
        int iComputeHorizontalScrollRange = irVar.l.computeHorizontalScrollRange();
        int i2 = irVar.j;
        boolean z = iComputeHorizontalScrollRange - i2 > 0 && i2 >= irVar.a;
        irVar.n = z;
        if (irVar.m) {
            float f = i;
            irVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            irVar.d = Math.min(i, (i * i) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (irVar.o != 0) {
                irVar.c(0);
                return;
            }
            return;
        }
        if (irVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i2;
            irVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            irVar.g = Math.min(i2, (i2 * i2) / iComputeHorizontalScrollRange);
        }
        int i3 = irVar.o;
        if (i3 == 0 || i3 == 1) {
            irVar.c(1);
        }
    }
}
