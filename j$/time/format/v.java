package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* loaded from: classes2.dex */
final class v {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    v(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.v.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    final void a() {
        this.c--;
    }

    final z b() {
        return this.b.b();
    }

    final Locale c() {
        return this.b.c();
    }

    final TemporalAccessor d() {
        return this.a;
    }

    final Long e(j$.time.temporal.n nVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.e(nVar)) {
            return Long.valueOf(temporalAccessor.I(nVar));
        }
        return null;
    }

    final Object f(j$.time.temporal.p pVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objO = temporalAccessor.O(pVar);
        if (objO == null && this.c == 0) {
            throw new j$.time.c(j$.time.f.a("Unable to extract ", String.valueOf(pVar), " from temporal ", String.valueOf(temporalAccessor)));
        }
        return objO;
    }

    final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
