package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface fbl {
    public static final fbl a;

    static {
        fbl euhVar;
        try {
            euhVar = new ewb(Class.forName("java.time.Instant"));
        } catch (ClassNotFoundException unused) {
            euhVar = new euh();
        }
        a = euhVar;
    }

    long a();
}
