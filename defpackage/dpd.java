package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpd {
    public static final dpd a = new dpd("COMPRESSED");
    public static final dpd b = new dpd("UNCOMPRESSED");
    public static final dpd c = new dpd("LEGACY_UNCOMPRESSED");
    private final String d;

    private dpd(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
