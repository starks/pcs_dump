package defpackage;

import com.google.android.apps.miphone.astrea.fl.brella.service.AstreaExampleStoreService;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aqj extends bqe implements ekk {
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
            AstreaExampleStoreService astreaExampleStoreService = (AstreaExampleStoreService) this;
            astreaExampleStoreService.b = cxg.n("com.google.android.apps.miphone.aiai.EXAMPLE_STORE_V1", "com.google.android.apps.miphone.odad.EXAMPLE_STORE_V1");
            alk alkVar = (alk) objAS;
            astreaExampleStoreService.c = (ara) alkVar.a.M.b();
            astreaExampleStoreService.d = alkVar.a.b();
            all allVar = alkVar.a;
            aoq aoqVar = new aoq(((fsc) allVar.e.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) allVar.f.b()));
            aof aofVar = aoqVar.b;
            ((aok) aofVar).d.s(new aml(aoqVar, 4));
            astreaExampleStoreService.e = aoqVar;
            astreaExampleStoreService.f = (cyg) alkVar.a.N.b();
            astreaExampleStoreService.g = "com.google.android.as";
            astreaExampleStoreService.h = "com.google.android.odad";
            astreaExampleStoreService.n = alkVar.a.c();
            astreaExampleStoreService.o = (aoo) alkVar.a.O.b();
            astreaExampleStoreService.i = (Executor) alkVar.a.y.b();
            astreaExampleStoreService.p = (dke) alkVar.a.K.b();
            astreaExampleStoreService.j = (aqr) alkVar.a.b.b();
            astreaExampleStoreService.q = (auh) alkVar.a.i.b();
            astreaExampleStoreService.k = Optional.empty();
            astreaExampleStoreService.l = ann.a();
        }
        super.onCreate();
    }
}
