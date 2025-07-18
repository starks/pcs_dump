package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afc {
    public final int b;

    public afc(int i) {
        this.b = i;
    }

    public static final void e(String str) {
        if (fjz.q(str, ":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int iA = fjs.a(str.charAt(true != z ? i : length), 32);
            if (z) {
                if (iA > 0) {
                    break;
                } else {
                    length--;
                }
            } else if (iA > 0) {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract void a(afb afbVar);

    public void b(afb afbVar, int i, int i2) {
        throw null;
    }

    public void c(afb afbVar) {
        throw null;
    }

    public abstract void d(afb afbVar, int i, int i2);
}
