package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewc extends enf {
    private final Map a;

    public ewc(Map map) {
        this.a = map;
    }

    @Override // defpackage.enf
    public final exo a(String str) {
        return (exo) this.a.get(str);
    }
}
