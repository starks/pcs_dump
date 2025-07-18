package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awp implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ awp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                awk awkVar = (awk) obj;
                czn cznVar = awt.a;
                if (awkVar instanceof aww) {
                    ((aww) awkVar).c = (fsc) this.a;
                    break;
                }
                break;
            case 1:
                ((cwy) this.a).j(((aww) obj).b);
                break;
            case 2:
                ((asr) this.a).b(bbf.a("variant", (String) obj));
                break;
            case 3:
                int i = bbf.b;
                ((asr) this.a).b(bbf.a("build_id", ((Long) obj).toString()));
                break;
            case 4:
                ((asr) this.a).a(bbf.c("variant", (String) obj));
                break;
            case 5:
                int i2 = bbf.b;
                ((asr) this.a).a(bbf.c("build_id", ((Long) obj).toString()));
                break;
            case 6:
                eea eeaVar = (eea) obj;
                Object obj2 = this.a;
                eeu eeuVar = (eeu) obj2;
                if (!eeuVar.a.isMutable()) {
                    eeuVar.B();
                }
                bbc bbcVar = (bbc) ((asr) obj2).a;
                bbc bbcVar2 = bbc.a;
                eeaVar.getClass();
                bbcVar.b |= 2;
                bbcVar.d = eeaVar;
                break;
            default:
                eea eeaVarR = eea.r((byte[]) obj);
                Object obj3 = this.a;
                eeu eeuVar2 = (eeu) obj3;
                if (!eeuVar2.a.isMutable()) {
                    eeuVar2.B();
                }
                cqz cqzVar = (cqz) ((asr) obj3).a;
                cqz cqzVar2 = cqz.a;
                cqzVar.b |= 16;
                cqzVar.g = eeaVarR;
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
