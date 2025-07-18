package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ecb {
    INVALID_CHUNK_RANGE,
    FILE_NOT_YET_SELECTED,
    PROCESSING_CHUNK_ERROR,
    ERRORCODE_NOT_SET;

    public static ecb a(int i) {
        if (i == 0) {
            return ERRORCODE_NOT_SET;
        }
        if (i == 1) {
            return INVALID_CHUNK_RANGE;
        }
        if (i == 2) {
            return FILE_NOT_YET_SELECTED;
        }
        if (i != 3) {
            return null;
        }
        return PROCESSING_CHUNK_ERROR;
    }
}
