package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cew {
    private static final Map a = new nv();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            cew cewVar = (cew) it.next();
            SharedPreferences sharedPreferences = cewVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = cewVar.c;
            throw null;
        }
        map.clear();
    }
}
