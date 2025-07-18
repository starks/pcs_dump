package defpackage;

import android.app.StatsCursor;
import android.app.StatsManager;
import android.os.OutcomeReceiver;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arb implements OutcomeReceiver {
    final /* synthetic */ csf a;
    final /* synthetic */ arc b;
    final /* synthetic */ bua c;

    public arb(arc arcVar, csf csfVar, bua buaVar) {
        this.a = csfVar;
        this.c = buaVar;
        this.b = arcVar;
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        atk atkVar;
        StatsManager.StatsQueryException statsQueryException = (StatsManager.StatsQueryException) th;
        if (statsQueryException.getMessage() != null && statsQueryException.getMessage().contains("no such table: metric_")) {
            this.c.b(new apj());
            return;
        }
        this.c.a(27, "Statsd query failed: ".concat(String.valueOf(statsQueryException.getLocalizedMessage())));
        arc arcVar = this.b;
        arcVar.e(att.PCS_STATSMANAGER_QUERY_FAILURE_LATENCY_MS, arcVar.b(this.a.a(TimeUnit.MILLISECONDS)));
        this.b.d(atk.PCS_TRAINING_STATS_QUERY_EXCEPTION);
        arc arcVar2 = this.b;
        String message = statsQueryException.getMessage();
        if (message != null) {
            czc czcVarListIterator = arc.a.entrySet().listIterator();
            while (true) {
                if (!czcVarListIterator.hasNext()) {
                    atkVar = atk.PCS_TRAINING_STATS_EXCEPTION_UNKNOWN;
                    break;
                }
                Map.Entry entry = (Map.Entry) czcVarListIterator.next();
                if (message.contains((CharSequence) entry.getKey())) {
                    atkVar = (atk) entry.getValue();
                    break;
                }
            }
        } else {
            atkVar = atk.PCS_TRAINING_STATS_EXCEPTION_UNKNOWN;
        }
        arcVar2.d(atkVar);
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        csf csfVar = this.a;
        this.b.e(att.PCS_STATSMANAGER_QUERY_SUCCESS_LATENCY_MS, this.b.b(csfVar.a(TimeUnit.MILLISECONDS)));
        this.c.b(new aqz((StatsCursor) obj));
        this.b.d(atk.PCS_TRAINING_STATS_QUERY_SUCCESS);
    }
}
