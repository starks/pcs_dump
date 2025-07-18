package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaw implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        io ioVar;
        if (this.b != 0) {
            if (i == -1 || (ioVar = ((jk) this.a).e) == null) {
                return;
            }
            ioVar.a = false;
            return;
        }
        if (i >= 0) {
            String string = ((ListPreference) this.a).h[i].toString();
            if (string.equals(((ListPreference) this.a).i)) {
                return;
            }
            ((ListPreference) this.a).n(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
