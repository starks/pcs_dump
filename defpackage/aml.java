package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aml implements aob {
    public final /* synthetic */ anx a;
    private final /* synthetic */ int b;

    public /* synthetic */ aml(anx anxVar, int i) {
        this.b = i;
        this.a = anxVar;
    }

    @Override // defpackage.aob
    public final void a(List list) {
        switch (this.b) {
            case 0:
                if (vr.f(list, "PcsAi__")) {
                    this.a.c();
                    break;
                }
                break;
            case 1:
                if (vr.f(list, "StatsLog__")) {
                    this.a.c();
                    break;
                }
                break;
            case 2:
                if (vr.f(list, "PcsAttestationMeasurement__")) {
                    this.a.c();
                    break;
                }
                break;
            case 3:
                if (vr.f(list, "PcsCommon__")) {
                    this.a.c();
                    break;
                }
                break;
            case 4:
                if (vr.f(list, "PcsPolicy__")) {
                    this.a.c();
                    break;
                }
                break;
            case 5:
                if (vr.f(list, "PlatformLogging__")) {
                    this.a.c();
                    break;
                }
                break;
            case 6:
                if (vr.f(list, "PcsHttp__")) {
                    this.a.c();
                    break;
                }
                break;
            case 7:
                if (vr.f(list, "AstreaNetworkUsageLog__")) {
                    this.a.c();
                    break;
                }
                break;
            case 8:
                anx anxVar = this.a;
                if (list.contains(((bal) anxVar).a.a)) {
                    anxVar.c();
                    break;
                }
                break;
            case 9:
                if (vr.f(list, "ProtectedDownload__")) {
                    this.a.c();
                    break;
                }
                break;
            default:
                if (vr.f(list, "PcsSurvey__")) {
                    this.a.c();
                    break;
                }
                break;
        }
    }
}
