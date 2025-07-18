package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acr extends fid implements fjc {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(acs acsVar, fhk fhkVar, int i) {
        super(fhkVar);
        this.c = i;
        this.b = acsVar;
    }

    @Override // defpackage.fjc
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((acr) c((fma) obj, (fhk) obj2)).b(ffz.a);
        }
        if (i == 1) {
            return ((acr) c((fma) obj, (fhk) obj2)).b(ffz.a);
        }
        if (i != 2) {
            return ((acr) c((fma) obj, (fhk) obj2)).b(ffz.a);
        }
        return ((acr) c((fma) obj, (fhk) obj2)).b(ffz.a);
    }

    @Override // defpackage.fhx
    public final Object b(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            fhs fhsVar = fhs.a;
            if (this.a != 0) {
                ffh.c(obj);
            } else {
                ffh.c(obj);
                Object obj2 = this.b;
                this.a = 1;
                if (((acs) obj2).b.e(this) == fhsVar) {
                    return fhsVar;
                }
            }
            return ffz.a;
        }
        if (i == 1) {
            fhs fhsVar2 = fhs.a;
            if (this.a != 0) {
                ffh.c(obj);
            } else {
                ffh.c(obj);
                Object obj3 = this.b;
                this.a = 1;
                if (((acs) obj3).b.e(this) == fhsVar2) {
                    return fhsVar2;
                }
            }
            return ffz.a;
        }
        if (i != 2) {
            fhs fhsVar3 = fhs.a;
            if (this.a != 0) {
                ffh.c(obj);
            } else {
                ffh.c(obj);
                Object obj4 = this.b;
                this.a = 1;
                if (((adi) obj4).k(this) == fhsVar3) {
                    return fhsVar3;
                }
            }
            return ffz.a;
        }
        fhs fhsVar4 = fhs.a;
        if (this.a != 0) {
            ffh.c(obj);
        } else {
            ffh.c(obj);
            Object obj5 = this.b;
            this.a = 1;
            if (((adi) obj5).k(this) == fhsVar4) {
                return fhsVar4;
            }
        }
        return ffz.a;
    }

    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? new acr((adi) this.b, fhkVar, 3, (byte[]) null) : new acr((adi) this.b, fhkVar, 2) : new acr((acs) this.b, fhkVar, 1, (byte[]) null) : new acr((acs) this.b, fhkVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(acs acsVar, fhk fhkVar, int i, byte[] bArr) {
        super(fhkVar);
        this.c = i;
        this.b = acsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(adi adiVar, fhk fhkVar, int i) {
        super(fhkVar);
        this.c = i;
        this.b = adiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(adi adiVar, fhk fhkVar, int i, byte[] bArr) {
        super(fhkVar);
        this.c = i;
        this.b = adiVar;
    }
}
