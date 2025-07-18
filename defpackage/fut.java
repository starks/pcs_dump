package defpackage;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fut extends Handler {
    public static final fut a = new fut();

    private fut() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        logRecord.getClass();
        fus fusVar = fus.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String strM = (String) fus.c.get(loggerName);
        if (strM == null) {
            strM = fjz.m(loggerName, 23);
        }
        if (Log.isLoggable(strM, i)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iU = fjz.u(message, '\n', i2, 4);
                if (iU == -1) {
                    iU = length;
                }
                while (true) {
                    iMin = Math.min(iU, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    strSubstring.getClass();
                    Log.println(i, strM, strSubstring);
                    if (iMin >= iU) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
