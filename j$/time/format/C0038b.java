package j$.time.format;

import java.util.Locale;

/* renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0038b extends y {
    final /* synthetic */ x e;

    C0038b(x xVar) {
        this.e = xVar;
    }

    @Override // j$.time.format.y
    public final String c(j$.time.chrono.n nVar, j$.time.temporal.n nVar2, long j, C c, Locale locale) {
        return this.e.a(j, c);
    }

    @Override // j$.time.format.y
    public final String d(j$.time.temporal.n nVar, long j, C c, Locale locale) {
        return this.e.a(j, c);
    }
}
