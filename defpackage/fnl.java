package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnl extends fos implements fmx {
    @Override // defpackage.fmx
    public final boolean bc() {
        return true;
    }

    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object objF = f();
        objF.getClass();
        boolean z = true;
        for (fou fouVarH = (fou) objF; !fjs.c(fouVarH, this); fouVarH = fouVarH.h()) {
            if (fouVarH instanceof fne) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fouVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.fou
    public final String toString() {
        return fmd.b ? c("Active") : super.toString();
    }

    @Override // defpackage.fmx
    public final fnl bb() {
        return this;
    }
}
