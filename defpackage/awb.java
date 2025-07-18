package defpackage;

import android.os.Bundle;
import com.google.android.apps.miphone.astrea.networkusage.ui.user.NetworkUsageLogActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awb extends ajv implements ekk {
    private ekb j;
    private volatile ejl k;
    private final Object l = new Object();
    private boolean m = false;

    public awb() {
        w(new cl(this, 4, null));
    }

    public final void B() {
        if (this.m) {
            return;
        }
        this.m = true;
        ((NetworkUsageLogActivity) this).j = (auh) ((alh) aS()).a.i.b();
    }

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ajv, defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ekj) {
            ekb ekbVarC = a().c();
            this.j = ekbVarC;
            if (ekbVarC.b()) {
                this.j.a = F();
            }
        }
    }

    @Override // defpackage.ae, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ekb ekbVar = this.j;
        if (ekbVar != null) {
            ekbVar.a();
        }
    }

    @Override // defpackage.ekk
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ejl a() {
        if (this.k == null) {
            synchronized (this.l) {
                if (this.k == null) {
                    this.k = new ejl(this);
                }
            }
        }
        return this.k;
    }
}
