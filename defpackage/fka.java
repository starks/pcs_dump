package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fka extends fkf {
    public abstract Random a();

    @Override // defpackage.fkf
    public final int b() {
        return a().nextInt(2147418112);
    }
}
