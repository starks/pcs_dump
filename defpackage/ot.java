package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ot extends op {
    final /* synthetic */ ou c;

    public ot(ou ouVar) {
        this.c = ouVar;
    }

    @Override // defpackage.op
    protected final String b() {
        oq oqVar = (oq) this.c.a.get();
        if (oqVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + oqVar.a + "]";
    }
}
