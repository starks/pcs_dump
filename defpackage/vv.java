package defpackage;

import android.R;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vv {
    public static final vv a;
    public static final vv b;
    public static final vv c;
    public static final vv d;
    public static final vv e;
    public static final vv f;
    public static final vv g;
    public static final vv h;
    public static final vv i;
    final Object j;
    public final int k;
    public final Class l;
    public final we m;

    static {
        new vv(1);
        new vv(2);
        new vv(4);
        new vv(8);
        new vv(16);
        new vv(32);
        new vv(64);
        new vv(128);
        new vv(256, vx.class);
        new vv(512, vx.class);
        new vv(1024, vy.class);
        new vv(AIFeature.Id.PIXEL_AI_FEATURE_48, vy.class);
        a = new vv(4096);
        b = new vv(8192);
        new vv(16384);
        new vv(32768);
        new vv(65536);
        new vv(131072, wc.class);
        c = new vv(262144);
        d = new vv(524288);
        e = new vv(1048576);
        new vv(2097152, wd.class);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f = new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, wa.class);
        g = new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        h = new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, wb.class);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, vz.class);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null, null);
        new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        i = new vv(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public vv(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.j).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.j).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof vv) && this.j.equals(((vv) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strB = vw.b(this.k);
        if (strB.equals("ACTION_UNKNOWN") && b() != null) {
            strB = b().toString();
        }
        sb.append(strB);
        return sb.toString();
    }

    private vv(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public vv(Object obj, int i2, CharSequence charSequence, we weVar, Class cls) {
        this.k = i2;
        this.m = weVar;
        this.j = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.l = cls;
    }
}
