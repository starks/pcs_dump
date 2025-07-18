package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajy {
    public final Drawable a;
    public final Drawable b;
    public final String c;
    public final String d;

    public ajy(Drawable drawable, Drawable drawable2, String str, String str2) {
        this.a = drawable;
        this.b = drawable2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajy)) {
            return false;
        }
        ajy ajyVar = (ajy) obj;
        return fjs.c(this.a, ajyVar.a) && fjs.c(this.b, ajyVar.b) && fjs.c(this.c, ajyVar.c) && fjs.c(this.d, ajyVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "CollapseButtonResources(collapseIcon=" + this.a + ", expandIcon=" + this.b + ", collapseText=" + this.c + ", expandText=" + this.d + ")";
    }
}
