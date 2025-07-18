package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkt extends bzo implements bjb, bjc {
    private static final yt h = bzl.c;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final blh d;
    public bzt e;
    public bke f;
    public final yt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkt(Context context, Handler handler, blh blhVar) {
        super(null);
        yt ytVar = h;
        this.a = context;
        this.b = handler;
        this.d = blhVar;
        this.c = blhVar.b;
        this.g = ytVar;
    }

    @Override // defpackage.bjx
    public final void a(int i) {
        bke bkeVar = this.f;
        bkb bkbVar = (bkb) bkeVar.f.l.get(bkeVar.b);
        if (bkbVar != null) {
            if (bkbVar.f) {
                bkbVar.l(new bho(17));
            } else {
                bkbVar.a(i);
            }
        }
    }

    @Override // defpackage.bjx
    public final void b() {
        this.e.H(this);
    }

    @Override // defpackage.bzo, defpackage.bzp
    public final void c(bzv bzvVar) {
        this.b.post(new bkd(this, bzvVar, 3, (byte[]) null));
    }

    @Override // defpackage.bkn
    public final void i(bho bhoVar) {
        this.f.b(bhoVar);
    }
}
