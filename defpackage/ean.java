package defpackage;

import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ean extends eae {
    final /* synthetic */ ebe c;
    private final eba d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ean(ebe ebeVar, eba ebaVar) {
        super(ebeVar);
        this.c = ebeVar;
        this.d = ebaVar;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() {
        try {
            super.i();
            this.c.k.a();
            this.c.g.e(this.d);
            this.c.c.d(this.d);
            return null;
        } catch (Exception e) {
            ebe ebeVar = this.c;
            Object[] objArr = {ebeVar.b, this.d, e};
            cbx cbxVar = ebeVar.f;
            cbxVar.a(Level.SEVERE, cbxVar.a, null, "Additional failure occurred while entering FailedState; pirUri=%s, original exception=%s, new exception=%s", objArr);
            return null;
        }
    }

    @Override // defpackage.eaa
    public final String c() {
        if (this.d.getMessage() == null || this.d.getMessage().isEmpty()) {
            return "Failed";
        }
        return String.format(Locale.US, "Failed[%s]", this.d.getMessage());
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.j;
    }
}
