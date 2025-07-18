package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etm extends elv {
    private final etn a;
    private final fbl b;

    public etm(etn etnVar, fbl fblVar) {
        etnVar.getClass();
        this.a = etnVar;
        fblVar.getClass();
        this.b = fblVar;
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    static void d(eno enoVar, int i, String str) {
        Level levelC = c(i);
        if (etn.a.isLoggable(levelC)) {
            etn.a(enoVar, levelC, str);
        }
    }

    private final boolean e(int i) {
        if (i == 1) {
            return false;
        }
        synchronized (this.a.b) {
        }
        return false;
    }

    @Override // defpackage.elv
    public final void a(int i, String str) {
        d(this.a.c, i, str);
        if (!e(i) || i == 1) {
            return;
        }
        etn etnVar = this.a;
        enh enhVar = new enh();
        enhVar.a = str;
        int i2 = i - 1;
        enhVar.b = i2 != 2 ? i2 != 3 ? eni.CT_INFO : eni.CT_ERROR : eni.CT_WARNING;
        enhVar.b(this.b.a());
        etnVar.c(enhVar.a());
    }

    @Override // defpackage.elv
    public final void b(int i, String str, Object... objArr) {
        a(i, (e(i) || etn.a.isLoggable(c(i))) ? MessageFormat.format(str, objArr) : null);
    }
}
