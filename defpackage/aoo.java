package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoo {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/common/consent/GlobalUsageReportingOptedInStateImpl");
    private final Context b;

    public aoo(Context context) {
        this.b = context;
    }

    public final boolean a() {
        try {
            return Settings.Global.getInt(this.b.getContentResolver(), "multi_cb") == 1;
        } catch (Settings.SettingNotFoundException unused) {
            ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/common/consent/GlobalUsageReportingOptedInStateImpl", "isOptedIn", 25, "GlobalUsageReportingOptedInStateImpl.java")).p("Consent value not found");
            return false;
        }
    }
}
