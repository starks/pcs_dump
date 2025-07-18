package defpackage;

import com.google.android.apps.miphone.astrea.fl.brella.service.AstreaResultHandlingService;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aqk extends bqn implements ekk {
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
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            Object objAS = aS();
            AstreaResultHandlingService astreaResultHandlingService = (AstreaResultHandlingService) this;
            astreaResultHandlingService.b = cxg.n("com.google.android.apps.miphone.aiai.COMPUTATION_RESULT_V1", "com.google.android.apps.miphone.odad.COMPUTATION_RESULT_V1");
            astreaResultHandlingService.c = "com.google.android.as";
            astreaResultHandlingService.d = "com.google.android.odad";
            alk alkVar = (alk) objAS;
            astreaResultHandlingService.e = (Executor) alkVar.a.y.b();
            astreaResultHandlingService.f = (aqr) alkVar.a.b.b();
            astreaResultHandlingService.g = Optional.empty();
            astreaResultHandlingService.i = (auh) alkVar.a.i.b();
        }
        super.onCreate();
    }
}
