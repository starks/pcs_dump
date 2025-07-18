package defpackage;

import android.animation.TimeInterpolator;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vc extends WindowInsetsAnimation.Callback {
    private List a;
    private ArrayList b;
    private final HashMap c;
    private final uo d;

    public vc(uo uoVar) {
        super(0);
        this.c = new HashMap();
        this.d = uoVar;
    }

    private final ekb a(WindowInsetsAnimation windowInsetsAnimation) {
        ekb ekbVar = (ekb) this.c.get(windowInsetsAnimation);
        if (ekbVar != null) {
            return ekbVar;
        }
        ekb ekbVar2 = new ekb(windowInsetsAnimation);
        this.c.put(windowInsetsAnimation, ekbVar2);
        return ekbVar2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((cky) this.d).a.setTranslationY(0.0f);
        this.c.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        cky ckyVar = (cky) this.d;
        ckyVar.a.getLocationOnScreen(ckyVar.d);
        ckyVar.b = ckyVar.d[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.b = arrayList2;
            this.a = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            ekb ekbVarA = a(windowInsetsAnimation);
            ((ve) ekbVarA.a).c(windowInsetsAnimation.getFraction());
            this.b.add(ekbVarA);
        }
        uo uoVar = this.d;
        vs vsVarM = vs.m(windowInsets);
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ekb ekbVar = (ekb) it.next();
            if ((((ve) ekbVar.a).b() & 8) != 0) {
                cky ckyVar = (cky) uoVar;
                int i = ckyVar.c;
                float fA = ((ve) ekbVar.a).a() * (-i);
                TimeInterpolator timeInterpolator = cjl.a;
                ckyVar.a.setTranslationY(i + Math.round(fA));
                break;
            }
        }
        return vsVarM.e();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        vb vbVar = new vb(bounds);
        cky ckyVar = (cky) this.d;
        ckyVar.a.getLocationOnScreen(ckyVar.d);
        int i = ckyVar.b - ckyVar.d[1];
        ckyVar.c = i;
        ckyVar.a.setTranslationY(i);
        return new WindowInsetsAnimation.Bounds(vbVar.a.a(), vbVar.b.a());
    }
}
