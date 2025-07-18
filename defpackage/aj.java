package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aj extends ag {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final ax e = new ax(null);

    public aj(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.ag
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.ag
    public boolean b() {
        throw null;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object f();

    public void k() {
        throw null;
    }

    public void q(PrintWriter printWriter, String[] strArr) {
        throw null;
    }
}
