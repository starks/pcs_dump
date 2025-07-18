package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bik {
    public static final bik a = new bik(true, null);
    public final boolean b;
    final String c;

    public bik(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    public static bik a(String str) {
        return new bik(false, str);
    }

    public static bik b(String str, Throwable th) {
        return new bik(false, str);
    }
}
