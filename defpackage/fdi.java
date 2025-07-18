package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fdi {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INVALID_STREAM(1),
    UNSUPPORTED_VERSION(1),
    STREAM_IN_USE(1),
    STREAM_ALREADY_CLOSED(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_CLOSED(5),
    FRAME_TOO_LARGE(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13),
    INVALID_CREDENTIALS(-1);

    public final int s;

    fdi(int i) {
        this.s = i;
    }

    public static fdi a(int i) {
        for (fdi fdiVar : values()) {
            if (fdiVar.s == i) {
                return fdiVar;
            }
        }
        return null;
    }
}
