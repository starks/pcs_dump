package defpackage;

import android.os.Bundle;
import com.google.android.apps.miphone.astrea.survey.service.SurveyConfirmActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfo extends cm implements ekk {
    private ekb j;
    private volatile ejl k;
    private final Object l = new Object();
    private boolean m = false;

    public bfo() {
        w(new cl(this, 6, null));
    }

    @Override // defpackage.ekk
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
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

    public final void C() {
        if (this.m) {
            return;
        }
        this.m = true;
        ((SurveyConfirmActivity) this).k = (bfr) ((alh) aS()).a.H.b();
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
            this.j = ekbVarC;
            if (ekbVarC.b()) {
                this.j.a = F();
            }
        }
    }

    @Override // defpackage.cm, defpackage.ae, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ekb ekbVar = this.j;
        if (ekbVar != null) {
            ekbVar.a();
        }
    }
}
