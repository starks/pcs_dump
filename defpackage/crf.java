package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crf extends cri {
    public static final crl a = new crf();

    public crf() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.crl
    public final boolean b(char c) {
        return c <= 127;
    }
}
