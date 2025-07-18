package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsz {
    public static final dsz a = new dsz("SHA1");
    public static final dsz b = new dsz("SHA224");
    public static final dsz c = new dsz("SHA256");
    public static final dsz d = new dsz("SHA384");
    public static final dsz e = new dsz("SHA512");
    private final String f;

    private dsz(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
