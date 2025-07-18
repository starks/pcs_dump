package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jk implements fv {
    private Context a;
    private ListAdapter b;
    private int c;
    private int d;
    public io e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    public AdapterView.OnItemSelectedListener n;
    final Handler o;
    public boolean p;
    public PopupWindow q;
    final p r;
    private int s;
    private boolean t;
    private DataSetObserver u;
    private final jj v;
    private final ji w;
    private final Rect x;
    private Rect y;
    private final p z;

    public jk(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public final int a() {
        return this.g;
    }

    @Override // defpackage.fv
    public final ListView aJ() {
        return this.e;
    }

    public final int b() {
        if (this.t) {
            return this.d;
        }
        return 0;
    }

    public final Drawable c() {
        return this.q.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.u;
        if (dataSetObserver == null) {
            this.u = new jh(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        io ioVar = this.e;
        if (ioVar != null) {
            ioVar.setAdapter(this.b);
        }
    }

    @Override // defpackage.fv
    public final void f() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.r);
    }

    public final void g(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void h(int i) {
        this.g = i;
    }

    public final void k(int i) {
        this.d = i;
        this.t = true;
    }

    public final int o() {
        if (u()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public io p(Context context, boolean z) {
        return new io(context, z);
    }

    public final void q() {
        io ioVar = this.e;
        if (ioVar != null) {
            ioVar.a = true;
            ioVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.q.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        background.getPadding(this.x);
        Rect rect = this.x;
        this.f = rect.left + rect.right + i;
    }

    @Override // defpackage.fv
    public final void s() {
        int paddingTop;
        int iMakeMeasureSpec;
        if (this.e == null) {
            io ioVarP = p(this.a, !this.p);
            this.e = ioVarP;
            ioVarP.setAdapter(this.b);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new aaw(this, 1));
            this.e.setOnScrollListener(this.w);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.n;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.q.setContentView(this.e);
        }
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.x);
            Rect rect = this.x;
            paddingTop = rect.top + rect.bottom;
            if (!this.t) {
                this.d = -this.x.top;
            }
        } else {
            this.x.setEmpty();
            paddingTop = 0;
        }
        int maxAvailableHeight = this.q.getMaxAvailableHeight(this.l, this.d, this.q.getInputMethodMode() == 2);
        if (this.c != -1) {
            int i = this.f;
            if (i == -2) {
                int i2 = this.a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.x;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            } else {
                int i3 = this.a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.x;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (rect3.left + rect3.right), 1073741824);
            }
            maxAvailableHeight = this.e.b(iMakeMeasureSpec, maxAvailableHeight);
            paddingTop = maxAvailableHeight > 0 ? paddingTop + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        }
        boolean zW = w();
        this.q.setWindowLayoutType(this.s);
        int i4 = maxAvailableHeight + paddingTop;
        if (this.q.isShowing()) {
            if (this.l.isAttachedToWindow()) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.l.getWidth();
                }
                int i5 = this.c;
                if (i5 == -1) {
                    if (true != zW) {
                        i4 = -1;
                    }
                    if (zW) {
                        this.q.setWidth(this.f == -1 ? -1 : 0);
                        this.q.setHeight(0);
                    } else {
                        this.q.setWidth(this.f == -1 ? -1 : 0);
                        this.q.setHeight(-1);
                    }
                } else if (i5 != -2) {
                    i4 = i5;
                }
                this.q.setOutsideTouchable(true);
                this.q.update(this.l, this.g, this.d, width < 0 ? -1 : width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.l.getWidth();
        }
        int i6 = this.c;
        if (i6 == -1) {
            i4 = -1;
        } else if (i6 != -2) {
            i4 = i6;
        }
        this.q.setWidth(width2);
        this.q.setHeight(i4);
        this.q.setIsClippedToScreen(true);
        this.q.setOutsideTouchable(true);
        this.q.setTouchInterceptor(this.v);
        if (this.i) {
            this.q.setOverlapAnchor(this.h);
        }
        this.q.setEpicenterBounds(this.y);
        this.q.showAsDropDown(this.l, this.g, this.d, this.j);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            q();
        }
        if (this.p) {
            return;
        }
        this.o.post(this.z);
    }

    public final void t(Rect rect) {
        this.y = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.fv
    public final boolean u() {
        return this.q.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final boolean w() {
        return this.q.getInputMethodMode() == 2;
    }

    public final void x() {
        this.q.setInputMethodMode(2);
    }

    public final void y() {
        this.p = true;
        this.q.setFocusable(true);
    }

    public jk(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.c = -2;
        this.f = -2;
        this.s = AIFeature.Id.SUMMARIZATION_CPU_GEM_QUALCOMM;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.r = new p(this, 16, null);
        this.v = new jj(this);
        this.w = new ji(this);
        this.z = new p(this, 15, null);
        this.x = new Rect();
        this.a = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dp.o, i, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.d = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.t = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        he heVar = new he(context, attributeSet, i);
        this.q = heVar;
        heVar.setInputMethodMode(1);
    }
}
