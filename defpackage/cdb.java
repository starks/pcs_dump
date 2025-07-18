package defpackage;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cdb implements dww {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cdb(Object obj, byte[] bArr, int i) {
        this.c = i;
        this.b = obj;
        this.a = bArr;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.dww, java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            return Boolean.valueOf(((cdg) this.b).o.a(this.a));
        }
        if (i == 1) {
            byte[] bArr = this.a;
            Object obj = this.b;
            try {
                bsp bspVar = ((brl) obj).a;
                ?? r2 = bspVar.a;
                Object obj2 = bspVar.c;
                Object obj3 = bspVar.b;
                return new brj(((bve) r2.getValue()).a(bArr, new bpe(obj2), ((cde) obj3).c, ((cde) obj3).d, ((cde) obj3).h), ((brl) obj).b);
            } catch (RemoteException e) {
                throw new brk(e);
            }
        }
        byte[] bArr2 = this.a;
        try {
            een eenVar = een.a;
            egr egrVar = egr.a;
            dxh dxhVar = (dxh) efb.parseFrom(dxh.a, bArr2, een.a);
            bss bssVar = ((dwy) this.b).a;
            fsc fscVar = bssVar.d;
            ExecutorService executorService = bssVar.a;
            dxb dxbVar = bssVar.b;
            cde cdeVar = bssVar.c;
            return new dxe(dxhVar, fscVar, executorService, dxbVar, cdeVar.a, cdeVar.b, cdeVar.c, cdeVar.d, cdeVar.e, cdeVar.f, cdeVar.g, cdeVar.h);
        } catch (efp e2) {
            throw new dwx("invalid JniHttpRequest", e2);
        }
    }
}
