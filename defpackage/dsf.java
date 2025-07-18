package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsf implements dsk {
    public final String a;
    public final dwt b;
    public final eea c;
    public final dvb d;
    public final dvn e;
    public final Integer f;

    private dsf(String str, dwt dwtVar, eea eeaVar, dvb dvbVar, dvn dvnVar, Integer num) {
        this.a = str;
        this.b = dwtVar;
        this.c = eeaVar;
        this.d = dvbVar;
        this.e = dvnVar;
        this.f = num;
    }

    public static dsf a(String str, eea eeaVar, dvb dvbVar, dvn dvnVar, Integer num) throws GeneralSecurityException {
        if (dvnVar == dvn.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new dsf(str, dsp.a(str), eeaVar, dvbVar, dvnVar, num);
    }
}
