package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdt extends cm implements ekk {
    private ekb k;
    private volatile ejl l;
    private final Object m = new Object();
    public boolean j = false;

    public bdt() {
        w(new cl(this, 5, null));
    }

    @Override // defpackage.ekk
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ejl a() {
        if (this.l == null) {
            synchronized (this.m) {
                if (this.l == null) {
                    this.l = new ejl(this);
                }
            }
        }
        return this.l;
    }

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ekj) {
            ekb ekbVarC = a().c();
            this.k = ekbVarC;
            if (ekbVarC.b()) {
                this.k.a = F();
            }
        }
    }

    @Override // defpackage.cm, defpackage.ae, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ekb ekbVar = this.k;
        if (ekbVar != null) {
            ekbVar.a();
        }
    }
}
