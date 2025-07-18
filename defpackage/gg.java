package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gg extends View {
    public gg(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}
