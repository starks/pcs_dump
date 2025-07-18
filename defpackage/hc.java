package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hc extends ImageView {
    private final gs a;
    private final hb b;
    private boolean c;

    public hc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.a();
        }
        hb hbVar = this.b;
        if (hbVar != null) {
            hbVar.b();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        hb hbVar = this.b;
        if (hbVar != null) {
            hbVar.b();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        hb hbVar = this.b;
        if (hbVar != null && drawable != null && !this.c) {
            hbVar.d(drawable);
        }
        super.setImageDrawable(drawable);
        hb hbVar2 = this.b;
        if (hbVar2 != null) {
            hbVar2.b();
            if (this.c) {
                return;
            }
            this.b.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        hb hbVar = this.b;
        if (hbVar != null) {
            hbVar.e(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        hb hbVar = this.b;
        if (hbVar != null) {
            hbVar.b();
        }
    }

    public hc(Context context, AttributeSet attributeSet, int i) {
        super(lb.a(context), attributeSet, i);
        this.c = false;
        kz.d(this, getContext());
        gs gsVar = new gs(this);
        this.a = gsVar;
        gsVar.b(attributeSet, i);
        hb hbVar = new hb(this);
        this.b = hbVar;
        hbVar.c(attributeSet, i);
    }
}
