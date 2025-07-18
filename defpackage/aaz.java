package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.as.oss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaz extends Preference {
    private long a;

    public aaz(Context context, List list, long j) {
        super(context);
        this.A = R.layout.expand_button;
        C(R.drawable.ic_arrow_down_24dp);
        F(this.j.getString(R.string.expand_button_title));
        D(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.o;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.C)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        if (this.D != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(this.p, string)) {
            this.p = string;
            d();
        }
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        super.a(acaVar);
        acaVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long aL() {
        return this.a;
    }
}
