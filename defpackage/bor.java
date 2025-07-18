package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bor implements bjx, bkn {
    public final Queue a = new ArrayDeque();
    public Status b = new Status(17, "None of the GmsClient connection callbacks have been called.");

    private final void c() {
        while (true) {
            Consumer consumer = (Consumer) this.a.poll();
            if (consumer == null) {
                return;
            } else {
                consumer.accept(this.b);
            }
        }
    }

    @Override // defpackage.bjx
    public final void a(int i) {
        this.b = new Status(20, a.x(i, "Connection to the GMS Core module was suspended, cause: "));
        c();
    }

    @Override // defpackage.bjx
    public final void b() {
        this.b = Status.a;
        c();
    }

    @Override // defpackage.bkn
    public final void i(bho bhoVar) {
        this.b = new Status(bhoVar, "Connection to the GMS Core module failed.");
        c();
    }
}
