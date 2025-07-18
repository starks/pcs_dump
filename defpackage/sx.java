package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sx {
    public final int a;
    public final Object b;

    public sx(int i) {
        this.b = null;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final sy[] a() {
        return (sy[]) this.b.get(0);
    }

    public final int b(int i) {
        return ((int[]) this.b)[i + this.a];
    }

    public final void c(int i, int i2) {
        ((int[]) this.b)[i + this.a] = i2;
    }

    public final ck d() {
        ListAdapter ciVar;
        ck ckVar = new ck(((cg) this.b).a, this.a);
        cj cjVar = ckVar.a;
        cg cgVar = (cg) this.b;
        View view = cgVar.e;
        if (view != null) {
            cjVar.x = view;
        } else {
            CharSequence charSequence = cgVar.d;
            if (charSequence != null) {
                cjVar.a(charSequence);
            }
            Drawable drawable = cgVar.c;
            if (drawable != null) {
                cjVar.t = drawable;
                cjVar.s = 0;
                ImageView imageView = cjVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    cjVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cgVar.f;
        if (charSequence2 != null) {
            cjVar.e = charSequence2;
            TextView textView = cjVar.w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = cgVar.g;
        if (charSequence3 != null) {
            cjVar.e(-1, charSequence3, cgVar.h);
        }
        CharSequence charSequence4 = cgVar.i;
        if (charSequence4 != null) {
            cjVar.e(-2, charSequence4, cgVar.j);
        }
        if (cgVar.n != null || cgVar.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cgVar.b.inflate(cjVar.C, (ViewGroup) null);
            if (cgVar.s) {
                ciVar = new cd(cgVar, cgVar.a, cjVar.D, cgVar.n, alertController$RecycleListView);
            } else {
                int i = cgVar.t ? cjVar.E : cjVar.F;
                ciVar = cgVar.o;
                if (ciVar == null) {
                    ciVar = new ci(cgVar.a, i, cgVar.n);
                }
            }
            cjVar.y = ciVar;
            cjVar.z = cgVar.u;
            if (cgVar.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new ce(cgVar, cjVar));
            } else if (cgVar.v != null) {
                alertController$RecycleListView.setOnItemClickListener(new cf(cgVar, alertController$RecycleListView, cjVar));
            }
            if (cgVar.t) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (cgVar.s) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            cjVar.f = alertController$RecycleListView;
        }
        View view2 = cgVar.q;
        if (view2 != null) {
            cjVar.g = view2;
            cjVar.h = false;
        }
        ckVar.setCancelable(true);
        ckVar.setCanceledOnTouchOutside(true);
        ckVar.setOnCancelListener(((cg) this.b).l);
        ckVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = ((cg) this.b).m;
        if (onKeyListener != null) {
            ckVar.setOnKeyListener(onKeyListener);
        }
        return ckVar;
    }

    public final void e(Drawable drawable) {
        ((cg) this.b).c = drawable;
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        cg cgVar = (cg) this.b;
        cgVar.g = charSequence;
        cgVar.h = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        ((cg) this.b).d = charSequence;
    }

    public sx(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public sx(List list) {
        this.a = 0;
        this.b = list;
    }

    public sx(Context context) {
        int iA = ck.a(context, 0);
        this.b = new cg(new ContextThemeWrapper(context, ck.a(context, iA)));
        this.a = iA;
    }

    @Deprecated
    public sx(sy[] syVarArr) {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public sx(int i, byte[] bArr) {
        int[] iArr = new int[i];
        this.b = iArr;
        this.a = iArr.length >> 1;
    }
}
