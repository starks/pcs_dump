package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doi implements dks {
    private final /* synthetic */ int a;

    public doi(int i) {
        this.a = i;
    }

    public static dks c(dks dksVar, dwt dwtVar) {
        return new doi(dwtVar.c(), 0);
    }

    @Override // defpackage.dks
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.dks
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public doi(byte[] bArr, int i) {
        this.a = i;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
    }

    public doi(byte[] bArr, dwt dwtVar, int i) {
        this.a = i;
        new dwo(bArr);
        dwtVar.c();
    }

    public doi(byte[] bArr, int i, byte[] bArr2) {
        this.a = i;
        new dod(bArr);
    }

    public doi(byte[] bArr, int i, char[] cArr) {
        this.a = i;
        new doh(bArr);
    }
}
