package defpackage;

import android.util.Log;
import androidx.preference.PreferenceGroup;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bot {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public bot() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final Set a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ejg, java.lang.Object] */
    public final Set b() {
        return (Set) this.b.b();
    }

    public final void c() {
        Integer num;
        ms msVar = (ms) this.a;
        List list = msVar.d;
        Object obj = this.b;
        if (!list.contains(obj) && (num = (Integer) msVar.b.remove(obj)) != null) {
            msVar.a.remove(num);
        }
        msVar.e.remove(obj);
        if (msVar.f.containsKey(obj)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + ((String) obj) + ": " + msVar.f.get(obj));
            msVar.f.remove(obj);
        }
        String str = (String) obj;
        if (msVar.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((mp) msVar.g.getParcelable(str, mp.class)));
            msVar.g.remove(str);
        }
        if (((jt) msVar.c.get(obj)) != null) {
            throw null;
        }
    }

    public bot(abs absVar, PreferenceGroup preferenceGroup) {
        this.b = absVar;
        this.a = preferenceGroup;
    }

    public /* synthetic */ bot(fcy fcyVar, Map map) {
        this.a = fcyVar;
        this.b = map;
    }

    public bot(Set set, ejg ejgVar) {
        this.a = set;
        this.b = ejgVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bot(ms msVar, String str) {
        this();
        this.a = msVar;
        this.b = str;
    }
}
