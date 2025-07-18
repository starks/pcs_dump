package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rm {
    public static int a(Context context, String str) {
        un.B(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static ColorStateList b(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        Object colorStateList;
        cgm cgmVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ThreadLocal threadLocal = rw.a;
        ru ruVar = new ru(resources, theme2);
        synchronized (rw.c) {
            SparseArray sparseArray = (SparseArray) rw.b.get(ruVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (cgmVar = (cgm) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!((Configuration) cgmVar.b).equals(ruVar.a.getConfiguration()) || (!((theme = ruVar.b) == null && cgmVar.a == 0) && (theme == null || cgmVar.a != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = cgmVar.c;
            }
        }
        if (colorStateList == null) {
            TypedValue typedValue = (TypedValue) rw.a.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                rw.a.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateListA = rr.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateListA != null) {
                synchronized (rw.c) {
                    SparseArray sparseArray2 = (SparseArray) rw.b.get(ruVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        rw.b.put(ruVar, sparseArray2);
                    }
                    sparseArray2.append(i, new cgm(colorStateListA, ruVar.a.getConfiguration(), theme2));
                }
                colorStateList = colorStateListA;
            } else {
                colorStateList = resources.getColorStateList(i, theme2);
            }
        }
        return (ColorStateList) colorStateList;
    }

    public static Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }
}
