package defpackage;

import j$.util.DesugarCollections;
import java.text.ParseException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exs {
    static final els a = new els("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final ezw f;
    final evu g;

    public exs(Map map, boolean z, int i, int i2) throws NumberFormatException, ParseException {
        boolean z2;
        long j;
        ezw ezwVar;
        evu evuVar;
        this.b = ewp.d(map, "timeout");
        this.c = ewp.a(map, "waitForReady");
        Integer numC = ewp.c(map, "maxResponseMessageBytes");
        this.d = numC;
        if (numC != null) {
            clq.A(numC.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numC);
        }
        Integer numC2 = ewp.c(map, "maxRequestMessageBytes");
        this.e = numC2;
        if (numC2 != null) {
            clq.A(numC2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numC2);
        }
        Map mapI = z ? ewp.i(map, "retryPolicy") : null;
        if (mapI == null) {
            j = 0;
            ezwVar = null;
            z2 = true;
        } else {
            Integer numC3 = ewp.c(mapI, "maxAttempts");
            numC3.getClass();
            int iIntValue = numC3.intValue();
            clq.y(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            Long lD = ewp.d(mapI, "initialBackoff");
            lD.getClass();
            long jLongValue = lD.longValue();
            clq.z(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lD2 = ewp.d(mapI, "maxBackoff");
            lD2.getClass();
            z2 = true;
            long jLongValue2 = lD2.longValue();
            clq.z(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dB = ewp.b(mapI, "backoffMultiplier");
            dB.getClass();
            double dDoubleValue = dB.doubleValue();
            j = 0;
            clq.A(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dB);
            Long lD3 = ewp.d(mapI, "perAttemptRecvTimeout");
            clq.A(lD3 == null || lD3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lD3);
            Set setB = fbc.b(mapI, "retryableStatusCodes");
            dcr.Q(setB != null, "%s is required in retry policy", "retryableStatusCodes");
            dcr.Q(!setB.contains(eql.OK), "%s must not contain OK", "retryableStatusCodes");
            clq.w((lD3 == null && setB.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            ezwVar = new ezw(iMin, jLongValue, jLongValue2, dDoubleValue, lD3, setB);
        }
        this.f = ezwVar;
        Map mapI2 = z ? ewp.i(map, "hedgingPolicy") : null;
        if (mapI2 == null) {
            evuVar = null;
        } else {
            Integer numC4 = ewp.c(mapI2, "maxAttempts");
            numC4.getClass();
            int iIntValue2 = numC4.intValue();
            clq.y(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, i2);
            Long lD4 = ewp.d(mapI2, "hedgingDelay");
            lD4.getClass();
            long jLongValue3 = lD4.longValue();
            clq.z(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setB2 = fbc.b(mapI2, "nonFatalStatusCodes");
            if (setB2 == null) {
                setB2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(eql.class));
            } else {
                dcr.Q(!setB2.contains(eql.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            evuVar = new evu(iMin2, jLongValue3, setB2);
        }
        this.g = evuVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof exs)) {
            return false;
        }
        exs exsVar = (exs) obj;
        return a.g(this.b, exsVar.b) && a.g(this.c, exsVar.c) && a.g(this.d, exsVar.d) && a.g(this.e, exsVar.e) && a.g(this.f, exsVar.f) && a.g(this.g, exsVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("timeoutNanos", this.b);
        crtVarQ.e("waitForReady", this.c);
        crtVarQ.e("maxInboundMessageSize", this.d);
        crtVarQ.e("maxOutboundMessageSize", this.e);
        crtVarQ.e("retryPolicy", this.f);
        crtVarQ.e("hedgingPolicy", this.g);
        return crtVarQ.toString();
    }
}
