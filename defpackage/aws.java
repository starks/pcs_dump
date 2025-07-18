package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aws extends awn {
    final /* synthetic */ auh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aws(String str, String str2, auh auhVar) {
        super(str, str2);
        this.c = auhVar;
    }

    @Override // defpackage.awk
    public final void e(Context context) {
        asr asrVar = (asr) atc.a.createBuilder();
        atk atkVar = atk.PCS_NETWORK_USAGE_LOG_POLICY_INSPECTED;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        auh auhVar = this.c;
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
        context.startActivity(new Intent("android.intent.action.VIEW", awt.b));
    }
}
