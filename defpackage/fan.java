package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fan implements fax {
    @Override // defpackage.fbk
    public final void d(fbj fbjVar) throws IOException {
        while (true) {
            InputStream inputStreamA = fbjVar.a();
            if (inputStreamA == null) {
                return;
            }
            try {
                inputStreamA.close();
            } catch (IOException e) {
                while (true) {
                    InputStream inputStreamA2 = fbjVar.a();
                    if (inputStreamA2 == null) {
                        throw new RuntimeException(e);
                    }
                    try {
                        inputStreamA2.close();
                    } catch (IOException e2) {
                        fas.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.fax
    public final void b() {
    }

    @Override // defpackage.fbk
    public final void e() {
    }

    @Override // defpackage.fax
    public final void a(eqo eqoVar) {
    }
}
