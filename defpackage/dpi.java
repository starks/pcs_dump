package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpi extends dpj {
    public static final dpi a = new dpi("AES_128_GCM", 1);
    public static final dpi b = new dpi("AES_256_GCM", 2);
    public static final dpi c = new dpi("CHACHA20_POLY1305", 3);

    private dpi(String str, int i) {
        super(str, i);
    }
}
