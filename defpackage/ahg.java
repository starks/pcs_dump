package defpackage;

import android.view.ViewGroup;
import com.google.android.as.oss.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahg {
    public static final ahc a = new ahk(null);
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList b = new ArrayList();

    static nv a() {
        nv nvVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (nvVar = (nv) weakReference.get()) != null) {
            return nvVar;
        }
        nv nvVar2 = new nv();
        threadLocal.set(new WeakReference(nvVar2));
        return nvVar2;
    }

    public static void b(ViewGroup viewGroup, ahc ahcVar) {
        if (ahcVar != null) {
            ahf ahfVar = new ahf(ahcVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(ahfVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(ahfVar);
        }
    }

    public static void c(ViewGroup viewGroup, ahc ahcVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahc) arrayList.get(i)).u(viewGroup);
            }
        }
        if (ahcVar != null) {
            ahcVar.p(viewGroup, true);
        }
        if (((us) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
