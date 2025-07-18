package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum efr {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(eea.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        eea eeaVar = eea.b;
    }

    efr(Class cls) {
        this.k = cls;
    }
}
