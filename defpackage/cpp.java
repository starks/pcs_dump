package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cpp implements cqn {
    private final cqn a;
    private final UUID b;
    private final String c;
    private Thread d;

    public cpp(String str, cqn cqnVar, ezn eznVar) {
        this.c = str;
        this.a = cqnVar;
        this.b = cqnVar.d();
        Object obj = eznVar.a;
        this.d = Thread.currentThread();
    }

    @Override // defpackage.cqn
    public final cqn a() {
        return this.a;
    }

    @Override // defpackage.cqn
    public final String b() {
        return this.c;
    }

    @Override // defpackage.cqn
    public final Thread c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cqn, java.lang.Object] */
    @Override // defpackage.cqp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ezn eznVarH = cqa.h();
        ?? r1 = eznVarH.c;
        if (r1 == 0) {
            throw new cpx("Tried to end [" + b() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == r1) {
            cqa.i(eznVarH, r1.a());
            this.d = null;
            return;
        }
        throw new cpy("Tried to end span " + b() + ", but that span is not the current span. The current span is " + r1.b() + ".");
    }

    @Override // defpackage.cqn
    public final UUID d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [cpp] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cqn] */
    /* JADX WARN: Type inference failed for: r6v3, types: [cqn] */
    public final String toString() {
        int i = cqa.a;
        cqn cqnVarA = this;
        int i2 = 0;
        int length = 0;
        while (cqnVarA != null) {
            i2++;
            length += cqnVarA.b().length();
            cqnVarA = cqnVarA.a();
            if (cqnVarA != null) {
                length += 4;
            }
        }
        if (i2 > 250) {
            String[] strArr = new String[i2];
            cqn cqnVarA2 = this;
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                strArr[i3] = cqnVarA2.b();
                cqnVarA2 = cqnVarA2.a();
            }
            String strD = cqa.d(strArr);
            if (!strD.isEmpty()) {
                return strD;
            }
        }
        char[] cArr = new char[length];
        while (this != 0) {
            String strB = this.b();
            length -= strB.length();
            strB.getChars(0, strB.length(), cArr, length);
            this = this.a();
            if (this != 0) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public cpp(String str, UUID uuid, ezn eznVar) {
        this.c = str;
        this.a = null;
        this.b = uuid;
        Object obj = eznVar.a;
        this.d = Thread.currentThread();
    }
}
