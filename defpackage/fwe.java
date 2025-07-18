package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwe extends fvj {
    private final Socket a;

    public fwe(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.fvj
    protected final void a() throws IOException {
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (!fvu.c(e)) {
                throw e;
            }
            Socket socket = this.a;
            Logger logger = fvu.a;
            Level level = Level.WARNING;
            Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(socket.toString()), (Throwable) e);
        } catch (Exception e2) {
            Socket socket2 = this.a;
            Logger logger2 = fvu.a;
            Level level2 = Level.WARNING;
            Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(socket2.toString()), (Throwable) e2);
        }
    }

    @Override // defpackage.fvj
    protected final IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
