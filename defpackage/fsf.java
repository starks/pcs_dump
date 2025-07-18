package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsf implements fqr {
    private final fqi a;

    public fsf(fqi fqiVar) {
        this.a = fqiVar;
    }

    @Override // defpackage.fqr
    public final frb a(fsm fsmVar) {
        boolean z;
        frd frdVar;
        fqx fqxVarA = fsmVar.a();
        fqw fqwVar = new fqw(fqxVarA);
        fqz fqzVar = fqxVarA.d;
        if (fqzVar != null) {
            fqs fqsVarB = fqzVar.b();
            if (fqsVarB != null) {
                fqwVar.a("Content-Type", fqsVarB.c);
            }
            fqwVar.a("Content-Length", String.valueOf(fqzVar.a()));
            fqwVar.f("Transfer-Encoding");
        }
        int i = 0;
        if (fqxVarA.a("Host") == null) {
            fqwVar.a("Host", frh.k(fqxVarA.a, false));
        }
        if (fqxVarA.a("Connection") == null) {
            fqwVar.a("Connection", "Keep-Alive");
        }
        if (fqxVarA.a("Accept-Encoding") == null && fqxVarA.a("Range") == null) {
            fqwVar.a("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List listA = this.a.a();
        if (!listA.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listA) {
                int i2 = i + 1;
                if (i < 0) {
                    ffh.D();
                }
                fqg fqgVar = (fqg) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(fqgVar.e);
                sb.append('=');
                sb.append(fqgVar.f);
                i = i2;
            }
            fqwVar.a("Cookie", sb.toString());
        }
        if (fqxVarA.a("User-Agent") == null) {
            fqwVar.a("User-Agent", "okhttp/4.12.0");
        }
        frb frbVarB = fsmVar.b(fqwVar.d());
        fsk.a(this.a, fqxVarA.a, frbVarB.f);
        fra fraVarE = new fra(frbVarB).e(fqxVarA);
        if (z && fjz.q("gzip", frb.a(frbVarB, "Content-Encoding")) && fsk.b(frbVarB) && (frdVar = frbVarB.g) != null) {
            fvr fvrVar = new fvr(frdVar.b());
            fraVarE.b(frbVarB.f.g().l("Content-Encoding").l("Content-Length").h());
            frb.a(frbVarB, "Content-Type");
            fraVarE.d = new fsn(-1L, new fvz(fvrVar));
        }
        return fraVarE.f();
    }
}
