package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gi extends is {
    final /* synthetic */ gj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(gj gjVar, View view) {
        super(view);
        this.a = gjVar;
    }

    @Override // defpackage.is
    public final fv a() {
        gk gkVar = this.a.a.k;
        if (gkVar == null) {
            return null;
        }
        return gkVar.a();
    }

    @Override // defpackage.is
    public final boolean b() {
        this.a.a.r();
        return true;
    }

    @Override // defpackage.is
    public final boolean c() {
        gl glVar = this.a.a;
        if (glVar.m != null) {
            return false;
        }
        glVar.o();
        return true;
    }
}
