package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dya extends SQLiteOpenHelper {
    final /* synthetic */ dyb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(dyb dybVar, Context context) {
        super(context, (String) null, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = dybVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(this.a.b.e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("In-memory database will never call onUpgrade.");
    }
}
