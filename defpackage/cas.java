package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cas extends Exception {
    public cas() {
    }

    public cas(String str) {
        super(str);
    }

    public cas(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
