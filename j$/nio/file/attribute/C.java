package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class C {
    public static final C GROUP_EXECUTE;
    public static final C GROUP_READ;
    public static final C GROUP_WRITE;
    public static final C OTHERS_EXECUTE;
    public static final C OTHERS_READ;
    public static final C OTHERS_WRITE;
    public static final C OWNER_EXECUTE;
    public static final C OWNER_READ;
    public static final C OWNER_WRITE;
    private static final /* synthetic */ C[] a;

    static {
        C c = new C("OWNER_READ", 0);
        OWNER_READ = c;
        C c2 = new C("OWNER_WRITE", 1);
        OWNER_WRITE = c2;
        C c3 = new C("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = c3;
        C c4 = new C("GROUP_READ", 3);
        GROUP_READ = c4;
        C c5 = new C("GROUP_WRITE", 4);
        GROUP_WRITE = c5;
        C c6 = new C("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = c6;
        C c7 = new C("OTHERS_READ", 6);
        OTHERS_READ = c7;
        C c8 = new C("OTHERS_WRITE", 7);
        OTHERS_WRITE = c8;
        C c9 = new C("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = c9;
        a = new C[]{c, c2, c3, c4, c5, c6, c7, c8, c9};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) a.clone();
    }
}
