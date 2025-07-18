package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qy {
    public qy() {
    }

    public static boolean A(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0737 A[PHI: r8
  0x0737: PHI (r8v20 pb) = (r8v19 pb), (r8v25 pb) binds: [B:415:0x072b, B:418:0x0735] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C(defpackage.ph r39, defpackage.oy r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.C(ph, oy, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(android.content.Context r13, int r14, android.util.SparseArray r15, android.util.SparseArray r16) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.s(android.content.Context, int, android.util.SparseArray, android.util.SparseArray):void");
    }

    public static Intent t(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strV = v(activity);
        if (strV == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strV);
        try {
            return w(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", a.z(strV, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent u(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strW = w(context, componentName);
        if (strW == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strW);
        return w(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String v(Activity activity) {
        try {
            return w(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String w(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static int x(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static pz y(pg pgVar, int i, ArrayList arrayList, pz pzVar) {
        int i2;
        int i3 = i == 0 ? pgVar.ap : pgVar.aq;
        if (i3 != -1 && (pzVar == null || i3 != pzVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                pz pzVar2 = (pz) arrayList.get(i4);
                if (pzVar2.c == i3) {
                    if (pzVar != null) {
                        pzVar.c(i, pzVar2);
                        arrayList.remove(pzVar);
                    }
                    pzVar = pzVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return pzVar;
        }
        if (pzVar == null) {
            if (pgVar instanceof pk) {
                pk pkVar = (pk) pgVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= pkVar.at) {
                        i2 = -1;
                        break;
                    }
                    pg pgVar2 = pkVar.as[i5];
                    if (i == 0) {
                        i2 = pgVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = pgVar2.aq;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        pz pzVar3 = (pz) arrayList.get(i6);
                        if (pzVar3.c == i2) {
                            pzVar = pzVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (pzVar == null) {
                pzVar = new pz(i);
            }
            arrayList.add(pzVar);
        }
        if (pzVar.d(pgVar)) {
            if (pgVar instanceof pj) {
                pj pjVar = (pj) pgVar;
                pjVar.d.c(pjVar.as == 0 ? 1 : 0, arrayList, pzVar);
            }
            if (i == 0) {
                pgVar.ap = pzVar.c;
                pgVar.K.c(0, arrayList, pzVar);
                pgVar.M.c(0, arrayList, pzVar);
            } else {
                pgVar.aq = pzVar.c;
                pgVar.L.c(1, arrayList, pzVar);
                pgVar.O.c(1, arrayList, pzVar);
                pgVar.N.c(1, arrayList, pzVar);
            }
            pgVar.R.c(i, arrayList, pzVar);
        }
        return pzVar;
    }

    public static pz z(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pz pzVar = (pz) arrayList.get(i2);
            if (i == pzVar.c) {
                return pzVar;
            }
        }
        return null;
    }

    public Parcelable a(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean r(View view) {
        return false;
    }

    public qy(Context context, AttributeSet attributeSet) {
    }

    public qy(pg pgVar, oy oyVar) {
        new WeakReference(pgVar);
        oy.p(pgVar.K);
        oy.p(pgVar.L);
        oy.p(pgVar.M);
        oy.p(pgVar.N);
        oy.p(pgVar.O);
    }

    public void c() {
    }

    public void b(rb rbVar) {
    }

    public void p(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void f(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void g(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }
}
