package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmy {
    public static final dmy a = new dmy("ASSUME_AES_GCM");
    public static final dmy b = new dmy("ASSUME_XCHACHA20POLY1305");
    public static final dmy c = new dmy("ASSUME_CHACHA20POLY1305");
    public static final dmy d = new dmy("ASSUME_AES_CTR_HMAC");
    public static final dmy e = new dmy("ASSUME_AES_EAX");
    public static final dmy f = new dmy("ASSUME_AES_GCM_SIV");
    public final String g;

    private dmy(String str) {
        this.g = str;
    }

    public final String toString() {
        return this.g;
    }
}
