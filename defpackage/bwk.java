package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwk implements bqj {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bwk(aqw aqwVar, atl atlVar, dfa dfaVar, long j, int i) {
        this.e = i;
        this.b = aqwVar;
        this.d = atlVar;
        this.c = dfaVar;
        this.a = j;
    }

    @Override // defpackage.bqj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.a;
            aqw aqwVar = (aqw) this.b;
            aqwVar.e((atl) this.d, (dfa) this.c, aqwVar.a(jElapsedRealtime));
            return;
        }
        bwl bwlVar = (bwl) this.b;
        long jB = bwlVar.b.b() - this.a;
        Object obj = this.d;
        if (obj == null) {
            obj = null;
        }
        bwlVar.a((String) this.c, (dfa) obj, jB);
    }

    public /* synthetic */ bwk(bwl bwlVar, String str, dfa dfaVar, long j, int i) {
        this.e = i;
        this.b = bwlVar;
        this.c = str;
        this.d = dfaVar;
        this.a = j;
    }
}
