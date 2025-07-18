package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ks extends jv {
    private static TimeInterpolator r;
    boolean f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;

    public ks(byte[] bArr) {
        this();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
    }

    public static void n(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((km) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void o(List list, km kmVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ij ijVar = (ij) list.get(size);
            if (r(ijVar, kmVar) && ijVar.a == null && ijVar.b == null) {
                list.remove(ijVar);
            }
        }
    }

    private final void p(ij ijVar) {
        km kmVar = ijVar.a;
        if (kmVar != null) {
            r(ijVar, kmVar);
        }
        km kmVar2 = ijVar.b;
        if (kmVar2 != null) {
            r(ijVar, kmVar2);
        }
    }

    private final void q(km kmVar) {
        if (r == null) {
            r = new ValueAnimator().getInterpolator();
        }
        kmVar.a.animate().setInterpolator(r);
        d(kmVar);
    }

    private final boolean r(ij ijVar, km kmVar) {
        if (ijVar.b == kmVar) {
            ijVar.b = null;
        } else {
            if (ijVar.a != kmVar) {
                return false;
            }
            ijVar.a = null;
        }
        kmVar.a.setAlpha(1.0f);
        kmVar.a.setTranslationX(0.0f);
        kmVar.a.setTranslationY(0.0f);
        b(kmVar);
        return true;
    }

    @Override // defpackage.jv
    public final void d(km kmVar) {
        View view = kmVar.a;
        view.animate().cancel();
        int size = this.i.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ik) this.i.get(size)).a == kmVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                b(kmVar);
                this.i.remove(size);
            }
        }
        o(this.j, kmVar);
        if (this.g.remove(kmVar)) {
            view.setAlpha(1.0f);
            b(kmVar);
        }
        if (this.h.remove(kmVar)) {
            view.setAlpha(1.0f);
            b(kmVar);
        }
        int size2 = this.m.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.m.get(size2);
            o(arrayList, kmVar);
            if (arrayList.isEmpty()) {
                this.m.remove(size2);
            }
        }
        int size3 = this.l.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.l.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((ik) arrayList2.get(size4)).a == kmVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    b(kmVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(size3);
                    }
                }
            }
        }
        int size5 = this.k.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.p.remove(kmVar);
                this.n.remove(kmVar);
                this.q.remove(kmVar);
                this.o.remove(kmVar);
                i();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.k.get(size5);
            if (arrayList3.remove(kmVar)) {
                view.setAlpha(1.0f);
                b(kmVar);
                if (arrayList3.isEmpty()) {
                    this.k.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.jv
    public final void e() {
        int size = this.i.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ik ikVar = (ik) this.i.get(size);
            View view = ikVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            b(ikVar.a);
            this.i.remove(size);
        }
        int size2 = this.g.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            b((km) this.g.get(size2));
            this.g.remove(size2);
        }
        int size3 = this.h.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            km kmVar = (km) this.h.get(size3);
            kmVar.a.setAlpha(1.0f);
            b(kmVar);
            this.h.remove(size3);
        }
        int size4 = this.j.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                p((ij) this.j.get(size4));
            }
        }
        this.j.clear();
        if (!f()) {
            return;
        }
        int size5 = this.l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.l.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    ik ikVar2 = (ik) arrayList.get(size6);
                    View view2 = ikVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    b(ikVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.l.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.k.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.k.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    km kmVar2 = (km) arrayList2.get(size8);
                    kmVar2.a.setAlpha(1.0f);
                    b(kmVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.k.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.m.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                n(this.p);
                n(this.o);
                n(this.n);
                n(this.q);
                c();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.m.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    p((ij) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.m.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // defpackage.jv
    public final boolean f() {
        return (this.h.isEmpty() && this.j.isEmpty() && this.i.isEmpty() && this.g.isEmpty() && this.o.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.q.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.m.isEmpty()) ? false : true;
    }

    @Override // defpackage.jv
    public final boolean g(km kmVar, km kmVar2, tz tzVar, tz tzVar2) {
        int i;
        int i2;
        int i3 = tzVar.b;
        int i4 = tzVar.a;
        if (kmVar2.A()) {
            int i5 = tzVar.b;
            i2 = tzVar.a;
            i = i5;
        } else {
            i = tzVar2.b;
            i2 = tzVar2.a;
        }
        return j(kmVar, kmVar2, i3, i4, i, i2);
    }

    public final void i() {
        if (f()) {
            return;
        }
        c();
    }

    public final boolean j(km kmVar, km kmVar2, int i, int i2, int i3, int i4) {
        if (kmVar == kmVar2) {
            return k(kmVar, i, i2, i3, i4);
        }
        float translationX = kmVar.a.getTranslationX();
        float translationY = kmVar.a.getTranslationY();
        float alpha = kmVar.a.getAlpha();
        q(kmVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        kmVar.a.setTranslationX(translationX);
        kmVar.a.setTranslationY(translationY);
        kmVar.a.setAlpha(alpha);
        if (kmVar2 != null) {
            q(kmVar2);
            kmVar2.a.setTranslationX(-((int) f));
            kmVar2.a.setTranslationY(-((int) f2));
            kmVar2.a.setAlpha(0.0f);
        }
        this.j.add(new ij(kmVar, kmVar2, i, i2, i3, i4));
        return true;
    }

    public final boolean k(km kmVar, int i, int i2, int i3, int i4) {
        View view = kmVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) kmVar.a.getTranslationY();
        q(kmVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                b(kmVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.i.add(new ik(kmVar, i5, i7, i3, i4));
        return true;
    }

    public final void l(km kmVar) {
        q(kmVar);
        kmVar.a.setAlpha(0.0f);
        this.h.add(kmVar);
    }

    public final void m(km kmVar) {
        q(kmVar);
        this.g.add(kmVar);
    }

    public ks() {
        this.f = true;
    }
}
