package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class v implements zj {
    final /* synthetic */ x a;

    public v(x xVar) {
        this.a = xVar;
    }

    @Override // defpackage.zj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((yz) obj) != null) {
            x xVar = this.a;
            if (xVar.b) {
                View viewD = xVar.D();
                if (viewD.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (this.a.c != null) {
                    if (ax.X(3)) {
                        toString();
                        Objects.toString(this.a.c);
                    }
                    this.a.c.setContentView(viewD);
                }
            }
        }
    }
}
