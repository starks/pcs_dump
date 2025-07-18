package defpackage;

import android.view.View;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ui extends uk {
    public ui(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.uk
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(uq.e(view));
    }

    @Override // defpackage.uk
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        uq.b(view, ((Boolean) obj).booleanValue());
    }
}
