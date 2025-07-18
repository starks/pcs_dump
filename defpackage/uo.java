package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.WindowInsets;
import j$.time.Duration;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uo {
    private static fcy a;

    public uo() {
    }

    public static vs a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        vs vsVarM = vs.m(rootWindowInsets);
        vsVarM.p(vsVarM);
        vsVarM.o(view.getRootView());
        return vsVarM;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }

    public static int h(afa afaVar, String str) {
        int i = i(afaVar, str);
        if (i >= 0) {
            return i;
        }
        int i2 = i(afaVar, "`" + str + '`');
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }

    public static int i(afa afaVar, String str) {
        int iA = afaVar.a();
        for (int i = 0; i < iA; i++) {
            if (fjs.c(str, afaVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int j(afa afaVar, String str) throws IOException {
        int iH = h(afaVar, str);
        if (iH >= 0) {
            return iH;
        }
        int iA = afaVar.a();
        ArrayList arrayList = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList.add(afaVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + ffh.S(arrayList, null, null, null, null, 63) + ']');
    }

    public static int k(ady adyVar) throws Exception {
        adyVar.getClass();
        afa afaVarB = adyVar.b("SELECT changes()");
        try {
            afaVarB.k();
            int iB = (int) afaVarB.b(0);
            fjp.w(afaVarB, null);
            return iB;
        } finally {
        }
    }

    public static Object l(Class cls) throws ClassNotFoundException {
        String name;
        String str;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            canonicalName.getClass();
        }
        String strConcat = String.valueOf(fjz.A(canonicalName, '.', '_')).concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    public static cag m(Executor executor, cag cagVar, final Duration duration) {
        if (cagVar.d()) {
            return cagVar;
        }
        long millis = duration.toMillis();
        boolean z = millis > 0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aso.z(z, "Timeout must be positive");
        aso.G(timeUnit, "TimeUnit must not be null");
        final brb brbVar = new brb(null, null, null, null, null);
        final brb brbVar2 = new brb(brbVar);
        final bya byaVar = new bya(Looper.getMainLooper());
        byaVar.postDelayed(new bks(brbVar2, 12, null), timeUnit.toMillis(millis));
        cagVar.g(new cab() { // from class: can
            @Override // defpackage.cab
            public final void a(cag cagVar2) {
                byaVar.removeCallbacksAndMessages(null);
                brb brbVar3 = brbVar2;
                if (cagVar2.e()) {
                    brbVar3.F(cagVar2.c());
                } else {
                    if (((cal) cagVar2).c) {
                        brbVar.G();
                        return;
                    }
                    Exception excB = cagVar2.b();
                    excB.getClass();
                    brbVar3.E(excB);
                }
            }
        });
        return ((cag) brbVar2.a).a(executor, new bzx() { // from class: bpc
            @Override // defpackage.bzx
            public final Object a(cag cagVar2) {
                Exception excB = cagVar2.b();
                return excB instanceof TimeoutException ? up.n(ayg.h(excB, 15, "Task timed out after ".concat(String.valueOf(String.valueOf(duration))))) : cagVar2;
            }
        });
    }

    public static synchronized fcy n(Context context) {
        if (a == null) {
            HandlerThread handlerThread = new HandlerThread("DG");
            handlerThread.start();
            bya byaVar = new bya(handlerThread.getLooper());
            Context applicationContext = context.getApplicationContext();
            bor borVar = new bor();
            a = new fcy(new fpv(byaVar, new bnn(applicationContext, byaVar.getLooper(), borVar, borVar), borVar), bxz.a.h(1, 1), new bos(context));
        }
        return a;
    }

    public static void o(Class cls, String str, exo... exoVarArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?>[] clsArr = new Class[3];
        Object[] objArr = new Object[3];
        for (int i = 0; i < 3; i++) {
            exo exoVar = exoVarArr[i];
            exoVar.getClass();
            clsArr[i] = (Class) exoVar.a;
            objArr[i] = exoVarArr[i].b;
        }
        cls.getDeclaredMethod("reportRequestStats2", clsArr).invoke(null, objArr);
    }

    public TransformationMethod c(TransformationMethod transformationMethod) {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public InputFilter[] g(InputFilter[] inputFilterArr) {
        throw null;
    }

    public /* synthetic */ uo(char[] cArr) {
    }

    public void d(boolean z) {
    }

    public void e(boolean z) {
    }
}
