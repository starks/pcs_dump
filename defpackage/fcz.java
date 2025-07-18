package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcz extends fdd {
    private final fcy d;
    private final fcy e;
    private final fcy f;
    private final fcy g;
    private final int h;

    public fcz(fcy fcyVar, fcy fcyVar2, fcy fcyVar3, fcy fcyVar4, Provider provider, int i) {
        super(provider);
        this.d = fcyVar;
        this.e = fcyVar2;
        this.f = fcyVar3;
        this.g = fcyVar4;
        this.h = i;
    }

    @Override // defpackage.fdd
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.f.b(sSLSocket) && (bArr = (byte[]) this.f.a(sSLSocket, new Object[0])) != null) {
            return new String(bArr, fdh.b);
        }
        return null;
    }

    @Override // defpackage.fdd
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.d.c(sSLSocket, true);
            this.e.c(sSLSocket, str);
        }
        if (this.g.b(sSLSocket)) {
            this.g.a(sSLSocket, e(list));
        }
    }

    @Override // defpackage.fdd
    public final int c() {
        return this.h;
    }
}
