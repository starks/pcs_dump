package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awn extends awk {
    public final String a;
    public final String b;

    public awn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.awk
    public final awj b() {
        return awj.d;
    }

    @Override // defpackage.awk
    public final boolean c(awk awkVar) {
        if (!(awkVar instanceof awn)) {
            return false;
        }
        awn awnVar = (awn) awkVar;
        return this.a.equals(awnVar.a) && this.b.equals(awnVar.b);
    }

    @Override // defpackage.awk
    public final boolean d(awk awkVar) {
        return c(awkVar);
    }
}
