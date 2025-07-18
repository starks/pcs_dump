package defpackage;

import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwg implements dks {
    public final dwm a;
    public final dlh b;
    public final int c;
    public final byte[] d;

    private dwg(dwm dwmVar, dlh dlhVar, int i, byte[] bArr) {
        this.a = dwmVar;
        this.b = dlhVar;
        this.c = i;
        this.d = bArr;
    }

    public static dks c(dls dlsVar) {
        dvv dvvVar = new dvv(dlsVar.d.U(), dlsVar.a.c);
        String strValueOf = String.valueOf(String.valueOf(dlsVar.a.f));
        return new dwg(dvvVar, new dwr(new dwq("HMAC".concat(strValueOf), new SecretKeySpec(dlsVar.e.U(), "HMAC")), dlsVar.a.d), dlsVar.a.d, dlsVar.b.c());
    }

    @Override // defpackage.dks
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.dks
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
