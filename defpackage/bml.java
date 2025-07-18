package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bml {
    private static bml b;
    public bmm a;

    private bml() {
    }

    public static synchronized bml a() {
        if (b == null) {
            b = new bml();
        }
        return b;
    }
}
