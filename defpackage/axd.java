package defpackage;

import android.content.res.Resources;
import com.android.settingslib.widget.MainSwitchBar;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axd extends awd implements akc {
    public static final czn b = czn.j("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogPreferenceFragment");
    public auh ab;
    public MainSwitchPreference c;
    public avm d;

    @Override // defpackage.akc
    public final void aO(boolean z) {
        if (z) {
            auh auhVar = this.ab;
            asr asrVar = (asr) atc.a.createBuilder();
            atk atkVar = atk.PCS_NETWORK_USAGE_LOG_OPTED_IN;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            atc atcVar = (atc) asrVar.a;
            atcVar.c = atkVar.H;
            atcVar.b |= 1;
            auhVar.a((atc) asrVar.z());
            if (B().d(R.id.log_fragment_container) != null) {
                return;
            }
            new d(B()).k(R.id.log_fragment_container, new awz()).j();
            return;
        }
        ae aeVarY = y();
        aeVarY.getClass();
        sx sxVar = new sx(aeVarY);
        cg cgVar = (cg) sxVar.b;
        cgVar.d = cgVar.a.getText(R.string.disable_network_usage_log_alert_title);
        cg cgVar2 = (cg) sxVar.b;
        cgVar2.f = cgVar2.a.getText(R.string.disable_network_usage_log_alert_message);
        axa axaVar = new axa(this, 0);
        cg cgVar3 = (cg) sxVar.b;
        cgVar3.g = cgVar3.a.getText(R.string.disable_network_usage_log_alert_button_turn_off);
        cg cgVar4 = (cg) sxVar.b;
        cgVar4.h = axaVar;
        axa axaVar2 = new axa(this, 2);
        cgVar4.i = cgVar4.a.getText(R.string.disable_network_usage_log_alert_button_cancel);
        cg cgVar5 = (cg) sxVar.b;
        cgVar5.j = axaVar2;
        cgVar5.l = new axb(this, 0);
        sxVar.d().show();
    }

    @Override // defpackage.abp
    public final void ap(String str) throws Resources.NotFoundException {
        an(R.xml.network_usage_log_settings, str);
        MainSwitchPreference mainSwitchPreference = (MainSwitchPreference) aT(H(R.string.pref_network_usage_log_enabled_key));
        mainSwitchPreference.getClass();
        this.c = mainSwitchPreference;
        if (!mainSwitchPreference.c.contains(this)) {
            mainSwitchPreference.c.add(this);
        }
        MainSwitchBar mainSwitchBar = mainSwitchPreference.d;
        if (mainSwitchBar != null) {
            mainSwitchBar.a(this);
        }
    }

    public final void as() {
        this.c.k(true);
    }
}
