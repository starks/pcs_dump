package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afj implements afb {
    public final SQLiteDatabase c;
    public static final uq d = new uq(null);
    private static final String[] e = new String[0];
    public static final ffo a = ffh.d(ffp.c, new afi(0));
    public static final ffo b = ffh.d(ffp.c, new afi(2));

    public afj(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    public static final Method l() {
        Class<?> returnType;
        try {
            Method methodJ = uq.j();
            if (methodJ == null || (returnType = methodJ.getReturnType()) == null) {
                return null;
            }
            return returnType.getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.afb
    public final String a() {
        return this.c.getPath();
    }

    @Override // defpackage.afb
    public final List b() {
        return this.c.getAttachedDbs();
    }

    @Override // defpackage.afb
    public final void c() {
        this.c.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.afb
    public final void d() {
        this.c.beginTransactionNonExclusive();
    }

    @Override // defpackage.afb
    public final void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (uq.i() == null || uq.j() == null) {
            c();
            return;
        }
        Method methodI = uq.i();
        methodI.getClass();
        Method methodJ = uq.j();
        methodJ.getClass();
        Object objInvoke = methodJ.invoke(this.c, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodI.invoke(objInvoke, 0, null, 0, null);
    }

    @Override // defpackage.afb
    public final void f() {
        this.c.endTransaction();
    }

    @Override // defpackage.afb
    public final void g() {
        this.c.setTransactionSuccessful();
    }

    @Override // defpackage.afb
    public final boolean h() {
        return this.c.inTransaction();
    }

    @Override // defpackage.afb
    public final boolean i() {
        return this.c.isOpen();
    }

    @Override // defpackage.afb
    public final afq j(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.c.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new afq(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.afb
    public final Cursor k(fuu fuuVar) {
        final afg afgVar = new afg(fuuVar);
        Cursor cursorRawQueryWithFactory = this.c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: afh
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                ffo ffoVar = afj.a;
                sQLiteQuery.getClass();
                ((afg) afgVar).a.x(new afp(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fuuVar.w(), e, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }
}
