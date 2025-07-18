package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxl {
    private final String a;
    private final edl b;
    private final byte[] c;
    private int d;
    private byte[] e;

    public bxl(String str, edl edlVar, dzi dziVar) {
        this.a = str;
        this.b = edlVar;
        this.c = dziVar == null ? null : dziVar.toByteArray();
        this.d = 0;
        this.e = null;
    }

    public final synchronized bqb a() {
        bqa bqaVar;
        bqaVar = new bqa();
        bqaVar.a = this.a;
        bqaVar.b = this.b.toByteArray();
        bqaVar.c = this.d;
        bqaVar.d = this.e;
        bqaVar.e = this.c;
        return bqaVar.a();
    }

    public final synchronized void b(byte[] bArr) {
        this.d++;
        this.e = Arrays.copyOf(bArr, bArr.length);
    }
}
