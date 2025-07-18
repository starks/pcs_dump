package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atn implements eff {
    CLIENT_UNDEFINED_ERROR(0),
    CLIENT_ERROR_SERVER_INITIATED_ABORT(1),
    CLIENT_ERROR_ENVIRONMENT_INITIATED_ABORT(2),
    CLIENT_INVALID_MESSAGE_RECEIVED(3),
    CLIENT_INVALID_INPUT_VECTOR(4),
    CLIENT_SECURITY_ERROR(5),
    CLIENT_INTERNAL_ERROR(6),
    CLIENT_INTERNAL_ERROR_RUNTIME_EXC(7);

    public final int i;

    atn(int i) {
        this.i = i;
    }

    public static atn b(int i) {
        switch (i) {
            case 0:
                return CLIENT_UNDEFINED_ERROR;
            case 1:
                return CLIENT_ERROR_SERVER_INITIATED_ABORT;
            case 2:
                return CLIENT_ERROR_ENVIRONMENT_INITIATED_ABORT;
            case 3:
                return CLIENT_INVALID_MESSAGE_RECEIVED;
            case 4:
                return CLIENT_INVALID_INPUT_VECTOR;
            case 5:
                return CLIENT_SECURITY_ERROR;
            case 6:
                return CLIENT_INTERNAL_ERROR;
            case 7:
                return CLIENT_INTERNAL_ERROR_RUNTIME_EXC;
            default:
                return null;
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
