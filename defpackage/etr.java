package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etr extends euk {
    final /* synthetic */ fbj a;
    final /* synthetic */ etu b;
    final /* synthetic */ ffh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etr(etu etuVar, ffh ffhVar, fbj fbjVar) {
        super(etuVar.b.f);
        this.c = ffhVar;
        this.a = fbjVar;
        this.b = etuVar;
    }

    @Override // defpackage.euk
    public final void a() throws IOException {
        int i = ffg.a;
        if (this.b.a != null) {
            evt.f(this.a);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamA = this.a.a();
                if (inputStreamA == null) {
                    return;
                }
                try {
                    etu etuVar = this.b;
                    etuVar.c.A(etuVar.b.b.e.b(inputStreamA));
                    inputStreamA.close();
                } catch (Throwable th) {
                    evt.g(inputStreamA);
                    throw th;
                }
            } catch (Throwable th2) {
                evt.f(this.a);
                this.b.b(eqo.c.d(th2).e("Failed to read message."));
                return;
            }
        }
    }
}
