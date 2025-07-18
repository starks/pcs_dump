package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fbr implements Runnable {
    final /* synthetic */ fbs c;

    public fbr(fbs fbsVar) {
        this.c = fbsVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            if (this.c.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.c.c.b(e);
        }
    }
}
