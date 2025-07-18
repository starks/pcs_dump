package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frb implements Closeable {
    public final fqx a;
    public final fqv b;
    public final String c;
    public final int d;
    public final fqn e;
    public final fqo f;
    public final frd g;
    public final frb h;
    public final frb i;
    public final frb j;
    public final long k;
    public final long l;
    public final frs m;

    public frb(fqx fqxVar, fqv fqvVar, String str, int i, fqn fqnVar, fqo fqoVar, frd frdVar, frb frbVar, frb frbVar2, frb frbVar3, long j, long j2, frs frsVar) {
        this.a = fqxVar;
        this.b = fqvVar;
        this.c = str;
        this.d = i;
        this.e = fqnVar;
        this.f = fqoVar;
        this.g = frdVar;
        this.h = frbVar;
        this.i = frbVar2;
        this.j = frbVar3;
        this.k = j;
        this.l = j2;
        this.m = frsVar;
    }

    public static /* synthetic */ String a(frb frbVar, String str) {
        String strB = frbVar.f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        frd frdVar = this.g;
        if (frdVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        frdVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
