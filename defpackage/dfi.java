package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dfi implements eff {
    ERROR_REASON_UNSPECIFIED(0),
    ERROR_REASON_JOB_SCHEDULER(1),
    ERROR_REASON_FILE_DELETION(2),
    ERROR_REASON_IO_EXCEPTION(3),
    ERROR_REASON_RUNTIME_EXCEPTION(4);

    public final int f;

    dfi(int i) {
        this.f = i;
    }

    public static dfi b(int i) {
        if (i == 0) {
            return ERROR_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return ERROR_REASON_JOB_SCHEDULER;
        }
        if (i == 2) {
            return ERROR_REASON_FILE_DELETION;
        }
        if (i == 3) {
            return ERROR_REASON_IO_EXCEPTION;
        }
        if (i != 4) {
            return null;
        }
        return ERROR_REASON_RUNTIME_EXCEPTION;
    }

    @Override // defpackage.eff
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
