package j$.util.stream;

/* loaded from: classes2.dex */
final class a0 implements Runnable {
    public final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public /* synthetic */ a0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c;
                try {
                    ((Runnable) this.b).run();
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                Stream stream = (Stream) this.c;
                try {
                    ((Stream) this.b).close();
                    stream.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        stream.close();
                    } catch (Throwable th4) {
                        try {
                            th3.addSuppressed(th4);
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
