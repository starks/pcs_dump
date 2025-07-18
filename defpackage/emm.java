package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class emm implements Executor {
    public static final emm a;
    private static final /* synthetic */ emm[] b;

    static {
        emm emmVar = new emm();
        a = emmVar;
        b = new emm[]{emmVar};
    }

    private emm() {
    }

    public static emm[] values() {
        return (emm[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
