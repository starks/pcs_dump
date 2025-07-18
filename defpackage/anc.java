package defpackage;

import android.app.Service;
import com.google.android.apps.miphone.astrea.ai.service.GenAiInferenceService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anc extends Service implements ekk {
    private volatile ekd a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ekk
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ekd a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new ekd(this);
                }
            }
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            GenAiInferenceService genAiInferenceService = (GenAiInferenceService) this;
            alk alkVar = (alk) aS();
            all allVar = alkVar.a;
            amm ammVar = new amm(((fsc) allVar.e.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) allVar.f.b()));
            aof aofVar = ammVar.c;
            ((aok) aofVar).d.s(new aml(ammVar, 0));
            genAiInferenceService.b = ammVar;
            genAiInferenceService.c = (dke) alkVar.a.J.b();
        }
        super.onCreate();
    }
}
