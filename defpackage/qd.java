package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qd extends View {
    public int[] c;
    public int d;
    protected final Context e;
    public String f;
    public final HashMap g;
    public pk h;

    public qd(Context context) {
        super(context);
        this.c = new int[32];
        this.g = new HashMap();
        this.e = context;
        c();
    }

    private final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.d + 1;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            this.c = Arrays.copyOf(iArr, length + length);
        }
        int[] iArr2 = this.c;
        int i3 = this.d;
        iArr2[i3] = i;
        this.d = i3 + 1;
    }

    public final int d(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.e.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final void e(String str) {
        this.f = null;
    }

    public final void f(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    public final void g() {
        if (this.h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof qf) {
            ((qf) layoutParams).av = this.h;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null) {
            b(i);
        }
    }

    protected void c() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void a(pg pgVar, boolean z) {
    }
}
