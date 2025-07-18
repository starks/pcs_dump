package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evq implements fbe {
    @Override // defpackage.fbe
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(evt.j("grpc-default-executor-%d"));
    }

    @Override // defpackage.fbe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
