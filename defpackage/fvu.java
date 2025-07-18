package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fvu {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final fwd a(Socket socket) throws IOException {
        socket.getClass();
        fwe fweVar = new fwe(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new fvh(fweVar, new fvw(outputStream, fweVar));
    }

    public static final fwf b(Socket socket) throws IOException {
        socket.getClass();
        fwe fweVar = new fwe(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new fvi(fweVar, new fvt(inputStream, fweVar));
    }

    public static final boolean c(AssertionError assertionError) {
        String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !fjz.o(message, "getsockname failed")) ? false : true;
    }
}
