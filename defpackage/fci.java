package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fci extends fcj {
    private static final fcy d = new fcy((Class) null, "setUseSessionTickets", Boolean.TYPE);
    private static final fcy e = new fcy((Class) null, "setHostname", String.class);
    private static final fcy f = new fcy(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final fcy g = new fcy((Class) null, "setAlpnProtocols", byte[].class);
    private static final fcy h = new fcy(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final fcy i = new fcy((Class) null, "setNpnProtocols", byte[].class);
    private static final Method j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Constructor p;

    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException classNotFoundException;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Method method9;
        Constructor<?> constructor = null;
        try {
            method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method5 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method7 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        Class<?> cls = Class.forName("android.net.ssl.SSLSockets");
                        method8 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method6 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                        } catch (ClassNotFoundException e2) {
                            classNotFoundException = e2;
                            method = method5;
                            method3 = method7;
                            method4 = method8;
                            fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                            method5 = method;
                            method6 = null;
                            method7 = method3;
                            method8 = method4;
                            l = method2;
                            m = method5;
                            n = method7;
                            j = method8;
                            k = method6;
                            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                            try {
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            } catch (ClassNotFoundException e3) {
                                e = e3;
                                fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
                                o = method9;
                                p = constructor;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
                                o = method9;
                                p = constructor;
                            }
                            o = method9;
                            p = constructor;
                        } catch (NoSuchMethodException e5) {
                            noSuchMethodException = e5;
                            method = method5;
                            method3 = method7;
                            method4 = method8;
                            fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                            method5 = method;
                            method6 = null;
                            method7 = method3;
                            method8 = method4;
                            l = method2;
                            m = method5;
                            n = method7;
                            j = method8;
                            k = method6;
                            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            o = method9;
                            p = constructor;
                        }
                    } catch (ClassNotFoundException e6) {
                        classNotFoundException = e6;
                        method4 = null;
                        method = method5;
                        method3 = method7;
                    } catch (NoSuchMethodException e7) {
                        noSuchMethodException = e7;
                        method4 = null;
                        method = method5;
                        method3 = method7;
                    }
                } catch (ClassNotFoundException e8) {
                    classNotFoundException = e8;
                    method3 = null;
                    method4 = null;
                    method = method5;
                } catch (NoSuchMethodException e9) {
                    noSuchMethodException = e9;
                    method3 = null;
                    method4 = null;
                    method = method5;
                }
            } catch (ClassNotFoundException e10) {
                classNotFoundException = e10;
                method = null;
                method3 = null;
                method4 = method3;
                fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                method5 = method;
                method6 = null;
                method7 = method3;
                method8 = method4;
                l = method2;
                m = method5;
                n = method7;
                j = method8;
                k = method6;
                method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method9;
                p = constructor;
            } catch (NoSuchMethodException e11) {
                noSuchMethodException = e11;
                method = null;
                method3 = null;
                method4 = method3;
                fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                method5 = method;
                method6 = null;
                method7 = method3;
                method8 = method4;
                l = method2;
                m = method5;
                n = method7;
                j = method8;
                k = method6;
                method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method9;
                p = constructor;
            }
        } catch (ClassNotFoundException e12) {
            classNotFoundException = e12;
            method = null;
            method2 = null;
            method3 = null;
        } catch (NoSuchMethodException e13) {
            noSuchMethodException = e13;
            method = null;
            method2 = null;
            method3 = null;
        }
        l = method2;
        m = method5;
        n = method7;
        j = method8;
        k = method6;
        try {
            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e14) {
            e = e14;
            method9 = null;
        } catch (NoSuchMethodException e15) {
            e = e15;
            method9 = null;
        }
        o = method9;
        p = constructor;
    }

    public fci(fdd fddVar) {
        super(fddVar);
    }

    @Override // defpackage.fcj
    public final String a(SSLSocket sSLSocket) {
        Method method = n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                fcj.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) f.a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, fdh.b);
                }
            } catch (Exception e4) {
                fcj.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) h.a(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, fdh.b);
                }
            } catch (Exception e5) {
                fcj.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.fcj
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f A[Catch: InstantiationException -> 0x0209, InvocationTargetException -> 0x0210, IllegalAccessException -> 0x0217, TryCatch #0 {InvocationTargetException -> 0x0210, blocks: (B:8:0x002c, B:11:0x0036, B:15:0x004a, B:16:0x004f, B:18:0x0053, B:20:0x0063, B:22:0x007e, B:24:0x0082, B:27:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a0, B:57:0x011d, B:59:0x0123, B:61:0x012b, B:63:0x0134, B:66:0x013f, B:69:0x0145, B:70:0x014a, B:76:0x0158, B:77:0x015e, B:78:0x0169, B:79:0x016a, B:81:0x0177, B:35:0x00ae, B:39:0x00b9, B:44:0x00cf, B:46:0x00e0, B:56:0x0116, B:47:0x00e7, B:51:0x00f0, B:52:0x00f8, B:54:0x00fe, B:55:0x010e, B:82:0x018f, B:21:0x0071, B:83:0x0198, B:92:0x01c2, B:94:0x01c7, B:96:0x01cb, B:88:0x01ab, B:90:0x01b3, B:91:0x01c1), top: B:119:0x002c }] */
    @Override // defpackage.fcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c(javax.net.ssl.SSLSocket r13, java.lang.String r14, java.util.List r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fci.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }
}
