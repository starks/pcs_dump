package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fuv implements fux {
    private final Class c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;
    public static final fwv b = new fwv();
    public static final fuu a = new fuu();

    public fuv(Class cls) throws NoSuchMethodException, SecurityException {
        this.c = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.d = declaredMethod;
        this.e = cls.getMethod("setHostname", String.class);
        this.f = cls.getMethod("getAlpnSelectedProtocol", null);
        this.g = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.fux
    public final String a(SSLSocket sSLSocket) {
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, fla.a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && fjs.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.fux
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (d(sSLSocket)) {
            try {
                this.d.invoke(sSLSocket, true);
                this.e.invoke(sSLSocket, str);
                Method method = this.g;
                fup fupVar = fup.c;
                fvk fvkVar = new fvk();
                for (String str2 : fwv.r(list)) {
                    fvkVar.P(str2.length());
                    fvkVar.t(str2);
                }
                method.invoke(sSLSocket, fvkVar.F());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.fux
    public final boolean c() {
        boolean z = ful.a;
        return false;
    }

    @Override // defpackage.fux
    public final boolean d(SSLSocket sSLSocket) {
        return this.c.isInstance(sSLSocket);
    }
}
