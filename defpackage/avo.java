package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avo extends Exception {
    private avo(String str) {
        super(str);
    }

    public static avo a(String str) {
        return new avo(String.format("Unrecognized request to PCS for feature name '%s'", str));
    }

    public static avo b(String str) {
        return new avo(String.format("Unrecognized request to PCS for url '%s'", str));
    }
}
