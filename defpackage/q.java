package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class q extends fjt implements fin {
    final /* synthetic */ s a;
    final /* synthetic */ Object b;
    final /* synthetic */ ViewGroup c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, ViewGroup viewGroup, Object obj, int i) {
        super(0);
        this.d = i;
        this.a = sVar;
        this.c = viewGroup;
        this.b = obj;
    }

    @Override // defpackage.fin
    public final /* synthetic */ Object a() {
        if (this.d != 0) {
            Object obj = this.b;
            this.a.d.f(this.c, obj);
            return ffz.a;
        }
        List list = this.a.a;
        if (list.isEmpty()) {
            ax.X(2);
            s sVar = this.a;
            Object obj2 = sVar.g;
            obj2.getClass();
            sVar.d.t(obj2, new o(sVar, this.c, 3, (byte[]) null));
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((t) it.next()).a.d) {
                    ax.X(2);
                    sk skVar = new sk();
                    s sVar2 = this.a;
                    sVar2.d.k(((t) sVar2.a.get(0)).a.a, this.b, skVar, new p(this.a, 2));
                    skVar.a();
                    break;
                }
            }
            ax.X(2);
            s sVar3 = this.a;
            Object obj22 = sVar3.g;
            obj22.getClass();
            sVar3.d.t(obj22, new o(sVar3, this.c, 3, (byte[]) null));
        }
        return ffz.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Object obj, ViewGroup viewGroup, int i) {
        super(0);
        this.d = i;
        this.a = sVar;
        this.b = obj;
        this.c = viewGroup;
    }
}
