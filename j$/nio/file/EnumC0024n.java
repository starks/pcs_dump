package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0024n implements q, InterfaceC0014d {
    public static final EnumC0024n NOFOLLOW_LINKS;
    private static final /* synthetic */ EnumC0024n[] a;

    static {
        EnumC0024n enumC0024n = new EnumC0024n("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = enumC0024n;
        a = new EnumC0024n[]{enumC0024n};
    }

    public static EnumC0024n valueOf(String str) {
        return (EnumC0024n) Enum.valueOf(EnumC0024n.class, str);
    }

    public static EnumC0024n[] values() {
        return (EnumC0024n[]) a.clone();
    }
}
