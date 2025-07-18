package defpackage;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.settingslib.widget.FooterPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajz extends ClickableSpan {
    final /* synthetic */ Intent a;
    final /* synthetic */ FooterPreference b;

    public ajz(FooterPreference footerPreference, Intent intent) {
        this.a = intent;
        this.b = footerPreference;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.j.startActivity(this.a);
    }
}
