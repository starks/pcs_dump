package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ero implements djj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public ero(bkj bkjVar, cbx cbxVar, Executor executor, Context context, int i) {
        this.e = i;
        this.a = bkjVar;
        this.d = cbxVar;
        this.b = executor;
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.djj
    public final void a(Throwable th) {
        if (this.e != 0) {
            this.b.execute(new bkd(th, this.c, 7, (char[]) null));
        } else {
            ((eqc) this.a).a(eqo.k.d(th).e("Authorization future failed"), new epc());
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [bkj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eqd, java.lang.Object] */
    @Override // defpackage.djj
    public final /* synthetic */ void b(Object obj) {
        if (this.e != 0) {
            bcp.c(this.a, (Status) obj, (cbx) this.d);
            return;
        }
        eqo eqoVar = (eqo) obj;
        if (!eqoVar.g()) {
            ((eqc) this.a).a(eqoVar, new epc());
            return;
        }
        Object obj2 = this.b;
        Object obj3 = this.a;
        try {
            eso esoVar = (eso) obj2;
            esoVar.a.set(this.d.a((eqc) obj3, (epc) this.c));
            esoVar.g();
        } catch (RuntimeException e) {
            ((eqc) obj3).a(eqo.k.d(e).e("Failed to start server call after authorization check"), new epc());
        }
    }

    public ero(eqc eqcVar, eso esoVar, epc epcVar, eqd eqdVar, int i) {
        this.e = i;
        this.a = eqcVar;
        this.b = esoVar;
        this.c = epcVar;
        this.d = eqdVar;
    }
}
