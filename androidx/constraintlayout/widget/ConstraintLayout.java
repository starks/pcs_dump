package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.pg;
import defpackage.ph;
import defpackage.pj;
import defpackage.qd;
import defpackage.qf;
import defpackage.qg;
import defpackage.qp;
import defpackage.qr;
import defpackage.qu;
import defpackage.qy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final ph c;
    protected boolean d;
    public int e;
    final qg f;
    private int g;
    private int h;
    private int i;
    private int j;
    private qp k;
    private int l;
    private HashMap m;
    private int n;
    private int o;
    private final SparseArray p;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ph();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = new SparseArray();
        this.f = new qg(this, this);
        f(null, 0, 0);
    }

    private final void f(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        ph phVar = this.c;
        phVar.ah = this;
        qg qgVar = this.f;
        phVar.aH = qgVar;
        phVar.a.g = qgVar;
        this.a.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qu.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.g);
                } else if (index == 17) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.h);
                } else if (index == 14) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.i);
                } else if (index == 15) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.j);
                } else if (index == 113) {
                    this.e = typedArrayObtainStyledAttributes.getInt(113, this.e);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            c(resourceId);
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        qp qpVar = new qp();
                        this.k = qpVar;
                        qpVar.c(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.U(this.e);
    }

    private final void g() {
        this.d = true;
        this.n = -1;
        this.o = -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:89:0x01c4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x083d  */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h() throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 2242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.h():void");
    }

    private final void i(pg pgVar, qf qfVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        pg pgVar2 = (pg) sparseArray.get(i);
        if (pgVar2 == null || view == null || !(view.getLayoutParams() instanceof qf)) {
            return;
        }
        qfVar.ag = true;
        if (i2 == 6) {
            qf qfVar2 = (qf) view.getLayoutParams();
            qfVar2.ag = true;
            qfVar2.av.G = true;
        }
        pgVar.L(6).i(pgVar2.L(i2), qfVar.D, qfVar.C, true);
        pgVar.G = true;
        pgVar.L(3).d();
        pgVar.L(5).d();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final pg b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof qf) {
            return ((qf) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new qf(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof qf) {
            return ((qf) view.getLayoutParams()).av;
        }
        return null;
    }

    protected final void c(int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        qy.s(getContext(), i, new SparseArray(), new SparseArray());
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qf;
    }

    protected final boolean d() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f2 = i7;
                        float f3 = i6;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float f4 = i6 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, f4, paint);
                        canvas.drawLine(f, f4, f2, f4, paint);
                        canvas.drawLine(f2, f4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, f4, paint);
                        canvas.drawLine(f2, f4, f, f3, paint);
                    }
                }
            }
        }
    }

    public final Object e(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        g();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qf();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new qf(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L4f
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            qf r0 = (defpackage.qf) r0
            pg r1 = r0.av
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2d
            boolean r2 = r0.ah
            if (r2 != 0) goto L2d
            boolean r2 = r0.ai
            if (r2 != 0) goto L2d
            boolean r2 = r0.ak
            if (r6 != 0) goto L2d
            goto L48
        L2d:
            boolean r0 = r0.aj
            int r0 = r1.k()
            int r2 = r1.l()
            int r3 = r1.j()
            int r3 = r3 + r0
            int r1 = r1.h()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
            boolean r0 = r9 instanceof defpackage.qs
            if (r0 != 0) goto L4b
        L48:
            int r8 = r8 + 1
            goto La
        L4b:
            qs r9 = (defpackage.qs) r9
            r4 = 0
            throw r4
        L4f:
            java.util.ArrayList r5 = r4.b
            int r5 = r5.size()
            if (r5 <= 0) goto L64
        L57:
            if (r7 >= r5) goto L64
            java.util.ArrayList r6 = r4.b
            java.lang.Object r6 = r6.get(r7)
            qd r6 = (defpackage.qd) r6
            int r7 = r7 + 1
            goto L57
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r22, int r23) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof qr;
        pg pgVarB = b(view);
        if (z && !(pgVarB instanceof pj)) {
            qf qfVar = (qf) view.getLayoutParams();
            qfVar.av = new pj();
            qfVar.ah = true;
            ((pj) qfVar.av).c(qfVar.Z);
        }
        if (view instanceof qd) {
            qd qdVar = (qd) view;
            qdVar.g();
            ((qf) view.getLayoutParams()).ai = true;
            if (!this.b.contains(qdVar)) {
                this.b.add(qdVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Z(b(view));
        this.b.remove(view);
        this.d = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        g();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qf(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ph();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = new SparseArray();
        this.f = new qg(this, this);
        f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ph();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = new SparseArray();
        this.f = new qg(this, this);
        f(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ph();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = new SparseArray();
        this.f = new qg(this, this);
        f(attributeSet, i, i2);
    }
}
