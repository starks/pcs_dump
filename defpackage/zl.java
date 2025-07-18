package defpackage;

import android.app.Activity;
import android.app.FragmentManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zl {
    public zl() {
    }

    public static void a(Activity activity) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new zm());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Activity activity, yu yuVar) {
        yuVar.getClass();
        if (activity instanceof zb) {
            ((zb) activity).a().d(yuVar);
        } else if (activity instanceof yz) {
            yw ywVarE = ((yz) activity).E();
            if (ywVarE instanceof za) {
                ((za) ywVarE).d(yuVar);
            }
        }
    }

    public static void c(Activity activity) {
        zl zlVar = zm.Companion;
        a(activity);
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new zn(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static String d(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static Object e(acw acwVar, String str, fhk fhkVar) {
        Object objA = acwVar.a(str, new adm(1), fhkVar);
        return objA == fhs.a ? objA : ffz.a;
    }

    public static void f() {
        throw null;
    }

    public void g(bje bjeVar) {
        throw null;
    }

    public zl(byte[] bArr, byte[] bArr2) {
    }
}
