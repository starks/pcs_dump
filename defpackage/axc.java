package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axc implements djj {
    @Override // defpackage.djj
    public final void a(Throwable th) {
        ((czl) ((czl) ((czl) axd.b.e()).h(th)).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogPreferenceFragment$1", "onFailure", '}', "NetworkUsageLogPreferenceFragment.java")).p("Failed to delete entities.");
    }

    @Override // defpackage.djj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() != -1) {
            ((czl) ((czl) axd.b.b()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogPreferenceFragment$1", "onSuccess", 117, "NetworkUsageLogPreferenceFragment.java")).r("Successfully removed %d entities", num);
        } else {
            ((czl) ((czl) axd.b.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogPreferenceFragment$1", "onSuccess", 119, "NetworkUsageLogPreferenceFragment.java")).p("Failed to delete old entities");
        }
    }
}
