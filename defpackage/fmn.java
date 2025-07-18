package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmn implements fmx {
    public final boolean a;

    public fmn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fmx
    public final fnl bb() {
        return null;
    }

    @Override // defpackage.fmx
    public final boolean bc() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
