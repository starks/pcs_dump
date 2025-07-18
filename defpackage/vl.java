package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class vl extends vk {
    public vl(vs vsVar, WindowInsets windowInsets) {
        super(vsVar, windowInsets);
    }

    @Override // defpackage.vj, defpackage.vp
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl)) {
            return false;
        }
        vl vlVar = (vl) obj;
        return Objects.equals(this.a, vlVar.a) && Objects.equals(this.b, vlVar.b) && k(this.c, vlVar.c);
    }

    @Override // defpackage.vp
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.vp
    public ts p() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ts(displayCutout);
    }

    @Override // defpackage.vp
    public vs q() {
        return vs.m(this.a.consumeDisplayCutout());
    }
}
