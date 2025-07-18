package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.as.oss.R;
import j$.util.Collection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vr {
    public vr() {
    }

    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static void b(View view) {
        Iterator itA = new ux(new fic(view, null), 3).a();
        while (itA.hasNext()) {
            g((View) itA.next()).f();
        }
    }

    public static Boolean c(aof aofVar, aoc aocVar) {
        return aofVar.a(aocVar, aocVar.b);
    }

    public static Integer d(aof aofVar, aod aodVar) {
        return aofVar.b(aodVar, aodVar.b);
    }

    public static Long e(aof aofVar, aoe aoeVar) {
        return aofVar.c(aoeVar, aoeVar.b);
    }

    public static boolean f(Collection collection, String str) {
        return Collection.EL.stream(collection).anyMatch(new awv(str, 1));
    }

    public static brb g(View view) {
        brb brbVar = (brb) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (brbVar != null) {
            return brbVar;
        }
        brb brbVar2 = new brb((char[]) null);
        view.setTag(R.id.pooling_container_listener_holder_tag, brbVar2);
        return brbVar2;
    }

    public vr(byte[] bArr) {
    }
}
