package defpackage;

import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fjp {
    private static fjp a;

    public fjp() {
    }

    public static Object A(fjc fjcVar, Object obj, fhk fhkVar) {
        fhq fhqVarD = fhkVar.d();
        Object fhvVar = fhqVarD == fhr.a ? new fhv(fhkVar) : new fhw(fhkVar, fhqVarD);
        fjz.c(fjcVar, 2);
        return fjcVar.a(obj, fhvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fhk B(fjc fjcVar, Object obj, fhk fhkVar) {
        if (fjcVar instanceof fhx) {
            return ((fhx) fjcVar).c(obj, fhkVar);
        }
        fhq fhqVarD = fhkVar.d();
        return fhqVarD == fhr.a ? new fht(fhkVar, fjcVar, obj) : new fhu(fhkVar, fhqVarD, fjcVar, obj);
    }

    public static fhk C(fhk fhkVar) {
        fhkVar.getClass();
        fhz fhzVar = fhkVar instanceof fhz ? (fhz) fhkVar : null;
        if (fhzVar != null && (fhkVar = fhzVar.l) == null) {
            fhm fhmVar = (fhm) fhzVar.d().get(fhm.a);
            fhkVar = fhmVar != null ? fhmVar.a(fhzVar) : fhzVar;
            fhzVar.l = fhkVar;
        }
        return fhkVar;
    }

    public static Object D(fhn fhnVar, Object obj, fjc fjcVar) {
        fjcVar.getClass();
        return fjcVar.a(obj, fhnVar);
    }

    public static fhn E(fhn fhnVar, fho fhoVar) {
        fhoVar.getClass();
        if (fjs.c(fhnVar.getKey(), fhoVar)) {
            return fhnVar;
        }
        return null;
    }

    public static fhq F(fhn fhnVar, fho fhoVar) {
        fhoVar.getClass();
        return fjs.c(fhnVar.getKey(), fhoVar) ? fhr.a : fhnVar;
    }

    public static fhq G(fhn fhnVar, fhq fhqVar) {
        fhqVar.getClass();
        return H(fhnVar, fhqVar);
    }

    public static fhq H(fhq fhqVar, fhq fhqVar2) {
        fhqVar2.getClass();
        return fhqVar2 == fhr.a ? fhqVar : (fhq) fhqVar2.fold(fhqVar, fhp.a);
    }

    public static eox I(String str, Parcelable.Creator creator) {
        esc escVar = new esc(creator, false);
        int i = eox.d;
        return new eoy(str, escVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList, java.util.List] */
    public static List J(Class cls, Iterable iterable, ClassLoader classLoader, eqk eqkVar) {
        ?? Load;
        if (K(classLoader)) {
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } else {
            Load = ServiceLoader.load(cls, classLoader);
            if (!Load.iterator().hasNext()) {
                Load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            eqkVar.b(obj);
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new eqj(eqkVar)));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean K(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void L() {
        fsc.s().q();
    }

    public static long M() {
        return System.nanoTime();
    }

    public static eqo N(emr emrVar) {
        emrVar.getClass();
        if (!emrVar.i()) {
            return null;
        }
        Throwable thC = emrVar.c();
        if (thC == null) {
            return eqo.c.e("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return eqo.f.e(thC.getMessage()).d(thC);
        }
        eqo eqoVarC = eqo.c(thC);
        return (eql.UNKNOWN.equals(eqoVarC.o) && eqoVarC.q == thC) ? eqo.c.e("Context cancelled").d(thC) : eqoVarC.d(thC);
    }

    public static fjp O(emr emrVar, eqc eqcVar, epc epcVar, eqd eqdVar) {
        emr emrVarA = emrVar.a();
        try {
            return new enc(eqdVar.a(eqcVar, epcVar), emrVar);
        } finally {
            emrVar.f(emrVarA);
        }
    }

    public static synchronized fjp P() {
        if (a == null) {
            a = new fjp(null, null);
        }
        return a;
    }

    private static int Q(int i, int i2, int i3) {
        return R(R(i, i3) - R(i2, i3), i3);
    }

    private static int R(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static String k(fjq fjqVar) {
        String string = fjqVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public static Class l(fkk fkkVar) {
        fkkVar.getClass();
        return ((fjm) fkkVar).a();
    }

    public static Class m(fkk fkkVar) {
        String name;
        fkkVar.getClass();
        Class clsA = ((fjm) fkkVar).a();
        if (!clsA.isPrimitive() || (name = clsA.getName()) == null) {
            return clsA;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : clsA;
            case 104431:
                return name.equals("int") ? Integer.class : clsA;
            case 3039496:
                return name.equals("byte") ? Byte.class : clsA;
            case 3052374:
                return name.equals("char") ? Character.class : clsA;
            case 3327612:
                return name.equals("long") ? Long.class : clsA;
            case 3625364:
                return name.equals("void") ? Void.class : clsA;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : clsA;
            case 97526364:
                return name.equals("float") ? Float.class : clsA;
            case 109413500:
                return name.equals("short") ? Short.class : clsA;
            default:
                return clsA;
        }
    }

    public static fkk n(Class cls) {
        cls.getClass();
        return fjy.b(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object o(Object obj, fhk fhkVar) {
        if (!(obj instanceof flq)) {
            return obj;
        }
        Throwable thA = ((flq) obj).a;
        if (fmd.c && (fhkVar instanceof fia)) {
            thA = fpb.a(thA, fhkVar);
        }
        return ffh.b(thA);
    }

    public static Object p(Object obj) {
        Throwable thA = ffu.a(obj);
        return thA == null ? obj : new flq(thA);
    }

    public static /* synthetic */ void q(fma fmaVar, fhq fhqVar, fjc fjcVar, int i) {
        int i2 = fmb.a;
        fhq fhqVarB = flw.b(fmaVar, fhqVar);
        fhk fnjVar = fmb.c(i2) ? new fnj(fhqVarB, fjcVar) : new fnn(fhqVarB, true);
        fmb.b(i2, fjcVar, fnjVar, fnjVar);
    }

    public static /* synthetic */ void r(fjc fjcVar) throws Throwable {
        fhr fhrVar = fhr.a;
        Thread threadCurrentThread = Thread.currentThread();
        fhrVar.get(fhm.a);
        fnq fnqVar = fnq.a;
        fmo fmoVarA = fnq.a();
        fll fllVar = new fll(flw.b(fmv.a, fhrVar.plus(fmoVarA)), threadCurrentThread, fmoVarA);
        fmb.b(fmb.a, fjcVar, fllVar, fllVar);
        fmo fmoVar = fllVar.b;
        if (fmoVar != null) {
            fmoVar.m(false);
        }
        while (!Thread.interrupted()) {
            try {
                fmo fmoVar2 = fllVar.b;
                long j = fmoVar2 != null ? fmoVar2.j() : Long.MAX_VALUE;
                if (fllVar.H()) {
                    fmo fmoVar3 = fllVar.b;
                    if (fmoVar3 != null) {
                        fmoVar3.k(false);
                    }
                    Object objB = fni.b(fllVar.t());
                    flq flqVar = objB instanceof flq ? (flq) objB : null;
                    if (flqVar != null) {
                        throw flqVar.a;
                    }
                    return;
                }
                LockSupport.parkNanos(fllVar, j);
            } catch (Throwable th) {
                fmo fmoVar4 = fllVar.b;
                if (fmoVar4 != null) {
                    fmoVar4.k(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fllVar.E(interruptedException);
        throw interruptedException;
    }

    public static flf s(boolean z) {
        return new flf(false, flj.a);
    }

    public static flg t(int i) {
        return new flg(0, flj.a);
    }

    public static flh u(long j) {
        return new flh(j, flj.a);
    }

    public static fli v(Object obj) {
        return new fli(obj, flj.a);
    }

    public static void w(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            ffh.a(th, th2);
        }
    }

    public static void x(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ffh.a(th, th2);
            }
        }
    }

    public static int y(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - Q(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + Q(i, i2, -i3);
            }
        }
        return i2;
    }

    public static fie z(Enum[] enumArr) {
        enumArr.getClass();
        return new fie(enumArr);
    }

    public eqo T(epm epmVar) {
        throw null;
    }

    public fjp b(eqe eqeVar) {
        throw null;
    }

    public void i(Throwable th, Throwable th2) {
        Method method = fig.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public fkf j() {
        throw null;
    }

    public fjp(byte[] bArr, byte[] bArr2, char[] cArr) {
        this();
    }

    public fjp(char[] cArr) {
    }

    public fjp(SSLSession sSLSession) throws SSLPeerUnverifiedException {
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            enl.a.logp(Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
        }
    }

    public fjp(short[] sArr, byte[] bArr) {
        new HashSet();
    }

    public void S() {
    }

    public void c() {
    }

    public void d() {
    }

    public void f() {
    }

    public void U(long j) {
    }

    public void e(Object obj) {
    }
}
