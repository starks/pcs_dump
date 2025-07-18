package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ehs {
    DOUBLE(eht.DOUBLE, 1),
    FLOAT(eht.FLOAT, 5),
    INT64(eht.LONG, 0),
    UINT64(eht.LONG, 0),
    INT32(eht.INT, 0),
    FIXED64(eht.LONG, 1),
    FIXED32(eht.INT, 5),
    BOOL(eht.BOOLEAN, 0),
    STRING(eht.STRING, 2),
    GROUP(eht.MESSAGE, 3),
    MESSAGE(eht.MESSAGE, 2),
    BYTES(eht.BYTE_STRING, 2),
    UINT32(eht.INT, 0),
    ENUM(eht.ENUM, 0),
    SFIXED32(eht.INT, 5),
    SFIXED64(eht.LONG, 1),
    SINT32(eht.INT, 0),
    SINT64(eht.LONG, 0);

    public final eht s;
    public final int t;

    ehs(eht ehtVar, int i) {
        this.s = ehtVar;
        this.t = i;
    }
}
