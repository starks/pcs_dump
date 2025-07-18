package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dje extends AtomicReference implements Executor, Runnable {
    Executor a;
    Runnable b;
    Thread c;
    fpf d;

    public dje(Executor executor, fpf fpfVar) {
        super(djd.NOT_RUN);
        this.a = executor;
        this.d = fpfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == djd.CANCELLED) {
            this.a = null;
            this.d = null;
            return;
        }
        this.c = Thread.currentThread();
        try {
            fpf fpfVar = this.d;
            fpfVar.getClass();
            Object obj = fpfVar.a;
            if (((euw) obj).b == this.c) {
                this.d = null;
                clq.F(((euw) obj).a == null);
                ((euw) obj).a = runnable;
                Executor executor = this.a;
                executor.getClass();
                ((euw) obj).c = executor;
                this.a = null;
            } else {
                Executor executor2 = this.a;
                executor2.getClass();
                this.a = null;
                this.b = runnable;
                executor2.execute(this);
            }
        } finally {
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.c) {
            Runnable runnable = this.b;
            runnable.getClass();
            this.b = null;
            runnable.run();
            return;
        }
        euw euwVar = new euw();
        euwVar.b = threadCurrentThread;
        fpf fpfVar = this.d;
        fpfVar.getClass();
        fpfVar.a = euwVar;
        this.d = null;
        try {
            Runnable runnable2 = this.b;
            runnable2.getClass();
            this.b = null;
            runnable2.run();
            while (true) {
                ?? r3 = euwVar.a;
                if (r3 == 0 || (r0 = euwVar.c) == 0) {
                    break;
                }
                euwVar.a = null;
                euwVar.c = null;
                r0.execute(r3);
            }
        } finally {
            euwVar.b = null;
        }
    }
}
