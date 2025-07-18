package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eer {
    DOUBLE(0, eeq.SCALAR, efr.DOUBLE),
    FLOAT(1, eeq.SCALAR, efr.FLOAT),
    INT64(2, eeq.SCALAR, efr.LONG),
    UINT64(3, eeq.SCALAR, efr.LONG),
    INT32(4, eeq.SCALAR, efr.INT),
    FIXED64(5, eeq.SCALAR, efr.LONG),
    FIXED32(6, eeq.SCALAR, efr.INT),
    BOOL(7, eeq.SCALAR, efr.BOOLEAN),
    STRING(8, eeq.SCALAR, efr.STRING),
    MESSAGE(9, eeq.SCALAR, efr.MESSAGE),
    BYTES(10, eeq.SCALAR, efr.BYTE_STRING),
    UINT32(11, eeq.SCALAR, efr.INT),
    ENUM(12, eeq.SCALAR, efr.ENUM),
    SFIXED32(13, eeq.SCALAR, efr.INT),
    SFIXED64(14, eeq.SCALAR, efr.LONG),
    SINT32(15, eeq.SCALAR, efr.INT),
    SINT64(16, eeq.SCALAR, efr.LONG),
    GROUP(17, eeq.SCALAR, efr.MESSAGE),
    DOUBLE_LIST(18, eeq.VECTOR, efr.DOUBLE),
    FLOAT_LIST(19, eeq.VECTOR, efr.FLOAT),
    INT64_LIST(20, eeq.VECTOR, efr.LONG),
    UINT64_LIST(21, eeq.VECTOR, efr.LONG),
    INT32_LIST(22, eeq.VECTOR, efr.INT),
    FIXED64_LIST(23, eeq.VECTOR, efr.LONG),
    FIXED32_LIST(24, eeq.VECTOR, efr.INT),
    BOOL_LIST(25, eeq.VECTOR, efr.BOOLEAN),
    STRING_LIST(26, eeq.VECTOR, efr.STRING),
    MESSAGE_LIST(27, eeq.VECTOR, efr.MESSAGE),
    BYTES_LIST(28, eeq.VECTOR, efr.BYTE_STRING),
    UINT32_LIST(29, eeq.VECTOR, efr.INT),
    ENUM_LIST(30, eeq.VECTOR, efr.ENUM),
    SFIXED32_LIST(31, eeq.VECTOR, efr.INT),
    SFIXED64_LIST(32, eeq.VECTOR, efr.LONG),
    SINT32_LIST(33, eeq.VECTOR, efr.INT),
    SINT64_LIST(34, eeq.VECTOR, efr.LONG),
    DOUBLE_LIST_PACKED(35, eeq.PACKED_VECTOR, efr.DOUBLE),
    FLOAT_LIST_PACKED(36, eeq.PACKED_VECTOR, efr.FLOAT),
    INT64_LIST_PACKED(37, eeq.PACKED_VECTOR, efr.LONG),
    UINT64_LIST_PACKED(38, eeq.PACKED_VECTOR, efr.LONG),
    INT32_LIST_PACKED(39, eeq.PACKED_VECTOR, efr.INT),
    FIXED64_LIST_PACKED(40, eeq.PACKED_VECTOR, efr.LONG),
    FIXED32_LIST_PACKED(41, eeq.PACKED_VECTOR, efr.INT),
    BOOL_LIST_PACKED(42, eeq.PACKED_VECTOR, efr.BOOLEAN),
    UINT32_LIST_PACKED(43, eeq.PACKED_VECTOR, efr.INT),
    ENUM_LIST_PACKED(44, eeq.PACKED_VECTOR, efr.ENUM),
    SFIXED32_LIST_PACKED(45, eeq.PACKED_VECTOR, efr.INT),
    SFIXED64_LIST_PACKED(46, eeq.PACKED_VECTOR, efr.LONG),
    SINT32_LIST_PACKED(47, eeq.PACKED_VECTOR, efr.INT),
    SINT64_LIST_PACKED(48, eeq.PACKED_VECTOR, efr.LONG),
    GROUP_LIST(49, eeq.VECTOR, efr.MESSAGE),
    MAP(50, eeq.MAP, efr.VOID);

    private static final eer[] aa;
    public final int Z;
    private final eeq ac;

    static {
        eer[] eerVarArrValues = values();
        aa = new eer[eerVarArrValues.length];
        for (eer eerVar : eerVarArrValues) {
            aa[eerVar.Z] = eerVar;
        }
    }

    eer(int i, eeq eeqVar, efr efrVar) {
        this.Z = i;
        this.ac = eeqVar;
        int iOrdinal = eeqVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            Class cls = efrVar.k;
        }
        if (eeqVar == eeq.SCALAR) {
            efr efrVar2 = efr.VOID;
            efrVar.ordinal();
        }
    }
}
