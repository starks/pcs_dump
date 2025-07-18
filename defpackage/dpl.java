package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpl extends dpj {
    public static final dpl a = new dpl("DHKEM_P256_HKDF_SHA256", 16);
    public static final dpl b = new dpl("DHKEM_P384_HKDF_SHA384", 17);
    public static final dpl c = new dpl("DHKEM_P521_HKDF_SHA512", 18);
    public static final dpl f = new dpl("DHKEM_X25519_HKDF_SHA256", 32);

    private dpl(String str, int i) {
        super(str, i);
    }
}
