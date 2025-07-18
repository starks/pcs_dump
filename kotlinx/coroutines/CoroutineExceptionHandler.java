package kotlinx.coroutines;

import defpackage.fhl;
import defpackage.fhn;
import defpackage.fhq;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends fhn {
    public static final fhl a = fhl.b;

    void handleException(fhq fhqVar, Throwable th);
}
