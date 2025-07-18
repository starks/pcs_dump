package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.apps.aicore.aidl.AIFeature;
import defpackage.a;
import defpackage.ahn;
import defpackage.ayo;
import defpackage.brb;
import defpackage.dr;
import defpackage.fuu;
import defpackage.gp;
import defpackage.gq;
import defpackage.ic;
import defpackage.ir;
import defpackage.iu;
import defpackage.iw;
import defpackage.jr;
import defpackage.jt;
import defpackage.jv;
import defpackage.jy;
import defpackage.jz;
import defpackage.ka;
import defpackage.kb;
import defpackage.kc;
import defpackage.ke;
import defpackage.kf;
import defpackage.ki;
import defpackage.kj;
import defpackage.kk;
import defpackage.kl;
import defpackage.km;
import defpackage.ko;
import defpackage.ks;
import defpackage.lo;
import defpackage.oc;
import defpackage.p;
import defpackage.tq;
import defpackage.tr;
import defpackage.tv;
import defpackage.tw;
import defpackage.tz;
import defpackage.up;
import defpackage.ur;
import defpackage.ut;
import defpackage.ux;
import defpackage.vr;
import defpackage.wh;
import defpackage.wj;
import defpackage.wp;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements tv {
    public static final /* synthetic */ int W = 0;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public jv E;
    public float F;
    public float G;
    public final kl H;
    public iw I;
    public iu J;
    public final kj K;
    public List L;
    public boolean M;
    public boolean N;
    public boolean O;
    public ko P;
    public final int[] Q;
    final List R;
    boolean S;
    tq T;
    public final ayo U;
    brb V;
    private final int[] aA;
    private Runnable aB;
    private boolean aC;
    private int aD;
    private int aE;
    private final tr aF;
    private jt aG;
    private fuu aH;
    private final fuu aI;
    private final float ad;
    private final ke ae;
    private final Rect af;
    private int ag;
    private boolean ah;
    private int ai;
    private final AccessibilityManager aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private VelocityTracker ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private final int au;
    private final int av;
    private boolean aw;
    private final int[] ax;
    private tw ay;
    private final int[] az;
    public final kc f;
    kf g;
    public gq h;
    public ic i;
    boolean j;
    public final Rect k;
    public final RectF l;
    public jr m;
    public jy n;
    public final List o;
    public final ArrayList p;
    public final ArrayList q;
    public ka r;
    public boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    public boolean x;
    public boolean y;
    boolean z;
    private static final int[] aa = {R.attr.nestedScrollingEnabled};
    private static final float ab = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean a = false;
    public static final boolean b = true;
    public static final boolean c = true;
    private static final Class[] ac = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public static final Interpolator d = new wp(1);
    static final kk e = new kk();

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void E(View view, Rect rect) {
        jz jzVar = (jz) view.getLayoutParams();
        Rect rect2 = jzVar.d;
        rect.set((view.getLeft() - rect2.left) - jzVar.leftMargin, (view.getTop() - rect2.top) - jzVar.topMargin, view.getRight() + rect2.right + jzVar.rightMargin, view.getBottom() + rect2.bottom + jzVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.A;
        float f2 = 0.0f;
        if (edgeEffect == null || wh.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && wh.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.C.onRelease();
                } else {
                    float fB = wh.b(this.C, width, height);
                    if (wh.a(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.A.onRelease();
            } else {
                float f3 = -wh.b(this.A, -width, 1.0f - height);
                if (wh.a(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private final void aA() {
        kj kjVar = this.K;
        kjVar.m = -1L;
        kjVar.l = -1;
        kjVar.n = -1;
    }

    private final void aB() {
        VelocityTracker velocityTracker = this.ao;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        Y(0);
        ay();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aC(int i) {
        boolean zW = this.n.W();
        int i2 = zW;
        if (this.n.X()) {
            i2 = (zW ? 1 : 0) | 2;
        }
        an(i2, i);
    }

    private final void aD() {
        ki kiVar;
        this.H.d();
        jy jyVar = this.n;
        if (jyVar == null || (kiVar = jyVar.t) == null) {
            return;
        }
        kiVar.c();
    }

    private final boolean aE(MotionEvent motionEvent) {
        ArrayList arrayList = this.q;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ka kaVar = (ka) this.q.get(i);
            if (kaVar.h(motionEvent) && action != 3) {
                this.r = kaVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aF() {
        return this.E != null && this.n.u();
    }

    private final boolean aG(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA = wh.a(edgeEffect) * i2;
        double dLog = Math.log((Math.abs(-i) * 0.35f) / (this.ad * 0.015f));
        double d2 = ab;
        return ((float) (((double) (this.ad * 0.015f)) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fA;
    }

    private final void aH(Context context, String str, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(jy.class);
                try {
                    constructor = clsAsSubclass.getConstructor(ac);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e2) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(a.A(strTrim, attributeSet, ": Error creating LayoutManager "), e3);
                    }
                }
                constructor.setAccessible(true);
                T((jy) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(a.A(strTrim, attributeSet, ": Class is not a LayoutManager "), e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(a.A(strTrim, attributeSet, ": Unable to find LayoutManager "), e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(a.A(strTrim, attributeSet, ": Cannot access non-public constructor "), e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(a.A(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(a.A(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e8);
            }
        }
    }

    private final brb aI() {
        if (this.V == null) {
            this.V = new brb((View) this);
        }
        return this.V;
    }

    public static final int ah(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && wh.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * wh.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || wh.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * wh.b(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static final void ai(View view) {
        g(view);
    }

    public static final long aj() {
        if (c) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int aq(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.B;
        float f2 = 0.0f;
        if (edgeEffect == null || wh.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && wh.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.D.onRelease();
                } else {
                    float fB = wh.b(this.D, height, 1.0f - width);
                    if (wh.a(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.B.onRelease();
            } else {
                float f3 = -wh.b(this.B, -height, width);
                if (wh.a(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final tw ar() {
        if (this.ay == null) {
            this.ay = new tw(this);
        }
        return this.ay;
    }

    private final void as() {
        aB();
        U(0);
    }

    private final void at() {
        lo loVar;
        View viewI;
        this.K.b(1);
        D(this.K);
        this.K.i = false;
        W();
        this.U.g();
        K();
        ax();
        km kmVarF = null;
        View focusedChild = (this.aw && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewI = i(focusedChild)) != null) {
            kmVarF = f(viewI);
        }
        if (kmVarF == null) {
            aA();
        } else {
            kj kjVar = this.K;
            kjVar.m = this.m.c ? kmVarF.e : -1L;
            kjVar.l = this.y ? -1 : kmVarF.v() ? kmVarF.d : kmVarF.a();
            kj kjVar2 = this.K;
            View focusedChild2 = kmVarF.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            kjVar2.n = id;
        }
        kj kjVar3 = this.K;
        kjVar3.h = kjVar3.j && this.N;
        this.N = false;
        this.M = false;
        kjVar3.g = kjVar3.k;
        kjVar3.e = this.m.a();
        av(this.ax);
        if (this.K.j) {
            int iA = this.i.a();
            for (int i = 0; i < iA; i++) {
                km kmVarG = g(this.i.e(i));
                if (!kmVarG.A() && (!kmVarG.t() || this.m.c)) {
                    jv.a(kmVarG);
                    kmVarG.d();
                    this.U.m(kmVarG, jv.h(kmVarG));
                    if (this.K.h && kmVarG.y() && !kmVarG.v() && !kmVarG.A() && !kmVarG.t()) {
                        this.U.f(c(kmVarG), kmVarG);
                    }
                }
            }
        }
        if (this.K.k) {
            int iC = this.i.c();
            for (int i2 = 0; i2 < iC; i2++) {
                km kmVarG2 = g(this.i.f(i2));
                if (!kmVarG2.A() && kmVarG2.d == -1) {
                    kmVarG2.d = kmVarG2.c;
                }
            }
            kj kjVar4 = this.K;
            boolean z = kjVar4.f;
            kjVar4.f = false;
            this.n.o(this.f, kjVar4);
            this.K.f = z;
            for (int i3 = 0; i3 < this.i.a(); i3++) {
                km kmVarG3 = g(this.i.e(i3));
                if (!kmVarG3.A() && ((loVar = (lo) ((oc) this.U.a).get(kmVarG3)) == null || (loVar.a & 4) == 0)) {
                    jv.a(kmVarG3);
                    boolean zQ = kmVarG3.q(8192);
                    kmVarG3.d();
                    tz tzVarH = jv.h(kmVarG3);
                    if (zQ) {
                        ao(kmVarG3, tzVarH);
                    } else {
                        ayo ayoVar = this.U;
                        lo loVarA = (lo) ((oc) ayoVar.a).get(kmVarG3);
                        if (loVarA == null) {
                            Object obj = ayoVar.a;
                            loVarA = lo.a();
                            ((oc) obj).put(kmVarG3, loVarA);
                        }
                        loVarA.a |= 2;
                        loVarA.c = tzVarH;
                    }
                }
            }
            s();
        } else {
            s();
        }
        L();
        X(false);
        this.K.d = 2;
    }

    private final void au() {
        W();
        K();
        this.K.b(6);
        this.h.e();
        int iA = this.m.a();
        kj kjVar = this.K;
        kjVar.e = iA;
        kjVar.c = 0;
        if (this.g != null) {
            int i = this.m.d;
            Parcelable parcelable = this.g.a;
            if (parcelable != null) {
                this.n.S(parcelable);
            }
            this.g = null;
        }
        kj kjVar2 = this.K;
        kjVar2.g = false;
        this.n.o(this.f, kjVar2);
        kj kjVar3 = this.K;
        kjVar3.f = false;
        kjVar3.j = kjVar3.j && this.E != null;
        kjVar3.d = 4;
        L();
        X(false);
    }

    private final void av(int[] iArr) {
        int iA = this.i.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            km kmVarG = g(this.i.e(i3));
            if (!kmVarG.A()) {
                int iC = kmVarG.c();
                if (iC < i2) {
                    i2 = iC;
                }
                if (iC > i) {
                    i = iC;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aw(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.an) {
            int i = actionIndex == 0 ? 1 : 0;
            this.an = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.ar = x;
            this.ap = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.as = y;
            this.aq = y;
        }
    }

    private final void ax() {
        boolean z;
        if (this.y) {
            this.h.j();
            if (this.z) {
                this.n.x();
            }
        }
        if (aF()) {
            this.h.g();
        } else {
            this.h.e();
        }
        boolean z2 = this.M || this.N;
        kj kjVar = this.K;
        boolean z3 = this.u && this.E != null && ((z = this.y) || z2 || this.n.u) && (!z || this.m.c);
        kjVar.j = z3;
        kjVar.k = z3 && z2 && !this.y && aF();
    }

    private final void ay() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void az(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof jz) {
            jz jzVar = (jz) layoutParams;
            if (!jzVar.e) {
                Rect rect = jzVar.d;
                this.k.left -= rect.left;
                this.k.right += rect.right;
                this.k.top -= rect.top;
                this.k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.k);
            offsetRectIntoDescendantCoords(view, this.k);
        } else {
            view2 = null;
        }
        this.n.bb(this, view, this.k, !this.u, view2 == null);
    }

    public static km g(View view) {
        if (view == null) {
            return null;
        }
        return ((jz) view.getLayoutParams()).c;
    }

    public static RecyclerView h(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewH = h(viewGroup.getChildAt(i));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static void r(km kmVar) {
        WeakReference weakReference = kmVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == kmVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            kmVar.b = null;
        }
    }

    public final void A() {
        if (this.A != null) {
            return;
        }
        EdgeEffect edgeEffectL = this.aG.l(this);
        this.A = edgeEffectL;
        if (this.j) {
            edgeEffectL.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectL.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.C != null) {
            return;
        }
        EdgeEffect edgeEffectL = this.aG.l(this);
        this.C = edgeEffectL;
        if (this.j) {
            edgeEffectL.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectL.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectL = this.aG.l(this);
        this.B = edgeEffectL;
        if (this.j) {
            edgeEffectL.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectL.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void D(kj kjVar) {
        if (this.am != 2) {
            kjVar.o = 0;
            kjVar.p = 0;
        } else {
            OverScroller overScroller = this.H.a;
            kjVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            kjVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void F() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void G() {
        if (this.p.size() == 0) {
            return;
        }
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.O("Cannot invalidate item decorations during a scroll or layout");
        }
        I();
        requestLayout();
    }

    public final void H(int i) {
        if (this.n == null) {
            return;
        }
        U(2);
        this.n.T(i);
        awakenScrollBars();
    }

    public final void I() {
        int iC = this.i.c();
        for (int i = 0; i < iC; i++) {
            ((jz) this.i.f(i).getLayoutParams()).e = true;
        }
        kc kcVar = this.f;
        int size = kcVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            jz jzVar = (jz) ((km) kcVar.c.get(i2)).a.getLayoutParams();
            if (jzVar != null) {
                jzVar.e = true;
            }
        }
    }

    public final void J(int i, int i2, boolean z) {
        int i3;
        int iC = this.i.c();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iC) {
                break;
            }
            km kmVarG = g(this.i.f(i4));
            if (kmVarG != null && !kmVarG.A()) {
                int i5 = kmVarG.c;
                if (i5 >= i3) {
                    kmVarG.k(-i2, z);
                    this.K.f = true;
                } else if (i5 >= i) {
                    kmVarG.f(8);
                    kmVarG.k(-i2, z);
                    kmVarG.c = i - 1;
                    this.K.f = true;
                }
            }
            i4++;
        }
        kc kcVar = this.f;
        int size = kcVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            km kmVar = (km) kcVar.c.get(size);
            if (kmVar != null) {
                int i6 = kmVar.c;
                if (i6 >= i3) {
                    kmVar.k(-i2, z);
                } else if (i6 >= i) {
                    kmVar.f(8);
                    kcVar.i(size);
                }
            }
        }
    }

    public final void K() {
        this.ak++;
    }

    final void L() {
        M(true);
    }

    public final void M(boolean z) {
        int i;
        int i2 = this.ak - 1;
        this.ak = i2;
        if (i2 <= 0) {
            this.ak = 0;
            if (z) {
                int i3 = this.ai;
                this.ai = 0;
                if (i3 != 0 && ae()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(AIFeature.Id.PIXEL_AI_FEATURE_48);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                for (int size = this.R.size() - 1; size >= 0; size--) {
                    km kmVar = (km) this.R.get(size);
                    if (kmVar.a.getParent() == this && !kmVar.A() && (i = kmVar.p) != -1) {
                        kmVar.a.setImportantForAccessibility(i);
                        kmVar.p = -1;
                    }
                }
                this.R.clear();
            }
        }
    }

    public final void N() {
        if (this.O || !this.s) {
            return;
        }
        Runnable runnable = this.aB;
        int[] iArr = ut.a;
        postOnAnimation(runnable);
        this.O = true;
    }

    public final void O(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iC = this.i.c();
        for (int i = 0; i < iC; i++) {
            km kmVarG = g(this.i.f(i));
            if (kmVarG != null && !kmVarG.A()) {
                kmVarG.f(6);
            }
        }
        I();
        kc kcVar = this.f;
        int size = kcVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            km kmVar = (km) kcVar.c.get(i2);
            if (kmVar != null) {
                kmVar.f(6);
                kmVar.e(null);
            }
        }
        jr jrVar = kcVar.f.m;
        if (jrVar == null || !jrVar.c) {
            kcVar.h();
        }
    }

    public final void P() {
        jv jvVar = this.E;
        if (jvVar != null) {
            jvVar.e();
        }
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.aM(this.f);
            this.n.aN(this.f);
        }
        this.f.d();
    }

    public final void Q(int i, int i2, int[] iArr) {
        km kmVar;
        W();
        K();
        Trace.beginSection("RV Scroll");
        D(this.K);
        int iD = i != 0 ? this.n.d(i, this.f, this.K) : 0;
        int iE = i2 != 0 ? this.n.e(i2, this.f, this.K) : 0;
        Trace.endSection();
        int iA = this.i.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewE = this.i.e(i3);
            km kmVarF = f(viewE);
            if (kmVarF != null && (kmVar = kmVarF.i) != null) {
                int left = viewE.getLeft();
                int top = viewE.getTop();
                View view = kmVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        L();
        X(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public final void R(ko koVar) {
        this.P = koVar;
        ut.j(this, koVar);
    }

    public final void S(jr jrVar) {
        suppressLayout(false);
        jr jrVar2 = this.m;
        if (jrVar2 != null) {
            jrVar2.b.unregisterObserver(this.ae);
        }
        P();
        this.h.j();
        jr jrVar3 = this.m;
        this.m = jrVar;
        if (jrVar != null) {
            jrVar.b.registerObserver(this.ae);
        }
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.bn();
        }
        kc kcVar = this.f;
        jr jrVar4 = this.m;
        kcVar.d();
        kcVar.f(jrVar3, true);
        ahn ahnVarP = kcVar.p();
        if (jrVar3 != null) {
            ahnVarP.a--;
        }
        if (ahnVarP.a == 0) {
            for (int i = 0; i < ((SparseArray) ahnVarP.c).size(); i++) {
                kb kbVar = (kb) ((SparseArray) ahnVarP.c).valueAt(i);
                ArrayList arrayList = kbVar.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    vr.b(((km) arrayList.get(i2)).a);
                }
                kbVar.a.clear();
            }
        }
        if (jrVar4 != null) {
            ahnVarP.a++;
        }
        kcVar.e();
        this.K.f = true;
        O(false);
        requestLayout();
    }

    public final void T(jy jyVar) {
        if (jyVar == this.n) {
            return;
        }
        Z();
        if (this.n != null) {
            jv jvVar = this.E;
            if (jvVar != null) {
                jvVar.e();
            }
            this.n.aM(this.f);
            this.n.aN(this.f);
            this.f.d();
            if (this.s) {
                this.n.aH(this, this.f);
            }
            this.n.aX(null);
            this.n = null;
        } else {
            this.f.d();
        }
        ic icVar = this.i;
        icVar.a.d();
        int size = icVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            icVar.e.J((View) icVar.b.get(size));
            icVar.b.remove(size);
        }
        fuu fuuVar = icVar.e;
        int iG = fuuVar.G();
        for (int i = 0; i < iG; i++) {
            View viewI = fuuVar.I(i);
            ai(viewI);
            viewI.clearAnimation();
        }
        ((RecyclerView) fuuVar.a).removeAllViews();
        this.n = jyVar;
        if (jyVar != null) {
            if (jyVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + jyVar + " is already attached to a RecyclerView:" + jyVar.s.j());
            }
            this.n.aX(this);
            if (this.s) {
                this.n.bd();
            }
        }
        this.f.n();
        requestLayout();
    }

    public final void U(int i) {
        if (i == this.am) {
            return;
        }
        this.am = i;
        if (i != 2) {
            aD();
        }
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.aL(i);
        }
        List list = this.L;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public final void V(int i) {
        if (this.w) {
            return;
        }
        jy jyVar = this.n;
        if (jyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            jyVar.ak(this, i);
        }
    }

    public final void W() {
        int i = this.ag + 1;
        this.ag = i;
        if (i != 1 || this.w) {
            return;
        }
        this.v = false;
    }

    public final void X(boolean z) {
        int i = this.ag;
        if (i <= 0) {
            this.ag = 1;
            i = 1;
        }
        if (!z && !this.w) {
            this.v = false;
        }
        if (i == 1) {
            if (z && this.v && !this.w && this.n != null && this.m != null) {
                w();
            }
            if (!this.w) {
                this.v = false;
            }
        }
        this.ag--;
    }

    public final void Y(int i) {
        ar().c(i);
    }

    public final void Z() {
        U(0);
        aD();
    }

    public final boolean ab(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return ar().g(i, i2, iArr, iArr2, i3);
    }

    public final boolean ac(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        jy jyVar = this.n;
        if (jyVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.w) {
            return false;
        }
        boolean zW = jyVar.W();
        boolean zX = this.n.X();
        if (!zW || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zX || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || wh.a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && wh.a(edgeEffect2) != 0.0f) {
                    if (aG(this.C, i, getWidth())) {
                        this.C.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
                i5 = 0;
            } else {
                int i7 = -i;
                if (aG(this.A, i7, getWidth())) {
                    this.A.onAbsorb(i7);
                    i = 0;
                }
                i5 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || wh.a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 != null && wh.a(edgeEffect4) != 0.0f) {
                    if (aG(this.D, i2, getHeight())) {
                        this.D.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                i6 = i2;
                i2 = 0;
            } else {
                int i8 = -i2;
                if (aG(this.B, i8, getHeight())) {
                    this.B.onAbsorb(i8);
                    i2 = 0;
                }
                i6 = 0;
            }
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = Math.max(i9, Math.min(i5, i4));
            iMax2 = Math.max(i9, Math.min(i2, i4));
            aC(1);
            this.H.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i92 = -i4;
            iMax = Math.max(i92, Math.min(i5, i4));
            iMax2 = Math.max(i92, Math.min(i2, i4));
            aC(1);
            this.H.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i6 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zW || zX;
            dispatchNestedFling(f, f2, z);
            if (z) {
                int i10 = -i4;
                aC(1);
                this.H.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean ad() {
        return !this.u || this.y || this.h.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public final boolean ae() {
        AccessibilityManager accessibilityManager = this.aj;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean af() {
        return this.ak > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ag(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ag(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    public final void ak(km kmVar, int i) {
        if (!af()) {
            kmVar.a.setImportantForAccessibility(i);
        } else {
            kmVar.p = i;
            this.R.add(kmVar);
        }
    }

    public final void al(int i, int i2) {
        am(i, i2, false);
    }

    public final void am(int i, int i2, boolean z) {
        jy jyVar = this.n;
        if (jyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) {
            return;
        }
        if (true != jyVar.W()) {
            i = 0;
        }
        if (true != this.n.X()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            an(i3, 1);
        }
        this.H.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void an(int i, int i2) {
        ar().m(i, i2);
    }

    public final void ao(km kmVar, tz tzVar) {
        kmVar.m(0, 8192);
        if (this.K.h && kmVar.y() && !kmVar.v() && !kmVar.A()) {
            this.U.f(c(kmVar), kmVar);
        }
        this.U.m(kmVar, tzVar);
    }

    public final void ap(jt jtVar) {
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.O("Cannot add item decoration during a scroll  or layout");
        }
        if (this.p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.p.add(jtVar);
        I();
        requestLayout();
    }

    public final int b(km kmVar) {
        if (kmVar.q(524) || !kmVar.s()) {
            return -1;
        }
        gq gqVar = this.h;
        int i = kmVar.c;
        int size = gqVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            gp gpVar = (gp) gqVar.a.get(i2);
            int i3 = gpVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = gpVar.b;
                    if (i4 <= i) {
                        int i5 = gpVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = gpVar.b;
                    if (i6 == i) {
                        i = gpVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (gpVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (gpVar.b <= i) {
                i += gpVar.d;
            }
        }
        return i;
    }

    final long c(km kmVar) {
        return this.m.c ? kmVar.e : kmVar.c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof jz) && this.n.s((jz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        jy jyVar = this.n;
        if (jyVar != null && jyVar.W()) {
            return this.n.B(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        jy jyVar = this.n;
        if (jyVar != null && jyVar.W()) {
            return this.n.C(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        jy jyVar = this.n;
        if (jyVar != null && jyVar.W()) {
            return this.n.D(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        jy jyVar = this.n;
        if (jyVar != null && jyVar.X()) {
            return this.n.E(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        jy jyVar = this.n;
        if (jyVar != null && jyVar.X()) {
            return this.n.F(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        jy jyVar = this.n;
        if (jyVar != null && jyVar.X()) {
            return this.n.G(this.K);
        }
        return 0;
    }

    public final Rect d(View view) {
        jz jzVar = (jz) view.getLayoutParams();
        if (!jzVar.e) {
            return jzVar.d;
        }
        if (this.K.g && (jzVar.b() || jzVar.c.t())) {
            return jzVar.d;
        }
        Rect rect = jzVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            this.k.set(0, 0, 0, 0);
            ((jt) this.p.get(i)).m(this.k, view, this);
            rect.left += this.k.left;
            rect.top += this.k.top;
            rect.right += this.k.right;
            rect.bottom += this.k.bottom;
        }
        jzVar.e = false;
        return rect;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        jy jyVar = this.n;
        int iA = 0;
        if (jyVar == null) {
            return false;
        }
        if (jyVar.X()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    al(0, measuredHeight);
                } else {
                    al(0, -measuredHeight);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAa = jyVar.aa();
                if (keyCode == 122) {
                    if (zAa) {
                        iA = this.m.a();
                    }
                } else if (!zAa) {
                    iA = this.m.a();
                }
                V(iA);
                return true;
            }
        } else if (jyVar.W()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    al(measuredWidth, 0);
                } else {
                    al(-measuredWidth, 0);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAa2 = jyVar.aa();
                if (keyCode2 == 122) {
                    if (zAa2) {
                        iA = this.m.a();
                    }
                } else if (!zAa2) {
                    iA = this.m.a();
                }
                V(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return ar().d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return ar().e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return ar().f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return ar().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.p.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((jt) this.p.get(i)).g(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.j) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && this.p.size() > 0 && this.E.f())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final km e(int i) {
        km kmVar = null;
        if (this.y) {
            return null;
        }
        int iC = this.i.c();
        for (int i2 = 0; i2 < iC; i2++) {
            km kmVarG = g(this.i.f(i2));
            if (kmVarG != null && !kmVarG.v() && b(kmVarG) == i) {
                if (!this.i.k(kmVarG.a)) {
                    return kmVarG;
                }
                kmVar = kmVarG;
            }
        }
        return kmVar;
    }

    public final km f(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g(view);
        }
        throw new IllegalArgumentException(a.B(this, view, "View ", " is not a direct child of "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0190, code lost:
    
        if (r2 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ae, code lost:
    
        if (r10 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b1, code lost:
    
        if (r2 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b4, code lost:
    
        if (r10 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c4, code lost:
    
        if ((r10 * r3) >= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        if (r13.k.right <= r13.af.left) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0136, code lost:
    
        if (r13.k.left >= r13.af.right) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0157, code lost:
    
        if (r13.k.bottom <= r13.af.top) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        jy jyVar = this.n;
        if (jyVar != null) {
            return jyVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(String.valueOf(j())));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        jy jyVar = this.n;
        if (jyVar != null) {
            return jyVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(String.valueOf(j())));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.j;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return ar().j();
    }

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return ar().a;
    }

    public final String j() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ak = 0;
        this.s = true;
        this.u = this.u && !isLayoutRequested();
        this.f.e();
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.bd();
        }
        this.O = false;
        if (c) {
            iw iwVar = (iw) iw.a.get();
            this.I = iwVar;
            if (iwVar == null) {
                this.I = new iw();
                int[] iArr = ut.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                iw iwVar2 = this.I;
                iwVar2.e = (long) (1.0E9f / f);
                iw.a.set(iwVar2);
            }
            this.I.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        iw iwVar;
        super.onDetachedFromWindow();
        jv jvVar = this.E;
        if (jvVar != null) {
            jvVar.e();
        }
        Z();
        this.s = false;
        jy jyVar = this.n;
        if (jyVar != null) {
            jyVar.aH(this, this.f);
        }
        this.R.clear();
        removeCallbacks(this.aB);
        while (lo.b.a() != null) {
        }
        kc kcVar = this.f;
        for (int i = 0; i < kcVar.c.size(); i++) {
            vr.b(((km) kcVar.c.get(i)).a);
        }
        kcVar.f(kcVar.f.m, false);
        Iterator itA = new ux(this, 1).a();
        while (itA.hasNext()) {
            vr.g((View) itA.next()).f();
        }
        if (!c || (iwVar = this.I) == null) {
            return;
        }
        iwVar.c.remove(this);
        this.I = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c A[ADDED_TO_REGION] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.w) {
            return false;
        }
        this.r = null;
        if (aE(motionEvent)) {
            as();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                ka kaVar = (ka) this.q.get(i);
                if (kaVar != null && kaVar != this.r) {
                    kaVar.h(motionEventObtain);
                }
            }
            return true;
        }
        jy jyVar = this.n;
        if (jyVar == null) {
            return false;
        }
        boolean zW = jyVar.W();
        boolean zX = this.n.X();
        if (this.ao == null) {
            this.ao = VelocityTracker.obtain();
        }
        this.ao.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ah) {
                this.ah = false;
            }
            this.an = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.ar = x;
            this.ap = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.as = y;
            this.aq = y;
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || wh.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                wh.b(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && wh.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                wh.b(this.C, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 != null && wh.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                wh.b(this.B, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.D;
            if (edgeEffect4 == null || wh.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.am == 2) {
                }
                int[] iArr = this.aA;
                iArr[1] = 0;
                iArr[0] = 0;
                aC(0);
            } else {
                wh.b(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            U(1);
            Y(1);
            int[] iArr2 = this.aA;
            iArr2[1] = 0;
            iArr2[0] = 0;
            aC(0);
        } else if (actionMasked == 1) {
            this.ao.clear();
            Y(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.an);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.an + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.am != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.ap;
                int i5 = i2 - this.aq;
                if (!zW || Math.abs(i4) <= this.at) {
                    z2 = false;
                } else {
                    this.ar = i3;
                    z2 = true;
                }
                if (zX && Math.abs(i5) > this.at) {
                    this.as = i2;
                } else if (z2) {
                }
                U(1);
            }
        } else if (actionMasked == 3) {
            as();
        } else if (actionMasked == 5) {
            this.an = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.ar = x3;
            this.ap = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.as = y3;
            this.aq = y3;
        } else if (actionMasked == 6) {
            aw(motionEvent);
        }
        return this.am == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        w();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        jy jyVar = this.n;
        if (jyVar == null) {
            v(i, i2);
            return;
        }
        boolean z = false;
        if (jyVar.Y()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.bo(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aC = z;
            if (z || this.m == null) {
                return;
            }
            if (this.K.d == 1) {
                at();
            }
            this.n.aU(i, i2);
            this.K.i = true;
            au();
            this.n.aW(i, i2);
            if (this.n.ac()) {
                this.n.aU(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.K.i = true;
                au();
                this.n.aW(i, i2);
            }
            this.aD = getMeasuredWidth();
            this.aE = getMeasuredHeight();
            return;
        }
        if (this.x) {
            W();
            K();
            ax();
            L();
            kj kjVar = this.K;
            if (kjVar.k) {
                kjVar.g = true;
            } else {
                this.h.e();
                this.K.g = false;
            }
            this.x = false;
            X(false);
        } else if (this.K.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        jr jrVar = this.m;
        if (jrVar != null) {
            this.K.e = jrVar.a();
        } else {
            this.K.e = 0;
        }
        W();
        this.n.bo(i, i2);
        X(false);
        this.K.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (af()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof kf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kf kfVar = (kf) parcelable;
        this.g = kfVar;
        super.onRestoreInstanceState(kfVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        kf kfVar = new kf(super.onSaveInstanceState());
        kf kfVar2 = this.g;
        if (kfVar2 != null) {
            kfVar.a = kfVar2.a;
            return kfVar;
        }
        jy jyVar = this.n;
        if (jyVar != null) {
            kfVar.a = jyVar.L();
            return kfVar;
        }
        kfVar.a = null;
        return kfVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        F();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(km kmVar) {
        View view = kmVar.a;
        ViewParent parent = view.getParent();
        this.f.m(f(view));
        if (kmVar.x()) {
            this.i.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.i.g(view, -1, true);
            return;
        }
        ic icVar = this.i;
        int iH = icVar.e.H(view);
        if (iH < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        icVar.a.e(iH);
        icVar.j(view);
    }

    public final void q(String str) {
        if (af()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(String.valueOf(j())));
        }
        if (this.al > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(String.valueOf(j()))));
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        km kmVarG = g(view);
        if (kmVarG != null) {
            if (kmVarG.x()) {
                kmVarG.j();
            } else if (!kmVarG.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + kmVarG + j());
            }
        }
        view.clearAnimation();
        ai(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.ba() && !af() && view2 != null) {
            az(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.bb(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((ka) this.q.get(i)).i();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ag != 0 || this.w) {
            this.v = true;
        } else {
            super.requestLayout();
        }
    }

    final void s() {
        int iC = this.i.c();
        for (int i = 0; i < iC; i++) {
            km kmVarG = g(this.i.f(i));
            if (!kmVarG.A()) {
                kmVarG.g();
            }
        }
        kc kcVar = this.f;
        int size = kcVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((km) kcVar.c.get(i2)).g();
        }
        int size2 = kcVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((km) kcVar.a.get(i3)).g();
        }
        ArrayList arrayList = kcVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((km) kcVar.b.get(i4)).g();
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        jy jyVar = this.n;
        if (jyVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) {
            return;
        }
        boolean zW = jyVar.W();
        boolean zX = this.n.X();
        if (!zW) {
            if (!zX) {
                return;
            } else {
                zX = true;
            }
        }
        ag(true != zW ? 0 : i, true != zX ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!af()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.ai |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.j) {
            F();
        }
        this.j = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        ar().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return ar().l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        ar().b();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.w) {
            q("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.w = true;
                this.ah = true;
                Z();
                return;
            }
            this.w = false;
            if (this.v && this.n != null && this.m != null) {
                requestLayout();
            }
            this.v = false;
        }
    }

    public final void t(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void u() {
        if (!this.u || this.y) {
            Trace.beginSection("RV FullInvalidate");
            w();
            Trace.endSection();
            return;
        }
        if (this.h.l()) {
            if (!this.h.k(4) || this.h.k(11)) {
                if (this.h.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    w();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            W();
            K();
            this.h.g();
            if (!this.v) {
                int iA = this.i.a();
                int i = 0;
                while (true) {
                    if (i < iA) {
                        km kmVarG = g(this.i.e(i));
                        if (kmVarG != null && !kmVarG.A() && kmVarG.y()) {
                            w();
                            break;
                        }
                        i++;
                    } else {
                        this.h.d();
                        break;
                    }
                }
            }
            X(true);
            L();
            Trace.endSection();
        }
    }

    public final void v(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = ut.a;
        setMeasuredDimension(jy.al(i, paddingLeft, getMinimumWidth()), jy.al(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0366  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void w() {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.w():void");
    }

    public final void x(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ar().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void y(int i, int i2) {
        this.al++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((jt) this.L.get(size)).a(this);
                }
            }
        }
        this.al--;
    }

    public final void z() {
        if (this.D != null) {
            return;
        }
        EdgeEffect edgeEffectL = this.aG.l(this);
        this.D = edgeEffectL;
        if (this.j) {
            edgeEffectL.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectL.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.as.oss.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.ae = new ke(recyclerView);
        recyclerView.f = new kc(recyclerView);
        recyclerView.U = new ayo((byte[]) null);
        recyclerView.k = new Rect();
        recyclerView.af = new Rect();
        recyclerView.l = new RectF();
        recyclerView.o = new ArrayList();
        recyclerView.p = new ArrayList();
        recyclerView.q = new ArrayList();
        recyclerView.ag = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.ak = 0;
        recyclerView.al = 0;
        recyclerView.aG = e;
        recyclerView.E = new ks(null);
        recyclerView.am = 0;
        recyclerView.an = -1;
        recyclerView.F = Float.MIN_VALUE;
        recyclerView.G = Float.MIN_VALUE;
        recyclerView.aw = true;
        recyclerView.H = new kl(recyclerView);
        recyclerView.J = c ? new iu() : null;
        recyclerView.K = new kj();
        recyclerView.M = false;
        recyclerView.N = false;
        recyclerView.aH = new fuu(recyclerView, null);
        recyclerView.O = false;
        recyclerView.ax = new int[2];
        recyclerView.az = new int[2];
        recyclerView.aA = new int[2];
        recyclerView.Q = new int[2];
        recyclerView.R = new ArrayList();
        recyclerView.aB = new p(recyclerView, 17, null);
        recyclerView.aD = 0;
        recyclerView.aE = 0;
        recyclerView.aI = new fuu(recyclerView, null);
        wj wjVar = new wj(recyclerView, 1);
        recyclerView.aF = wjVar;
        recyclerView.T = new tq(recyclerView.getContext(), wjVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.at = viewConfiguration.getScaledTouchSlop();
        recyclerView.F = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.G = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.au = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.av = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ad = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.e = recyclerView.aH;
        recyclerView.h = new gq(new fuu(recyclerView, null));
        recyclerView.i = new ic(new fuu(recyclerView, null));
        int[] iArr = ut.a;
        if (up.a(recyclerView) == 0) {
            up.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.aj = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.R(new ko(recyclerView));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dr.a, i, 0);
        ur.b(recyclerView, context, dr.a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.j = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        recyclerView.t = z;
        if (z) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = recyclerView.getContext().getResources();
                new ir(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.as.oss.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.as.oss.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.as.oss.R.dimen.fastscroll_margin));
                recyclerView = this;
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(String.valueOf(recyclerView.j())));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.S = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aH(context, string, attributeSet, i);
        int[] iArr2 = aa;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ur.b(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z2);
        recyclerView.setTag(com.google.android.as.oss.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        jy jyVar = this.n;
        if (jyVar != null) {
            return jyVar.g(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(String.valueOf(j())));
    }
}
