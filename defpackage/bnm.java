package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnm {
    public final Context a;
    public final bnr b;
    public final boi c;
    public final fuu d;
    private final Handler e;
    private final Map f;
    private final bnj g;
    private boolean h = false;
    private final bno i;

    public bnm(Context context, bno bnoVar, Handler handler, Map map, bnj bnjVar, boi boiVar, bnr bnrVar, fuu fuuVar) {
        this.a = context;
        this.i = bnoVar;
        this.e = handler;
        this.f = map;
        this.g = bnjVar;
        this.c = boiVar;
        this.b = bnrVar;
        this.d = fuuVar;
    }

    final void a(String str) {
        synchronized (this) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.e.post(new bkd(this, str, 4));
            } catch (RuntimeException unused) {
            }
        }
    }

    final void b() {
        long jA = this.g.a();
        this.e.postAtTime(new bnk(this, jA, this, 2), this, jA + SystemClock.uptimeMillis());
        bno bnoVar = this.i;
        String strA = bnoVar.a(this.f);
        bnoVar.close();
        this.e.removeCallbacksAndMessages(this);
        a(strA);
    }
}
