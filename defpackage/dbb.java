package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dbb implements dba {
    DEFAULT,
    NO_OP,
    SIMPLE_CLASSNAME;

    @Override // defpackage.dba
    public final /* synthetic */ boolean a(czw czwVar, StringBuilder sb) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                throw null;
            }
            throw null;
        }
        if (czwVar == czw.a) {
            return false;
        }
        sb.append(czwVar.b());
        sb.append('.');
        sb.append(czwVar.d());
        sb.append(':');
        sb.append(czwVar.a());
        return true;
    }
}
