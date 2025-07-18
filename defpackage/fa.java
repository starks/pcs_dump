package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.as.oss.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fa extends BaseAdapter {
    final /* synthetic */ fb a;
    private int b = -1;

    public fa(fb fbVar) {
        this.a = fbVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fh getItem(int i) {
        ArrayList arrayListE = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (fh) arrayListE.get(i);
    }

    final void b() {
        ff ffVar = this.a.c;
        fh fhVar = ffVar.i;
        if (fhVar != null) {
            ArrayList arrayListE = ffVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((fh) arrayListE.get(i)) == fhVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((fs) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
