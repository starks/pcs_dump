package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ecl {
    NO_SUCH_DATABASE,
    ERRORCODE_NOT_SET;

    public static ecl a(int i) {
        if (i == 0) {
            return ERRORCODE_NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return NO_SUCH_DATABASE;
    }
}
