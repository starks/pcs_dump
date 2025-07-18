package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class diy implements Executor {
    public static final diy a;
    private static final /* synthetic */ diy[] b;

    static {
        diy diyVar = new diy();
        a = diyVar;
        b = new diy[]{diyVar};
    }

    private diy() {
    }

    public static diy[] values() {
        return (diy[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
