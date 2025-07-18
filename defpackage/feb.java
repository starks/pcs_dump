package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feb implements eov {
    private final egi a;

    public feb(egi egiVar) {
        this.a = egiVar;
    }

    @Override // defpackage.eov
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return this.a.getParserForType().c(bArr, fec.a);
        } catch (efp e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.eov
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((egi) obj).toByteArray();
    }
}
