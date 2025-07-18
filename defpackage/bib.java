package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bib extends blv {
    private final byte[] a;

    public bib(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.blv
    public final byte[] aU() {
        return this.a;
    }
}
