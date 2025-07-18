package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ut {
    private static WeakHashMap b;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final uj c = new uj();

    public static tp a(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = ur.a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof to ? ((to) accessibilityDelegateA).a : new tp(accessibilityDelegateA);
    }

    public static vs b(View view, vs vsVar) {
        WindowInsets windowInsetsE = vsVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = ul.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return vs.n(windowInsetsA, view);
            }
        }
        return vsVar;
    }

    public static CharSequence c(View view) {
        return (CharSequence) new ug(CharSequence.class).c(view);
    }

    public static List d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void e(View view, vv vvVar) {
        g(view);
        p(vvVar.a(), view);
        d(view).add(vvVar);
        h(view, 0);
    }

    public static void f(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    static void g(View view) {
        tp tpVarA = a(view);
        if (tpVarA == null) {
            tpVarA = new tp();
        }
        j(view, tpVarA);
    }

    static void h(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = c(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 0);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            int i2 = true != z ? AIFeature.Id.PIXEL_AI_FEATURE_48 : 32;
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(i2);
            accessibilityEventObtain.setContentChangeTypes(0);
            if (z) {
                accessibilityEventObtain.getText().add(c(view));
                q(view);
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
    }

    public static void i(View view, int i) {
        p(i, view);
        h(view, 0);
    }

    public static void j(View view, tp tpVar) {
        if (tpVar == null && (ur.a(view) instanceof to)) {
            tpVar = new tp();
        }
        q(view);
        view.setAccessibilityDelegate(tpVar == null ? null : tpVar.c);
    }

    public static void k(View view, CharSequence charSequence) {
        new ug(CharSequence.class).d(view, charSequence);
        if (charSequence == null) {
            uj ujVar = c;
            ujVar.a.remove(view);
            view.removeOnAttachStateChangeListener(ujVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ujVar);
            return;
        }
        uj ujVar2 = c;
        WeakHashMap weakHashMap = ujVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(ujVar2);
        if (view.isAttachedToWindow()) {
            ujVar2.a(view);
        }
    }

    public static void l(View view, CharSequence charSequence) {
        new uh(CharSequence.class).d(view, charSequence);
    }

    public static void m(View view, vs vsVar) {
        WindowInsets windowInsetsE = vsVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = us.a(view, windowInsetsE);
            if (windowInsetsA.equals(windowInsetsE)) {
                return;
            }
            vs.n(windowInsetsA, view);
        }
    }

    public static void n(View view, vv vvVar, we weVar) {
        e(view, new vv(null, vvVar.k, null, weVar, vvVar.l));
    }

    @Deprecated
    public static fsc o(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        fsc fscVar = (fsc) b.get(view);
        if (fscVar != null) {
            return fscVar;
        }
        fsc fscVar2 = new fsc(view);
        b.put(view, fscVar2);
        return fscVar2;
    }

    private static void p(int i, View view) {
        List listD = d(view);
        for (int i2 = 0; i2 < listD.size(); i2++) {
            if (((vv) listD.get(i2)).a() == i) {
                listD.remove(i2);
                return;
            }
        }
    }

    private static void q(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
