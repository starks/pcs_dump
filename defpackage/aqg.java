package defpackage;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.miphone.astrea.fl.brella.service.AstreaResultHandlingService;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqg implements djj {
    final /* synthetic */ bqg a;
    final /* synthetic */ List b;
    final /* synthetic */ String c;
    final /* synthetic */ AstreaResultHandlingService d;
    final /* synthetic */ brb e;

    public aqg(AstreaResultHandlingService astreaResultHandlingService, bqg bqgVar, List list, brb brbVar, String str) {
        this.a = bqgVar;
        this.b = list;
        this.e = brbVar;
        this.c = str;
        this.d = astreaResultHandlingService;
    }

    @Override // defpackage.djj
    public final void a(Throwable th) {
        ((czl) ((czl) AstreaResultHandlingService.a.e()).i("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaResultHandlingService$1", "onFailure", 160, "AstreaResultHandlingService.java")).p("Failed to bind to service");
        this.d.h.e(this.c);
        this.e.b(Status.c);
    }

    @Override // defpackage.djj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            aps apsVar = (aps) ((IInterface) obj);
            bqg bqgVar = this.a;
            apx apxVar = new apx();
            int i = bqgVar.e;
            clq.v(apy.b(i));
            if (apxVar.f != null) {
                throw new IllegalArgumentException("Attestation is not supported for personalization or local computation.");
            }
            apxVar.e = i;
            int i2 = bqgVar.b;
            boolean z = bqgVar.c;
            apxVar.b = i2;
            apxVar.c = z;
            String str = bqgVar.a;
            str.getClass();
            clq.v(!str.isEmpty());
            apxVar.a = str;
            String str2 = bqgVar.d;
            if (str2 != null) {
                clq.v(!str2.isEmpty());
                apxVar.d = str2;
            }
            Uri uri = bqgVar.f;
            Uri uri2 = bqgVar.k;
            Uri uri3 = bqgVar.i;
            if (uri != null && uri2 != null && uri3 != null) {
                apy.a(uri);
                apy.a(uri2);
                apy.a(uri3);
                apxVar.e = 3;
                apxVar.f = uri;
                apxVar.j = uri2;
                apxVar.g = uri3;
            }
            bqp bqpVar = bqgVar.j;
            if (bqpVar != null) {
                bqo bqoVar = new bqo();
                long j = bqpVar.b;
                bqoVar.b = j;
                int i3 = bqpVar.a;
                bqoVar.a = i3;
                apxVar.h = new aqd(i3, j);
            }
            byte[] bArrC = bqgVar.c();
            bArrC.getClass();
            apxVar.i = Arrays.copyOf(bArrC, bArrC.length);
            apy apyVar = new apy(apxVar.a, apxVar.b, apxVar.c, apxVar.d, apxVar.e, apxVar.f, null, null, 0L, apxVar.g, apxVar.h, apxVar.i, apxVar.j);
            List<bqb> list = this.b;
            ArrayList arrayList = new ArrayList();
            for (bqb bqbVar : list) {
                cos cosVar = new cos();
                cosVar.b = bqbVar.a;
                int i4 = bqbVar.c;
                cosVar.a = i4;
                cosVar.d = bqbVar.d;
                cosVar.c = bqbVar.b;
                arrayList.add(new apk((String) cosVar.b, (byte[]) cosVar.c, i4, (byte[]) cosVar.d, null));
            }
            apsVar.a(apyVar, arrayList, new apv(this.e));
        } catch (RemoteException e) {
            this.d.h.e(this.c);
            ((czl) ((czl) ((czl) AstreaResultHandlingService.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaResultHandlingService$1", "onSuccess", (char) 153, "AstreaResultHandlingService.java")).p("Failed to delegate handleResult.");
            this.e.b(Status.c);
        }
    }
}
