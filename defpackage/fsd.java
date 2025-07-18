package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsd extends RuntimeException {
    public final IOException a;
    public IOException b;

    public fsd(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
