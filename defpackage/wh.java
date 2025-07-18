package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wh {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static Uri d(String str) {
        if (str.startsWith("/appfiles")) {
            return Uri.parse("appfiles:".concat(String.valueOf(str.substring(9))));
        }
        if (str.startsWith("/appcache")) {
            return Uri.parse("appcache:".concat(String.valueOf(str.substring(9))));
        }
        throw new IllegalArgumentException(String.format("Unsupported original scheme: %s", str));
    }

    public static String e(String str) {
        return String.valueOf(h(str)).concat("/inputs");
    }

    public static String f(String str) {
        return String.valueOf(h(str)).concat("/outputs");
    }

    public static String g(String str) {
        return String.valueOf(h(str)).concat("/plans");
    }

    public static String h(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        while (length > iCharCount) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return "/localcompute/".concat(String.valueOf(str.substring(iCharCount, length).replaceAll("[^A-Za-z0-9]", "_")));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.os.IBinder, java.lang.Object] */
    public static IBinder i(Context context, Class cls, bot botVar) {
        erb erbVar = new erb();
        ash ashVar = new ash();
        ekf ekfVar = new ekf((byte[]) null, (byte[]) null);
        Iterator it = botVar.a().iterator();
        while (it.hasNext()) {
            ekfVar.a.put((String) it.next(), ashVar);
        }
        exo exoVar = new exo(cxg.g(ekfVar.a));
        era eraVar = new era(new eqx(new Intent("grpc.io.action.BIND").setComponent(new ComponentName(context, (Class<?>) cls))), erbVar);
        eraVar.a.f = exoVar;
        new erc().a = true;
        eraVar.a.e = new erd(true, 32768);
        era eraVar2 = (era) eraVar.b(new erp(1));
        eraVar2.b(new asg(asd.b, asd.a));
        ((fau) eraVar2.a()).g = new emu();
        ((fau) eraVar2.a()).h = new emf(new eme[0]);
        for (elq elqVar : botVar.b()) {
            fjp fjpVarA = eraVar2.a();
            elqVar.getClass();
            Object obj = ((fau) fjpVarA).q.a;
            exo exoVarB = elqVar.b();
            ((HashMap) obj).put(((eqi) exoVarB.a).a, exoVarB);
        }
        eqb eqbVarG = eraVar2.g();
        synchronized (((fas) eqbVarG).m) {
            clq.G(!((fas) eqbVarG).k, "Already started");
            clq.G(true, "Shutting down");
            ((fas) eqbVarG).l.c(new fao((fas) eqbVarG));
            Executor executor = (Executor) ((fas) eqbVarG).d.a();
            executor.getClass();
            ((fas) eqbVarG).e = executor;
            ((fas) eqbVarG).k = true;
        }
        return erbVar.a;
    }

    public static aoa j(fsc fscVar, Executor executor) {
        are areVar = new are(fscVar.ae(aog.DEVICE_PERSONALIZATION_SERVICES, executor));
        aof aofVar = areVar.c;
        ((aok) aofVar).d.s(new aml(areVar, 5));
        return areVar;
    }
}
