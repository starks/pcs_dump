package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bo {
    private static boolean g(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    protected static void u(List list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        int[] iArr = ut.a;
        if (un.l(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!g(list, childAt, size) && un.l(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    protected static boolean w(List list) {
        return list == null || list.isEmpty();
    }

    protected static final void x(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract Object c(Object obj);

    public abstract void d(Object obj, View view);

    public abstract void e(Object obj, ArrayList arrayList);

    public abstract void f(ViewGroup viewGroup, Object obj);

    public abstract void h(Object obj, View view, ArrayList arrayList);

    public abstract void i(Object obj, Rect rect);

    public abstract void j(Object obj, View view);

    public void k(ab abVar, Object obj, sk skVar, Runnable runnable) {
        throw null;
    }

    public abstract void l(Object obj, View view, ArrayList arrayList);

    public abstract void m(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public boolean n() {
        throw null;
    }

    public boolean o(Object obj) {
        throw null;
    }

    public abstract Object p(Object obj, Object obj2);

    public abstract void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public Object r(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public void y(Object obj, sk skVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public void s(Object obj) {
    }

    public void t(Object obj, Runnable runnable) {
    }

    public void v(Object obj, float f) {
    }
}
