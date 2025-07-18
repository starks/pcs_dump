package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwa {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public fwa f;
    public fwa g;

    public fwa() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final fwa a() {
        fwa fwaVar = this.f;
        fwa fwaVar2 = fwaVar != this ? fwaVar : null;
        fwa fwaVar3 = this.g;
        fwaVar3.getClass();
        fwaVar3.f = fwaVar;
        fwa fwaVar4 = this.f;
        fwaVar4.getClass();
        fwaVar4.g = fwaVar3;
        this.f = null;
        this.g = null;
        return fwaVar2;
    }

    public final fwa b() {
        this.d = true;
        return new fwa(this.a, this.b, this.c, true);
    }

    public final void c(fwa fwaVar, int i) {
        if (!fwaVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = fwaVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (fwaVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = fwaVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = fwaVar.a;
            ffh.ae(bArr, bArr, 0, i4, i2);
            i2 = fwaVar.c - fwaVar.b;
            fwaVar.c = i2;
            fwaVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = fwaVar.a;
        int i5 = this.b;
        ffh.ae(bArr2, bArr3, i2, i5, i5 + i);
        fwaVar.c += i;
        this.b += i;
    }

    public final void d(fwa fwaVar) {
        fwaVar.g = this;
        fwaVar.f = this.f;
        fwa fwaVar2 = this.f;
        fwaVar2.getClass();
        fwaVar2.g = fwaVar;
        this.f = fwaVar;
    }

    public fwa(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
