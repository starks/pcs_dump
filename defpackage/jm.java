package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jm extends io {
    final int c;
    final int d;
    public jl e;
    private MenuItem f;

    public jm(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.io
    public final /* bridge */ /* synthetic */ int b(int i, int i2) {
        return super.b(i, i2);
    }

    @Override // defpackage.io, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        fc fcVar;
        int headersCount;
        jl jlVar;
        jl jlVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                fcVar = (fc) headerViewListAdapter.getWrappedAdapter();
            } else {
                fcVar = (fc) adapter;
                headersCount = 0;
            }
            fh item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= fcVar.getCount()) ? null : fcVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                ff ffVar = fcVar.a;
                if (menuItem != null && (jlVar2 = ((jn) this.e).a) != null) {
                    ((ey) jlVar2).a.a.removeCallbacksAndMessages(ffVar);
                }
                this.f = item;
                if (item != null && (jlVar = ((jn) this.e).a) != null) {
                    ey eyVar = (ey) jlVar;
                    eyVar.a.a.removeCallbacksAndMessages(null);
                    int size = eyVar.a.b.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (ffVar == ((cgm) eyVar.a.b.get(i2)).c) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        eyVar.a.a.postAtTime(new bsk(eyVar, i3 < eyVar.a.b.size() ? (cgm) eyVar.a.b.get(i3) : null, item, ffVar, 1), ffVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (fc) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (fc) adapter).a.i(false);
        return true;
    }
}
