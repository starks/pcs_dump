package defpackage;

import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amo extends IAiCoreServiceProviderCallback.Stub {
    final /* synthetic */ amp a;

    public amo(amp ampVar) {
        this.a = ampVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
    public final void onServiceProviderFailure(int i, String str) {
        this.a.a(String.format(Locale.US, "Failed to get AICoreService. Error code [%d], error message [%s]", Integer.valueOf(i), str), true);
    }

    @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
    public final void onServiceProviderSuccess(IAICoreService iAICoreService) throws RemoteException {
        this.a.d.a(iAICoreService);
        try {
            iAICoreService.asBinder().linkToDeath(new amn(this, 0), 0);
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) amp.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/AiCoreServiceConnection$1", "onServiceProviderSuccess", (char) 138, "AiCoreServiceConnection.java")).p("Unable to set death callback.");
        }
    }
}
