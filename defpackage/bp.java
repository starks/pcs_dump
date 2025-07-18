package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bp implements ys, aey, aad {
    public za a = null;
    public aex b = null;
    private final ab c;
    private final Runnable d;
    private final fsc e;

    public bp(ab abVar, fsc fscVar, Runnable runnable) {
        this.c = abVar;
        this.e = fscVar;
        this.d = runnable;
    }

    @Override // defpackage.yz
    public final yw E() {
        b();
        return this.a;
    }

    @Override // defpackage.ys
    public final aag F() {
        Application application;
        Context applicationContext = this.c.s().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        aah aahVar = new aah();
        if (application != null) {
            aahVar.a(zy.a, application);
        }
        aahVar.a(zs.a, this.c);
        aahVar.a(zs.b, this);
        Bundle bundle = this.c.l;
        if (bundle != null) {
            aahVar.a(zs.c, bundle);
        }
        return aahVar;
    }

    final void a(yu yuVar) {
        this.a.d(yuVar);
    }

    @Override // defpackage.aey
    public final fsc aj() {
        b();
        return this.b.b;
    }

    @Override // defpackage.aad
    public final fsc ak() {
        b();
        return this.e;
    }

    final void b() {
        if (this.a == null) {
            this.a = new za(this);
            aex aexVarA = aex.a(this);
            this.b = aexVarA;
            aexVarA.b();
            this.d.run();
        }
    }
}
