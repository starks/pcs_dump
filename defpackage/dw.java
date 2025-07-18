package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dw extends jr {
    public final dv a;
    private final avs e;
    private final a f;

    protected dw(a aVar) {
        a aVar2 = new a();
        this.f = aVar2;
        dy dyVar = new dy(this);
        ds dsVar = new ds(aVar);
        if (dsVar.c == null) {
            synchronized (ds.a) {
                if (ds.b == null) {
                    ds.b = Executors.newFixedThreadPool(2);
                }
            }
            dsVar.c = ds.b;
        }
        dv dvVar = new dv(dyVar, new bnz(dsVar.c, dsVar.d));
        this.a = dvVar;
        dvVar.c.add(aVar2);
    }

    @Override // defpackage.jr
    public final int a() {
        return this.a.e.size();
    }

    public final Object b(int i) {
        return this.a.e.get(i);
    }

    @Override // defpackage.jr
    public final int c(int i) {
        return ((awk) b(i)).b().a();
    }

    @Override // defpackage.jr
    public final /* bridge */ /* synthetic */ km d(final ViewGroup viewGroup, int i) {
        cxc cxcVar = awj.e;
        int i2 = ((cyp) cxcVar).c;
        int i3 = 0;
        while (i3 < i2) {
            awj awjVar = (awj) cxcVar.get(i3);
            i3++;
            if (awjVar.a() == i) {
                final awe aweVarB = awjVar.b(viewGroup, this.e);
                aweVarB.a.setOnClickListener(new View.OnClickListener() { // from class: awx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        awe aweVar = aweVarB;
                        if (aweVar.b() != -1) {
                            ((awk) this.c.b(aweVar.b())).e(viewGroup.getContext());
                        }
                    }
                });
                return aweVarB;
            }
        }
        throw new AssertionError(String.format("Unknown view type %d", Integer.valueOf(i)));
    }

    @Override // defpackage.jr
    public final /* bridge */ /* synthetic */ void e(km kmVar, int i) {
        ((awe) kmVar).C((awk) b(i));
    }

    public dw(avs avsVar) {
        this(new a(null, null, null));
        this.e = avsVar;
    }
}
