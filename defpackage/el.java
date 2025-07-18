package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class el implements eh {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final oc d = new oc();

    public el(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        fu fuVar = new fu(this.b, menu);
        this.d.put(menu, fuVar);
        return fuVar;
    }

    @Override // defpackage.eh
    public final void a(ei eiVar) {
        this.a.onDestroyActionMode(e(eiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eh
    public final boolean b(ei eiVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(e(eiVar), new fm(this.b, menuItem));
    }

    @Override // defpackage.eh
    public final boolean c(ei eiVar, Menu menu) {
        return this.a.onCreateActionMode(e(eiVar), f(menu));
    }

    @Override // defpackage.eh
    public final boolean d(ei eiVar, Menu menu) {
        return this.a.onPrepareActionMode(e(eiVar), f(menu));
    }

    public final ActionMode e(ei eiVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            em emVar = (em) this.c.get(i);
            if (emVar != null && emVar.b == eiVar) {
                return emVar;
            }
        }
        em emVar2 = new em(this.b, eiVar);
        this.c.add(emVar2);
        return emVar2;
    }
}
