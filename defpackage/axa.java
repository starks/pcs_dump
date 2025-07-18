package defpackage;

import android.content.DialogInterface;
import com.google.android.as.oss.R;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class axa implements DialogInterface.OnClickListener {
    public final /* synthetic */ ab a;
    private final /* synthetic */ int b;

    public axa(abc abcVar, int i) {
        this.b = i;
        this.a = abcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                ((axd) this.a).as();
                return;
            }
            ab abVar = this.a;
            ((abc) abVar).ab = i;
            ((abj) abVar).af = -1;
            dialogInterface.dismiss();
            return;
        }
        axd axdVar = (axd) this.a;
        auh auhVar = axdVar.ab;
        asr asrVar = (asr) atc.a.createBuilder();
        atk atkVar = atk.PCS_NETWORK_USAGE_LOG_OPTED_OUT;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
        ((czl) ((czl) axd.b.c()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogPreferenceFragment", "onSwitchedOff", 96, "NetworkUsageLogPreferenceFragment.java")).p("NetworkUsageLog switched off by user.");
        axdVar.c.T(false);
        ax axVarB = axdVar.B();
        ab abVarD = axVarB.d(R.id.log_fragment_container);
        if (abVarD != null) {
            new d(axVarB).b(abVarD).j();
        }
        axdVar.d.c(Instant.now(), new axc());
    }

    public /* synthetic */ axa(axd axdVar, int i) {
        this.b = i;
        this.a = axdVar;
    }
}
