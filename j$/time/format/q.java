package j$.time.format;

import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
final class q extends k {
    private char g;
    private int h;

    q(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, B.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.k
    final k c() {
        if (this.e == -1) {
            return this;
        }
        return new q(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.k
    final k d(int i) {
        int i2 = this.e + i;
        return new q(this.g, this.h, this.b, this.c, i2);
    }

    @Override // j$.time.format.k, j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        j$.time.temporal.n nVarH;
        k nVar;
        k kVar;
        Locale localeC = vVar.c();
        TemporalUnit temporalUnit = j$.time.temporal.t.h;
        Objects.a(localeC, "locale");
        j$.time.temporal.t tVarF = j$.time.temporal.t.f(j$.time.d.SUNDAY.V(r0.getFirstDayOfWeek() - 1), Calendar.getInstance(new Locale(localeC.getLanguage(), localeC.getCountry())).getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            nVarH = tVarF.h();
        } else {
            if (c == 'Y') {
                j$.time.temporal.n nVarG = tVarF.g();
                int i = this.h;
                if (i == 2) {
                    nVar = new n(nVarG, n.h, this.e);
                    return nVar.g(vVar, sb);
                }
                kVar = new k(nVarG, i, 19, i < 4 ? B.NORMAL : B.EXCEEDS_PAD, this.e);
                nVar = kVar;
                return nVar.g(vVar, sb);
            }
            if (c == 'c' || c == 'e') {
                nVarH = tVarF.c();
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                nVarH = tVarF.i();
            }
        }
        kVar = new k(nVarH, this.b, this.c, B.NOT_NEGATIVE, this.e);
        nVar = kVar;
        return nVar.g(vVar, sb);
    }

    @Override // j$.time.format.k
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? B.NORMAL : B.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
