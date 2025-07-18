package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emp {
    static final emq a;

    static {
        emq eqvVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            eqvVar = (emq) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(emq.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            eqvVar = new eqv();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = eqvVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            emr.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
