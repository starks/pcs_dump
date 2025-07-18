package defpackage;

import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cqd implements Consumer {
    public final /* synthetic */ UUID a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ cqd(UUID uuid, Exception exc, int i) {
        this.c = i;
        this.a = uuid;
        this.b = exc;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.c == 0) {
            ((cqq) obj).a();
        } else {
            cpq cpqVar = cqc.a;
            ((cqq) obj).a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.c != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
