package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoq extends anx {
    public static final aoc a = new aoc("PcsPolicy__enable_consent_check_in_pcs", false);
    public final aof b;

    public aoq(aof aofVar) {
        this.b = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        bfl bflVar = new bfl(null, null);
        bflVar.b(false);
        bflVar.b(vr.c(this.b, a).booleanValue());
        if (bflVar.b == 1) {
            return new aop(bflVar.a);
        }
        throw new IllegalStateException("Missing required properties: enableConsentCheckInPcs");
    }
}
