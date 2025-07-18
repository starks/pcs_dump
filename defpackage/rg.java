package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rg {
    public final Bundle a;
    public boolean b;
    public boolean c;

    @Deprecated
    public int d;
    public CharSequence e;
    public PendingIntent f;
    public final qy[] g;
    private IconCompat h;

    public rg(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, qy[] qyVarArr, boolean z, boolean z2) {
        this.c = true;
        this.h = iconCompat;
        int i = iconCompat.b;
        if ((i == -1 ? ((Icon) iconCompat.c).getType() : i) == 2) {
            this.d = iconCompat.a();
        }
        this.e = ri.b(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = qyVarArr;
        this.b = true;
        this.c = true;
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.d) != 0) {
            this.h = IconCompat.b(null, "", i);
        }
        return this.h;
    }
}
