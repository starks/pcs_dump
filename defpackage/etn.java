package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etn {
    static final Logger a = Logger.getLogger(elv.class.getName());
    public final Object b = new Object();
    public final eno c;
    public final Collection d;

    public etn(eno enoVar, long j, String str) {
        enoVar.getClass();
        this.c = enoVar;
        this.d = null;
        enh enhVar = new enh();
        enhVar.a = str.concat(" created");
        enhVar.b = eni.CT_INFO;
        enhVar.b(j);
        b(enhVar.a());
    }

    static void a(eno enoVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + String.valueOf(enoVar) + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(enj enjVar) {
        int iOrdinal = enjVar.b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        c(enjVar);
        a(this.c, level, enjVar.a);
    }

    final void c(enj enjVar) {
        synchronized (this.b) {
        }
    }
}
