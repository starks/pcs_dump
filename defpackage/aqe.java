package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.miphone.astrea.fl.brella.service.AstreaExampleStoreService;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqe implements djj {
    final /* synthetic */ String a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ dzi d;
    final /* synthetic */ bdn e;
    final /* synthetic */ AstreaExampleStoreService f;
    final /* synthetic */ bua g;

    public aqe(AstreaExampleStoreService astreaExampleStoreService, String str, byte[] bArr, byte[] bArr2, bua buaVar, dzi dziVar, bdn bdnVar) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.g = buaVar;
        this.d = dziVar;
        this.e = bdnVar;
        this.f = astreaExampleStoreService;
    }

    @Override // defpackage.djj
    public final void a(Throwable th) {
        ((czl) ((czl) AstreaExampleStoreService.a.e()).i("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaExampleStoreService$1", "onFailure", 312, "AstreaExampleStoreService.java")).p("Failed to bind to service");
        this.f.m.e(this.e.c);
        if (th instanceof TimeoutException) {
            this.g.a(30, "Timed out while binding to service.");
        } else {
            this.g.a(5, "Failed to bind to service.");
        }
    }

    @Override // defpackage.djj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            apm apmVar = (apm) ((IInterface) obj);
            if (apmVar.c()) {
                apmVar.b(this.a, this.b, this.c, new aqc(this.g), this.d.toByteArray());
                return;
            }
            dzf dzfVar = this.d.c;
            if (dzfVar == null) {
                dzfVar = dzf.a;
            }
            int iA = dze.a(dzfVar.f);
            if (iA == 0) {
                iA = dze.c;
            }
            if (iA == dze.b) {
                this.g.a(6, "Example store does not support SelectorContext which is required for lightweight client tasks.");
            } else {
                apmVar.a(this.a, this.b, this.c, new aqc(this.g));
            }
        } catch (RemoteException e) {
            this.f.m.e(this.e.c);
            ((czl) ((czl) ((czl) AstreaExampleStoreService.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaExampleStoreService$1", "onSuccess", (char) 303, "AstreaExampleStoreService.java")).p("Failed to delegate startQuery.");
            this.g.a(6, "Failed to delegate startQuery.");
        }
    }
}
