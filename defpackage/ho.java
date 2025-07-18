package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ho extends jk implements hq {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ hr d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(hr hrVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = hrVar;
        this.c = new Rect();
        this.l = hrVar;
        y();
        this.m = new bdr(this, 1);
    }

    @Override // defpackage.hq
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.jk, defpackage.hq
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.hq
    public final void i(int i) {
        this.s = i;
    }

    @Override // defpackage.hq
    public final void j(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.hq
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        x();
        super.s();
        io ioVar = this.e;
        ioVar.setChoiceMode(1);
        ioVar.setTextDirection(i);
        ioVar.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        io ioVar2 = this.e;
        if (u() && ioVar2 != null) {
            ioVar2.a = false;
            ioVar2.setSelection(selectedItemPosition);
            if (ioVar2.getChoiceMode() != 0) {
                ioVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = this.d.getViewTreeObserver()) == null) {
            return;
        }
        fw fwVar = new fw(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(fwVar);
        v(new hn(this, fwVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    public final void n() {
        int i;
        Drawable drawableC = c();
        if (drawableC != null) {
            drawableC.getPadding(this.d.d);
            i = jt.q(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        hr hrVar = this.d;
        int paddingLeft = hrVar.getPaddingLeft();
        int paddingRight = hrVar.getPaddingRight();
        int width = hrVar.getWidth();
        int i2 = hrVar.c;
        if (i2 == -2) {
            int i3 = width - paddingLeft;
            int iA = hrVar.a(this.b, c());
            int i4 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (iA > i4) {
                iA = i4;
            }
            r(Math.max(iA, i3 - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = jt.q(this.d) ? i + (((width - paddingRight) - this.f) - this.s) : i + paddingLeft + this.s;
    }
}
