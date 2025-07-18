package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum evr {
    NO_ERROR(0, eqo.l),
    PROTOCOL_ERROR(1, eqo.k),
    INTERNAL_ERROR(2, eqo.k),
    FLOW_CONTROL_ERROR(3, eqo.k),
    SETTINGS_TIMEOUT(4, eqo.k),
    STREAM_CLOSED(5, eqo.k),
    FRAME_SIZE_ERROR(6, eqo.k),
    REFUSED_STREAM(7, eqo.l),
    CANCEL(8, eqo.c),
    COMPRESSION_ERROR(9, eqo.k),
    CONNECT_ERROR(10, eqo.k),
    ENHANCE_YOUR_CALM(11, eqo.h.e("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, eqo.g.e("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, eqo.d);

    public static final evr[] o;
    public final eqo p;
    private final int r;

    static {
        evr[] evrVarArrValues = values();
        evr[] evrVarArr = new evr[((int) evrVarArrValues[evrVarArrValues.length - 1].a()) + 1];
        for (evr evrVar : evrVarArrValues) {
            evrVarArr[(int) evrVar.a()] = evrVar;
        }
        o = evrVarArr;
    }

    evr(int i, eqo eqoVar) {
        this.r = i;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        String str = eqoVar.p;
        if (str != null) {
            strConcat = strConcat + " (" + str + ")";
        }
        this.p = eqoVar.e(strConcat);
    }

    public final long a() {
        return this.r;
    }
}
