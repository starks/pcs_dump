package defpackage;

import android.util.Log;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ako {
    public static final /* synthetic */ int a = 0;
    private static final String b = "ako";
    private static final cav c;

    static {
        int i = cau.a;
        if (i == 0) {
            throw null;
        }
        cav cavVar = new cav("NONE", i, 4);
        c = cavVar;
        cnx.C(cavVar);
    }

    private ako() {
    }

    static /* synthetic */ String a(bmr bmrVar, Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = null;
        try {
            objInvoke = method.invoke(bmrVar, null);
        } catch (ReflectiveOperationException unused) {
            Log.e(b, String.format("Failed to invoke: %s of message: %s", method.getName(), bmrVar));
        }
        return objInvoke == null ? "" : objInvoke.toString();
    }

    public static String b(eia eiaVar, Stream stream) {
        return (String) stream.map(new akn(eiaVar, 1)).collect(Collectors.joining((eiaVar.b & 1) != 0 ? eiaVar.c : "\n"));
    }
}
