package defpackage;

import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class r extends fjt implements fin {
    final /* synthetic */ s a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ Object c;
    final /* synthetic */ fjx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ViewGroup viewGroup, Object obj, fjx fjxVar) {
        super(0);
        this.a = sVar;
        this.b = viewGroup;
        this.c = obj;
        this.d = fjxVar;
    }

    @Override // defpackage.fin
    public final /* bridge */ /* synthetic */ Object a() {
        s sVar = this.a;
        sVar.g = sVar.d.r(this.b, this.c);
        s sVar2 = this.a;
        Object obj = this.c;
        ViewGroup viewGroup = this.b;
        if (sVar2.g != null) {
            this.d.a = new q(sVar2, obj, viewGroup, 0);
            if (ax.X(2)) {
                Objects.toString(this.a.b);
                Objects.toString(this.a.c);
            }
            return ffz.a;
        }
        throw new IllegalStateException("Unable to start transition " + obj + " for container " + viewGroup + '.');
    }
}
