package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lb extends ContextWrapper {
    private static final Object a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof lb) && !(context.getResources() instanceof ld)) {
            context.getResources();
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        throw null;
    }
}
