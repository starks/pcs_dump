package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahl {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public ahl() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahl)) {
            return false;
        }
        ahl ahlVar = (ahl) obj;
        return this.b == ahlVar.b && this.a.equals(ahlVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = ("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n";
        String strConcat = str.concat("    values:");
        for (String str2 : this.a.keySet()) {
            strConcat = strConcat + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return strConcat;
    }

    public ahl(View view) {
        this.b = view;
    }
}
