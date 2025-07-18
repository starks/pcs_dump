package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmp extends tp {
    final /* synthetic */ CheckableImageButton a;

    public cmp(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.tp
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.tp
    public final void b(View view, vw vwVar) {
        super.b(view, vwVar);
        vwVar.e(this.a.b);
        vwVar.a.setChecked(this.a.a);
    }
}
