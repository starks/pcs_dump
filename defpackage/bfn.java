package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfn extends anx {
    static final aoc a = new aoc("PcsSurvey__enable_survey", false);
    public final aof b;

    public bfn(aof aofVar) {
        this.b = aofVar;
    }

    @Override // defpackage.anx
    protected final /* bridge */ /* synthetic */ Object a() {
        bfl bflVar = new bfl(null);
        bflVar.a(false);
        bflVar.a(vr.c(this.b, a).booleanValue());
        if (bflVar.b == 1) {
            return new bfm(bflVar.a);
        }
        throw new IllegalStateException("Missing required properties: enableSurvey");
    }
}
