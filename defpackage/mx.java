package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mx extends ContextWrapper {
    private static Configuration b;
    public int a;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    public mx() {
        super(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.content.res.Resources b() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.e
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = defpackage.mx.b
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.mx.b = r1
        L16:
            android.content.res.Configuration r1 = defpackage.mx.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.e
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f = r0
        L32:
            android.content.res.Resources r3 = r3.f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx.b():android.content.res.Resources");
    }

    private final void c() {
        if (this.c == null) {
            this.c = b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    public final void a(Configuration configuration) {
        if (this.f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.e != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.e = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return b().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.d == null) {
            this.d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public mx(Context context, int i) {
        super(context);
        this.a = i;
    }
}
