package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.intelligence.micore.pir.core.PirClientModuleJNI;
import com.google.intelligence.micore.pir.core.PirClientSwig;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebq {
    public static volatile epg a;
    public static Thread b;

    public static final PirClientSwig a(dzy dzyVar) {
        long jPirClientSwig_create = PirClientModuleJNI.PirClientSwig_create(dzyVar == null ? null : dzyVar.toByteArray());
        if (jPirClientSwig_create == 0) {
            return null;
        }
        return new PirClientSwig(jPirClientSwig_create);
    }

    public static int b(int i, int i2) {
        return (i * i2) / 8;
    }

    public static long c(dzy dzyVar) {
        int iA = dzx.a(dzyVar.b);
        int i = iA - 1;
        if (iA == 0) {
            throw null;
        }
        if (i != 0) {
            throw new IllegalArgumentException("Unrecognized PIR configuration scheme.");
        }
        edd eddVar = (dzyVar.b == 1 ? (ede) dzyVar.c : ede.a).b;
        if (eddVar == null) {
            eddVar = edd.a;
        }
        int i2 = 1 << eddVar.b;
        edd eddVar2 = (dzyVar.b == 1 ? (ede) dzyVar.c : ede.a).b;
        if (eddVar2 == null) {
            eddVar2 = edd.a;
        }
        return b(i2, eddVar2.c);
    }

    public static long d(dzy dzyVar) {
        edc edcVar = dzyVar.d;
        if (edcVar == null) {
            edcVar = edc.a;
        }
        return edcVar.c;
    }

    public static float e(fwz fwzVar) {
        int iB = fwy.b(fwzVar.b);
        int i = fwy.b;
        int iB2 = fwy.b(fwzVar.b);
        String strA = fwy.a(iB2);
        if (iB2 == 0) {
            throw null;
        }
        clq.A(iB == i, "Expected feature to be float_list but was %s", strA);
        fxc fxcVar = fwzVar.b == 2 ? (fxc) fwzVar.c : fxc.a;
        clq.y(fxcVar.b.size() == 1, "Expected %s to be scalar, but float_list.value count was: %d", fxcVar.b.size());
        return fxcVar.b.d(0);
    }

    public static int f(fwz fwzVar) {
        int iB = fwy.b(fwzVar.b);
        int i = fwy.c;
        int iB2 = fwy.b(fwzVar.b);
        String strA = fwy.a(iB2);
        if (iB2 == 0) {
            throw null;
        }
        clq.A(iB == i, "Expected feature to be int64_list but was %s", strA);
        fxd fxdVar = fwzVar.b == 3 ? (fxd) fwzVar.c : fxd.a;
        clq.y(fxdVar.b.size() == 1, "Expected %s to be scalar, but int64_list.value count was: %d", fxdVar.b.size());
        return (int) fxdVar.b.a(0);
    }

    public static eea g(fwz fwzVar) {
        int iB = fwy.b(fwzVar.b);
        int i = fwy.a;
        int iB2 = fwy.b(fwzVar.b);
        String strA = fwy.a(iB2);
        if (iB2 == 0) {
            throw null;
        }
        clq.A(iB == i, "Expected feature to be bytes_list but was %s", strA);
        fww fwwVar = fwzVar.b == 1 ? (fww) fwzVar.c : fww.a;
        clq.y(fwwVar.b.size() == 1, "Expected %s to be scalar, but bytes_list.value count was: %d", fwwVar.b.size());
        return (eea) fwwVar.b.get(0);
    }

    public static String h(eea eeaVar) {
        fuu fuuVar = new fuu(eeaVar, null);
        StringBuilder sb = new StringBuilder(fuuVar.h());
        for (int i = 0; i < fuuVar.h(); i++) {
            byte bA = ((eea) fuuVar.a).a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Object i(Object obj) {
        return ((efb) obj).newMutableInstance();
    }

    public static final Map j(Object obj) {
        return (egd) obj;
    }

    public static final egc k(Object obj) {
        return (egc) ((fsc) obj).a;
    }

    public static final Map l(Object obj) {
        return (egd) obj;
    }

    public static final int m(int i, Object obj, Object obj2) {
        egd egdVar = (egd) obj;
        fsc fscVar = (fsc) obj2;
        int iY = 0;
        if (egdVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : egdVar.entrySet()) {
            iY += eei.Y(i) + eei.P(fsc.u((egc) fscVar.a, entry.getKey(), entry.getValue()));
        }
        return iY;
    }

    public static final boolean n(Object obj) {
        return !((egd) obj).b;
    }

    public static final Object o(Object obj, Object obj2) {
        egd egdVarA = (egd) obj;
        egd egdVar = (egd) obj2;
        if (!egdVar.isEmpty()) {
            if (!egdVarA.b) {
                egdVarA = egdVarA.a();
            }
            egdVarA.b();
            if (!egdVar.isEmpty()) {
                egdVarA.putAll(egdVar);
            }
        }
        return egdVarA;
    }

    public static final Object p() {
        return egd.a.a();
    }

    public static final void q(Object obj) {
        ((egd) obj).c();
    }

    public static void r(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static int s(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap t(int i) {
        return new LinkedHashMap(s(i));
    }

    public static List u(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    public static void v(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void w(Object obj) {
        obj.getClass();
    }

    public static boolean x(Context context) {
        Set setD = ((ejj) y(context, ejj.class)).d();
        cyv cyvVar = (cyv) setD;
        v(cyvVar.d <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setD.isEmpty()) {
            return true;
        }
        return ((Boolean) cyvVar.listIterator().next()).booleanValue();
    }

    public static final Object y(Context context, Class cls) {
        Application application;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context baseContext = applicationContext;
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext instanceof Application) {
                    application = (Application) baseContext;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(applicationContext))));
        }
        application = (Application) applicationContext;
        return z(application, cls);
    }

    public static Object z(Object obj, Class cls) {
        if (!(obj instanceof eki)) {
            if (obj instanceof ekj) {
                return z(((ekj) obj).aS(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), eki.class, ekj.class));
        }
        if (obj instanceof ekl) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            v(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }
}
