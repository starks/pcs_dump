package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bu extends bw {
    private final bc j;

    /* JADX WARN: Illegal instructions before constructor call */
    public bu(int i, int i2, bc bcVar) {
        ab abVar = bcVar.a;
        abVar.getClass();
        super(i, i2, abVar);
        this.j = bcVar;
    }

    @Override // defpackage.bw
    public final void a() {
        super.a();
        this.a.r = false;
        this.j.d();
    }

    @Override // defpackage.bw
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        if (this.i != 2) {
            if (this.i == 3) {
                ab abVar = this.j.a;
                abVar.getClass();
                View viewD = abVar.D();
                if (ax.X(2)) {
                    Objects.toString(viewD.findFocus());
                    Objects.toString(viewD);
                    Objects.toString(abVar);
                }
                viewD.clearFocus();
                return;
            }
            return;
        }
        ab abVar2 = this.j.a;
        abVar2.getClass();
        View viewFindFocus = abVar2.O.findFocus();
        if (viewFindFocus != null) {
            abVar2.W(viewFindFocus);
            if (ax.X(2)) {
                Objects.toString(viewFindFocus);
                Objects.toString(abVar2);
            }
        }
        View viewD2 = this.a.D();
        if (viewD2.getParent() == null) {
            this.j.a();
            viewD2.setAlpha(0.0f);
        }
        if (viewD2.getAlpha() == 0.0f && viewD2.getVisibility() == 0) {
            viewD2.setVisibility(4);
        }
        z zVar = abVar2.R;
        viewD2.setAlpha(zVar == null ? 1.0f : zVar.o);
    }
}
