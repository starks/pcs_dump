package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afn extends SQLiteOpenHelper {
    public static final ur a = new ur(null);
    private final Context b;
    private final afc c;
    private boolean d;
    private final afr e;
    private boolean f;
    private final ekb g;

    public afn(Context context, String str, final ekb ekbVar, final afc afcVar) {
        String string;
        super(context, str, null, afcVar.b, new DatabaseErrorHandler() { // from class: afk
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                afj afjVarH = ur.h(ekbVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.y(afjVarH, "Corruption reported by sqlite on database: ", ".path"));
                if (!afjVarH.i()) {
                    String strA = afjVarH.a();
                    if (strA != null) {
                        afc.e(strA);
                        return;
                    }
                    return;
                }
                List listB = null;
                try {
                    try {
                        listB = afjVarH.b();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        afjVarH.close();
                    } catch (IOException unused2) {
                    }
                    if (listB == null) {
                        String strA2 = afjVarH.a();
                        if (strA2 != null) {
                            afc.e(strA2);
                            return;
                        }
                        return;
                    }
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        afc.e((String) obj);
                    }
                } catch (Throwable th) {
                    if (listB != null) {
                        Iterator it2 = listB.iterator();
                        while (it2.hasNext()) {
                            Object obj2 = ((Pair) it2.next()).second;
                            obj2.getClass();
                            afc.e((String) obj2);
                        }
                    } else {
                        String strA3 = afjVarH.a();
                        if (strA3 != null) {
                            afc.e(strA3);
                        }
                    }
                    throw th;
                }
            }
        });
        this.b = context;
        this.g = ekbVar;
        this.c = afcVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.e = new afr(string, context.getCacheDir(), false);
    }

    private final SQLiteDatabase c(boolean z) {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final afb a(boolean z) throws Throwable {
        SQLiteDatabase sQLiteDatabaseC;
        afb afbVarB;
        File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z2 = this.f;
            if (databaseName != null && !z2 && (parentFile = this.b.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c(true);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c(true);
                } catch (Throwable th) {
                    if (!(th instanceof afl)) {
                        throw th;
                    }
                    afl aflVar = th;
                    Throwable th2 = aflVar.a;
                    int i = aflVar.b;
                    int i2 = afm.a;
                    int i3 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3) {
                        throw th2;
                    }
                    if (i3 != 4) {
                        throw new ffq();
                    }
                    if (th2 instanceof SQLiteException) {
                        throw th2;
                    }
                    throw th2;
                }
            }
            if (this.d) {
                close();
                afbVarB = a(true);
            } else {
                afbVarB = b(sQLiteDatabaseC);
            }
            return afbVarB;
        } finally {
            this.e.b();
        }
    }

    public final afj b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return ur.h(this.g, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            afr afrVar = this.e;
            Map map = afr.a;
            boolean z = afrVar.b;
            afrVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.c.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            b(sQLiteDatabase);
        } catch (Throwable th) {
            throw new afl(afm.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.a(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new afl(afm.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.c.b(b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new afl(afm.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d) {
            try {
                this.c.c(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new afl(afm.e, th);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.c.d(b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new afl(afm.c, th);
        }
    }
}
