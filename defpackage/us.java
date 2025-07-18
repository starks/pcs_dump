package defpackage;

import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class us {
    public us() {
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static CharSequence b(View view) {
        return view.getStateDescription();
    }

    static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static void d(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void e(View view, yz yzVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, yzVar);
    }

    public static void f(agz agzVar, ahc ahcVar) {
        agzVar.b(ahcVar);
    }

    public static void g(agz agzVar, ahc ahcVar) {
        agzVar.f(ahcVar);
    }

    public static void h(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.transition_current_scene, null);
    }

    public static Path i(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public us(byte[] bArr) {
    }

    public us(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this();
    }
}
