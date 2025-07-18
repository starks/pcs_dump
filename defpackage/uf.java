package defpackage;

import android.view.View;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uf extends uk {
    public uf(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.uk
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(uq.f(view));
    }

    @Override // defpackage.uk
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        uq.d(view, ((Boolean) obj).booleanValue());
    }
}
