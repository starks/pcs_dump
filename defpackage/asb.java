package defpackage;

import com.google.android.apps.miphone.astrea.grpc.AstreaGrpcService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class asb extends zc implements ekk {
    private volatile ekd a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ekk
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.zc, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            AstreaGrpcService astreaGrpcService = (AstreaGrpcService) this;
            alk alkVar = (alk) aS();
            astreaGrpcService.a = (bot) alkVar.a.ao.b();
            astreaGrpcService.b = (wh) alkVar.a.ap.b();
        }
        super.onCreate();
    }
}
