package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agr implements agz {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public agr(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.agz
    public final void b(ahc ahcVar) {
        ahcVar.F(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.agz
    public final /* synthetic */ void e(ahc ahcVar, boolean z) {
        us.f(this, ahcVar);
    }

    @Override // defpackage.agz
    public final void f(ahc ahcVar) {
        ahcVar.F(this);
        ahcVar.D(this);
    }

    @Override // defpackage.agz
    public final /* synthetic */ void g(ahc ahcVar, boolean z) {
        us.g(this, ahcVar);
    }

    @Override // defpackage.agz
    public final void c() {
    }

    @Override // defpackage.agz
    public final void d() {
    }

    @Override // defpackage.agz
    public final void a(ahc ahcVar) {
    }
}
