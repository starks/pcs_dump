package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class crl implements crw {
    protected crl() {
    }

    @Override // defpackage.crw
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public final int c(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }
}
