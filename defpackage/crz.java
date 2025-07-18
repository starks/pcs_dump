package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crz extends cre {
    final /* synthetic */ crl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crz(csd csdVar, CharSequence charSequence, crl crlVar) {
        super(csdVar, charSequence);
        this.g = crlVar;
    }

    @Override // defpackage.cre
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.cre
    public final int b(int i) {
        CharSequence charSequence = this.b;
        int length = charSequence.length();
        clq.L(i, length);
        while (i < length) {
            if (this.g.b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
