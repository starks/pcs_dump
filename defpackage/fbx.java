package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbx implements fbe {
    private final /* synthetic */ int a;

    public fbx(int i) {
        this.a = i;
    }

    @Override // defpackage.fbe
    public final /* synthetic */ Object a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.a == 0) {
            return Executors.newCachedThreadPool(evt.j("grpc-okhttp-%d"));
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, evt.j("grpc-timer-%d"));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, true);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.fbe
    public final /* synthetic */ void b(Object obj) {
        if (this.a != 0) {
            ((ScheduledExecutorService) obj).shutdown();
        } else {
            ((ExecutorService) obj).shutdown();
        }
    }
}
