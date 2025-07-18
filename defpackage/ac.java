package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ac implements tj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ac(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.tj
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((ae) this.a).e.aw();
            return;
        }
        if (i == 1) {
            ((ae) this.a).e.aw();
            return;
        }
        if (i == 2) {
            Configuration configuration = (Configuration) obj;
            ax axVar = (ax) this.a;
            if (axVar.Y()) {
                axVar.p(configuration, false);
                return;
            }
            return;
        }
        if (i == 3) {
            Integer num = (Integer) obj;
            ax axVar2 = (ax) this.a;
            if (axVar2.Y() && num.intValue() == 80) {
                axVar2.s(false);
                return;
            }
            return;
        }
        if (i != 4) {
            cfg cfgVar = (cfg) obj;
            ax axVar3 = (ax) this.a;
            if (axVar3.Y()) {
                axVar3.y(cfgVar.a, false);
                return;
            }
            return;
        }
        cfg cfgVar2 = (cfg) obj;
        ax axVar4 = (ax) this.a;
        if (axVar4.Y()) {
            axVar4.t(cfgVar2.a, false);
        }
    }
}
