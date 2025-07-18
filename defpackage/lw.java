package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lw extends fjt implements fin {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [aad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [aey, java.lang.Object] */
    @Override // defpackage.fin
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            return new acv(((lx) obj).i, new lw(obj, 1));
        }
        if (i == 1) {
            ((lx) this.a).reportFullyDrawn();
            return ffz.a;
        }
        int i2 = 3;
        if (i == 2) {
            mk mkVar = new mk(new ls(this.a, i2));
            boolean zC = fjs.c(Looper.myLooper(), Looper.getMainLooper());
            Object obj2 = this.a;
            if (zC) {
                ((lx) obj2).v(mkVar);
                return mkVar;
            }
            new Handler(Looper.getMainLooper()).post(new o(obj2, mkVar, 11, (byte[]) null));
            return mkVar;
        }
        if (i == 3) {
            ((mk) this.a).b();
            return ffz.a;
        }
        if (i == 4) {
            ((mk) this.a).a();
            return ffz.a;
        }
        if (i == 5) {
            return zs.a(this.a);
        }
        ?? r5 = this.a;
        r5.E().b(new aeu(r5));
        return ffz.a;
    }
}
